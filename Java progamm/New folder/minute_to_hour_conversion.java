import java.util.Scanner;

public class minute_to_hour_conversion {
       public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        System.out.println("Enter the number of hours : " + hours);
    }
}
