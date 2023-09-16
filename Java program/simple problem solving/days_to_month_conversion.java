import java.util.Scanner;

public class days_to_month_conversion {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int day = sc.nextInt();
        int month = day / 30;
        System.out.println("Enter the number of month : " + month);
    }
}
