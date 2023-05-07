public class StaticVariablesMethodsAndBlocks {
    static int a = 1;
    public static void main(String[] args) {
        System.out.println("This is Static Variables:" + a);
    }
    static void display() {
        System.out.println("This is Static Methods");
        display();
    }
    static {
        System.out.println("This is Static Block");
    }
}
