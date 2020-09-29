package thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEg {

    public static void main(String[] args) {
        System.out.println("Starting the main");
        System.out.println("Main Thread Name :: "+Thread.currentThread().getName());
        supplyAsyncThenApply();
        System.out.println("Completing Main");

    }

    private static void supplyAsync(){
        CompletableFuture.supplyAsync( CompletableFutureEg::lengthyProcess )
                .thenAccept( value -> {
                    System.out.println("thenAccept Thread Name ::"+Thread.currentThread().getName());
                    System.out.println("value is "+value);
                });
    }

   /* Once a Future is created, any calls made from inside the future is called on the thread on which the Future is running,
    in this case 'ForkJoinPool.commonPool-worker'. This can be seen by the thread name printed for supplyAsync(), lengthyProcess() and slowItDown() called from inside it, thenApply() and thenAccept() -
    all have the same thread name as they are running on same thread. */
    private static void supplyAsyncThenApply(){
       CompletableFuture.supplyAsync( () -> {
           System.out.println("supplyAsync Thread  name :"+Thread.currentThread().getName());
           return lengthyProcess();
       } ).thenApply( value -> {
           System.out.println("thenApply Thread name :"+ Thread.currentThread().getName());
           return value;
       } ).thenAccept( value -> {
           System.out.println( "thenAccept thread name: " + Thread.currentThread().getName() );
           System.out.println("value is "+ value);
       }).toCompletableFuture().join(); //toCompletableFuture().join() is used to make the main thread wait for this thread to complete otherwise main will complete and program will terminate before lengthyProcess() and subsequent calls are made.
    }

    private static void slowItDown(int time){
        System.out.println("slowItDown Thread name : "+ Thread.currentThread().getName());
        try {
            Thread.sleep( time * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private static int lengthyProcess() {
        System.out.println("Starting lengthyProcess ");
        System.out.println("lengthyProcess Thread Name ::"+Thread.currentThread().getName());
//        try {
//            Thread.sleep( 3000 );
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        slowItDown( 3 );
        System.out.println("Completed Lengthy Process");
        return 20;
    }
}
