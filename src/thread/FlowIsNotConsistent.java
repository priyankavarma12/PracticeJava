package thread;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FlowIsNotConsistent {

    public static void main(String[] args) {
        System.out.println("starting main thread :");
        CompletableFuture.supplyAsync( () -> { System.out.println("supplyAsync thread name : "+ Thread.currentThread().getName());
            return getInt();
        }).thenAccept( value -> {
            System.out.println("thenAccept Thread name : "+Thread.currentThread().getName());
            System.out.println("get value :: "+value);
        } );
        System.out.println("Completing main");
    }

    private static int getInt(){
        System.out.println("getInt thread name :: "+Thread.currentThread().getName());
        slowItDown( 8 );
        return new Random().nextInt();
    }

    private static int lengthyProcess(){
        System.out.println("Starting LengthyProcess ");
        System.out.println("LengthyProcess Thread name : "+Thread.currentThread().getName());
        slowItDown( 5 );
        System.out.println("Completing lengthyProcess");
        return 20;
    }
    private static void slowItDown(int time){
        System.out.println("slowItDown Thread name : "+Thread.currentThread().getName());
        try {
            System.out.println("Thread Sleeping");
            Thread.sleep( time * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
