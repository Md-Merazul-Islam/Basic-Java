import java.util.Scanner;

public class celcius_to_Fahrenheit_conversion {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();
        int fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The result is :" + fahrenheit);
    }
}
