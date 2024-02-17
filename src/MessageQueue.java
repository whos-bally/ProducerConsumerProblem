import java.util.Vector;

public class MessageQueue {

    private Vector queue;

    public MessageQueue(){
        queue = new Vector();
    }

    public void send(Object item){
        queue.addElement(item);
        System.out.printf("\nSent item to queue: %s", item);
    }

    public Object receive(){
        Object item;

        if (queue.size() == 0) {

            System.out.println("\nQueue empty!");
            return null;
        }
        else{
            item = queue.firstElement();
            queue.removeElementAt(0);
            System.out.printf("\nReceived item from queue: %s", item);
            return item;
        }

    }
}
