public class break_and_continue {
    public static void main(String arg[]) {
        int x = 5;
        for (int i = 1; i <= 10; i++) {
            if (i == x) {
                break;

            }
            if (i == 2) {
                continue;
            } 
            else {
                System.out.println(i);
            }
        }
    }
}

/*
 * 1
 * 2
 * 3
 * 4
 */