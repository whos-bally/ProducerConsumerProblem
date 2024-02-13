public class Consumer implements Runnable{

    /**
     * @author Bally
     * Consumer class consumes a message and removes it from the queue.
     */

    @Override
    public void run() {
        System.out.println("Hello I'm a consumer");
    }
}
