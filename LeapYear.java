package Practice_Set_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        System.out.printf("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        if (y%400==0 && y%100==0 || y%100!=0 && y%4==0)
        {
            System.out.println("This year is a Leap Year");
        }
        else
        {
            System.out.println("This year isn't a Leap Year");
        }
    }
}
