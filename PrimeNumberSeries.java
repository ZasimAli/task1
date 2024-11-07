import java.util.Scanner;

// prime Number is those Number that is devide 1 and itself but does not devide another Number
public class PrimeNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int p = sc.nextInt();
        for (int no = 1; no <= p; no++) {
            int temp = 0;
            for (int j = 2; j <= no - 1; j++) {
                if (no % j == 0) {
                    temp = temp + 1;

                }

            }
            if (temp == 0) {
                System.out.print(" " + no);

            }

        }

    }

}
