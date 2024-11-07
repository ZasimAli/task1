import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int t1 = n;
        int leng = 0;
        while (t1 != 0) {
            t1 = t1 / 10;
            leng = leng + 1;

        }
        int t2 = n;
        int rem = 0;

        int arm = 0;
        while (t2 != 0) {
            int mul = 1;
            rem = t2 % 10;
            for (int i = 1; i <= leng; i++) {
                mul = mul * rem;

            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if (n == arm) {
            System.out.println(n + " " + "is Armstrong Number ");

        } else {
            System.out.println(n + " " + "is not Armstrong number");
        }
    }

}
