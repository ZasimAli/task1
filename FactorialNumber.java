import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int fact = 1;
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        for (int i = n; i >= 1; i--) {

            fact = fact * i;

        }
        System.out.println(fact);
    }

}