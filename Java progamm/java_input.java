import java.util.Scanner;

public class java_input {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = s.nextInt();
         System.out.println("Enter the value of B: ");
        int b = s.nextInt();
         System.out.println("Enter the value of C: ");
        int c = s.nextInt();
        int sum = a+b+c;
        System.out.println("The result is :"+sum);
    }
}
