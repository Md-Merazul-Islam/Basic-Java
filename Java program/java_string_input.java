import java.util.Scanner;

public class java_string_input {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name :");
        String a = sc.nextLine();
        System.out.println("How old are you: ");
        int b = sc.nextInt();
        System.out.println("hello!,I am "+a + ". I am "+b+ " years old");
    }
}
