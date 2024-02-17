

public class Server{

    Producer producerThread;
    Consumer consumerThread;

    public Server() {
        MessageQueue mailBox = new MessageQueue();

        // Create objects
        producerThread = new Producer(mailBox);
        consumerThread = new Consumer(mailBox);

        // Create threads
        Thread producer = new Thread(producerThread);
        Thread consumer = new Thread(consumerThread);

        // GO!
        producer.start();
        consumer.start();



    }
}
