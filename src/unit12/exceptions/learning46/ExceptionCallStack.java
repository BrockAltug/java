package unit12.exceptions.learning46;

public class ExceptionCallStack {
    public static void main(String[] args) {
        //at unit12.exceptions.learning46.ExceptionCallStack.main
        dividerCaller();

        System.out.println("--After the Exception--");
    }

    //make an exception using a method
    //at unit12.exceptions.learning46.ExceptionCallStack.divider
    public static void divider(){
        System.out.println(10/0);
    }

    //at unit12.exceptions.learning46.ExceptionCallStack.dividerCaller
    public static void dividerCaller(){
        divider();
    }
}
