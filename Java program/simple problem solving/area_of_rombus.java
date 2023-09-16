import java.util.Scanner;

public class area_of_rombus {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first diagonal: ");
        int d1 = sc.nextInt();
        System.out.println("Enter the length of the second diagonal: ");
        int d2 = sc.nextInt();
        int area = (d1*d2)/2;
        System.out.println("The result is : "+ area);
    }
}
