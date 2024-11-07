public class Swapping {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before the Swapping=" + a + " " + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;

        /////////////////////////////////////////////////////////////////////////////////////
        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println("After the Swapping=" + a + " " + b);
    }

}
