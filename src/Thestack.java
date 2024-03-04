import java.util.Arrays;

public class Thestack {

    private String[] stackArray;
    private  int stackSize;

    //set the stack as empty
     private int topOfStack = -1;

    public Thestack(int size) {
        stackSize = size;
        stackArray = new String[size];
        // Assigns the value of -1 to every value in the array
        // so I control what gets printed to screen

        Arrays.fill(stackArray, "-1");
    }

    public void push(String input){
        if (topOfStack + 1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        }else System.out.println("Sorry but the stack is full");
        displayTheStack();
        System.out.println("PUSH " + input + " Was added to the stack");
    }

    public String pop(){
        if(topOfStack >= 0){
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was removed from the stack\n");
            stackArray[topOfStack] = "-1";
            return  stackArray[topOfStack--];
        }else {
            displayTheStack();
            System.out.println("Sorry but the stack is empty");
            return "-1";
        }
    }
    public  String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the stack\n");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValue){
        String[] tempString = multipleValue.split(" ");
        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
    }

    public void popAll(){
        for (int i = topOfStack;  i>= 0; i--) {
            pop();
        }
    }

    public void displayTheStack() {
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < stackSize; n++) {
            System.out.format("| %2s " + " ", n);
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();

        for(int n = 0; n < stackSize; n++){
            if(stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
    }


}
