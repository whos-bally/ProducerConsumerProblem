public class Producer implements Runnable{


    /**
     * @author Bally
     * Producer class creates a message and adds it to the queue.
     */
    @Override
    public void run() {
        System.out.println("Hello I'm a producer");
    }
}
