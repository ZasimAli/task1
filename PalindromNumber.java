import java.util.Scanner;

// Palindrom Number is Those Number that revese Number same original Number

public class PalindromNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        if (n == rev) {
            System.out.println(n + " " + " is Palindrom Number");

        } else {
            System.out.println(n + " " + " is not Palindrom Number");
        }

    }

}
