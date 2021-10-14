package ds.queue;

public class AppQue {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(599);
        myQueue.insert(6);
        myQueue.insert(4);
        myQueue.insert(7);
        myQueue.insert(8);
        myQueue.view();
    }
}
