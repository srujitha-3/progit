import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("invalid");
        }
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
               sum   =sum + i;
            }
        }
        if (sum == n) {

            System.out.println("prefect number");

        }else{
            System.out.println("not a perfect number");
        }
    }
}
