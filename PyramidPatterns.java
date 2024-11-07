import java.util.Scanner;

public class PyramidPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // 1. Half Pyramid
        System.out.println("1. Half Pyramid");
        halfPyramid(rows);

        // 2. Inverted Half Pyramid
        System.out.println("\n2. Inverted Half Pyramid");
        invertedHalfPyramid(rows);

        // 3. Hollow Half Pyramid
        System.out.println("\n3. Hollow Half Pyramid");
        hollowHalfPyramid(rows);

        // 4. Full Pyramid
        System.out.println("\n4. Full Pyramid");
        fullPyramid(rows);

        // 5. Hollow Full Pyramid
        System.out.println("\n5. Hollow Full Pyramid");
        hollowFullPyramid(rows);

        // 6. Hollow Inverted Half Pyramid
        System.out.println("\n6. Hollow Inverted Half Pyramid");
        hollowInvertedHalfPyramid(rows);
    }

    // 1. Half Pyramid
    public static void halfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 2. Inverted Half Pyramid
    public static void invertedHalfPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 3. Hollow Half Pyramid
    // public static void hollowHalfPyramid(int rows) {
    // for (int i = 1; i <= rows; i++) {
    // for (int j = 1; j <= rows; j++) {
    // if (j == 1 || j == i || i == rows) {
    // System.out.print(j);
    // }
    // }
    // }
    // }
}