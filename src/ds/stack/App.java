package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack newStack = new Stack(2);
        newStack.push(20);
        newStack.push(40);
        newStack.push(60);
        newStack.push(80);

        while(!newStack.isEmpty()){
            long value = newStack.pop();
            System.out.println(value);

        }

        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Otgonbayar"));

    }

    public static String reverseString(String str){

        int stackSize = str.length();
        CharStack theCharStack = new CharStack(stackSize);
        for (int i = 0; i<stackSize; i++){
            char j = str.charAt(i);
            theCharStack.push(j);
        }

        String result = "";

        while (!theCharStack.isEmpty()){
            char value = theCharStack.pop();
            result+=value; //appending the output
        }

        return result;
    }
}
