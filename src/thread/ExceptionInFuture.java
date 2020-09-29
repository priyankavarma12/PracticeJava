package thread;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class ExceptionInFuture {

    public static void main(String[] args) {
        System.out.println("starting main thread ");
        CompletableFuture.supplyAsync( () -> explode() )
               /* .exceptionally( throwable -> {
                    System.out.println("in exceptionally");
                    return handleExplosion( 03 );
                })*/. thenApply( value -> {
                    System.out.println("thenApply1  value :"+value);
                    return value;
                }).exceptionally( throwable -> {
            System.out.println("in exceptionally");
            return handleExplosion( 23 );
        } ). thenApply( value -> {
            System.out.println("thenApply2 value : "+value);
            return value;
        } );
        slowItDown( 10 );
        System.out.println("Completing main");

    }

    /*Method exceptionally() is used to handle exceptions thrown when processing a Future. This method takes a Function<Throwable, ? extends T> fn).
    Throwable is the exception thrown from the Future and T is the return type. The aim of exceptionally is to handle the exception if thrown from the previous Future and then run the program normally. */
    private static int explode(){
        System.out.println("exploding");
        throw new RuntimeException();
    }

    private static int handleExplosion(int value){
        return value;
    }

    private static void slowItDown(int time){
        System.out.println("slowItDown thread name : "+Thread.currentThread().getName());
        try {
            System.out.println("Thread Sleeping");
            Thread.sleep( time * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
