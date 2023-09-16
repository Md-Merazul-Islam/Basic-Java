public class array {
    public static void main(String arg[]) {

        int arr[] = { 10, 20, 30, 40 };
        int sum=0;
        for (int i = 0; i < arr.length;  i++) {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println(sum);
    }

}
