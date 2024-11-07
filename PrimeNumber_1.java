import java.util.Scanner;

// prime Number is those Number that is devide 1 and itself but does not devide another Number

public class PrimeNumber_1 {

    public static void main(String[] args) {
        PrimeNumber_1 pn = new PrimeNumber_1();
        pn.PrimeNumber(1);
        pn.PrimeNumber(2);
        pn.PrimeNumber(3);
        pn.PrimeNumber(4);
        pn.PrimeNumber(5);

    }

    void PrimeNumber(int n) {
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number:");
        // int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(n + " " + "is not prime number");

        } else {
            m = n / 2;

            for (int i = 2; i <= m; i++) {

                if (n % i == 0) {
                    System.out.println(n + " " + " is not prime Number");
                    flag = 1;
                    break;

                }

            }
            if (flag == 0) {
                System.out.println(n + " " + "is prime number");

            }
        }

    }

}
