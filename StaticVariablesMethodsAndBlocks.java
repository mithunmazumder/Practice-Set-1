package Practice_Set_1;

public class StaticVariablesMethodsAndBlocks {
    static int a = 1;
    public static void main(String[] args) {
        System.out.println("This is Static Variables:" + a);
        display();
    }
    static void display() {
        System.out.println("This is Static Methods");
    }
    static {
        System.out.println("This is Static Block");
    }
}
