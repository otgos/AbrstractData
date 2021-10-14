package ds.queue;

public class Queue {

    private int maxSize; //initialize the number of slot
    private long [] queArray; // slots to main data
    private int front; //this will be index position of front element
    private int rear; //this will be index position of back element
    private int nItems; //counter to maintain items

    public Queue (int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // index position of first array
        rear = -1; // there is no item in the array as the last element
        nItems= 0; // no items in array yet

    }

    public void insert(long j){
        if(rear==maxSize){
            rear=-1;
        }
        rear++;
        queArray[rear]=j;
        nItems ++;
    }
    public long remove(){
        long temp= queArray[front];
        front++;
        if(front==maxSize){
            front = 0; // we can set front to 0th index so that we can utilize entire array again
        }
        nItems --;
        return temp;
    }
    public boolean isEmpty() {
        return nItems == 0;
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }
    public long pearkFront(){
        return queArray[front]
    }

    public void view(){
        System.out.println(" [ ");
        for(int i = 0; i<queArray.length; i++){
            System.out.println(queArray[i]+" ");
        }
        System.out.println(" ]");
    }

}
