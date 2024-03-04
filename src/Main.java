public class Main {
    public static void main(String[] args) {
        Thestack thestack = new Thestack(10);
        thestack.push("10");
        thestack.push("15");
        thestack.push("16");
        thestack.peek();
        thestack.pop();
        thestack.displayTheStack();
        thestack.pushMany("10 12 4 45 4");
        thestack.popAll();
        thestack.displayTheStack();
    }
}