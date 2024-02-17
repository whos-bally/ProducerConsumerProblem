import java.util.Date;

/**
 * @author Bally
 * Producer class creates a message and adds it to the queue.
 */
public class Producer implements Runnable{

    //private final int BUFFER_SIZE = 10;
    private MessageQueue item;

    public Producer(MessageQueue q){
        this.item = q;
    }

    @Override
    public void run() {
        while(true){
            // Produce an item and add it to the buffer
            Date message = new Date();
                    item.send(message);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
