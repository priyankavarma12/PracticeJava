package thread;

import java.util.concurrent.CompletableFuture;

public class NotAllThenAcceptThenApply {

    public static void main(String[] args) {
        System.out.println("Starting main");
        CompletableFuture<Integer> future = new CompletableFuture<>();
        solveFuture(future);
        System.out.println("Completing main");
    }

   /* solveFuture is called in main method so it is run on the thread main is running viz. main thread. In the method, we call thenAccept on future variable and that is run on the same thread on which solveFuture()  is running i.e. main thread. This can be seen in output.
    If line 'future.complete(555)' is removed 2 things will happen:
            •	the future will not have any int value contained in it
•	the future will not have completed and as we know any callables such as thenAccept in this case is called only when the previous future is complete, the thenAccept in above code will never be called.
*/
    private static void solveFuture(CompletableFuture<Integer> future){
        System.out.println("in solveFuture");
        future.complete( 555 );
        future.thenAccept( value -> {
            System.out.println("thenAccept thread name :" + Thread.currentThread().getName());
            slowItDown(  5);
            System.out.println("value is ::"+value);
        } );

    }

    private static void slowItDown(int time){
        System.out.println("slowItDown thread name : "+Thread.currentThread().getName());
        try {
            Thread.sleep( time * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
