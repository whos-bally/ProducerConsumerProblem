import java.util.Date;

public class Consumer implements Runnable{

    /**
     * @author Bally
     * Consumer class consumes a message and removes it from the queue.
     */

    private MessageQueue item;
    public Consumer(MessageQueue q){

        this.item = q;

    }
    @Override
    public void run() {
        while(true){
            Date msg = (Date) item.receive();
            if (msg != null)
                System.out.println("\nMessage consumed");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
