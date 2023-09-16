import java.util.Scanner;
/**
 * Write_a_program_that_find_out_area_of_Square
 */
public class Write_a_program_that_find_out_area_of_Square {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length size :");
        int a = sc.nextInt();
        int area = a*a;
        System.out.println("The result is :" + area);
    }
}