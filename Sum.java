package Practice_Set_1;

public class Sum {
    public static void main(String[] args) {
        int a = 0, i;
        for (i = 0; i < args.length; i++) {
            a = a + Integer.parseInt(args[i]);
        }
        System.out.println("The result of the sum: " + a);
    }
}
