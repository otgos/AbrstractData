package ds.stack;

// this is to reverse the string

public class CharStack {

    private int maxSize;
    private int top;
    private char[] stackCharArray;

    public CharStack(int size){
        this.maxSize = size;
        this.top = -1;
        this.stackCharArray = new char[maxSize];
    }

    public void push(char c){
        if(isFull()){
            System.out.println("This stack is already full!");
        } else {
            top++;
            stackCharArray[top] = c;
        }
    }


    public char pop(){
        if(isEmpty()){
            System.out.println("This stack is already empty!");
            return '0';
        } else {
            int oldTop = top;
            top--;
            return stackCharArray[oldTop];
        }
    }

    public char peak(){
        return stackCharArray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (maxSize-1==top);
    }

}
