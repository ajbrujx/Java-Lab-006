import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Pick a dividend: ");
        int dividend = Integer.parseInt(s.nextLine());
        System.out.println("Pick a divisor: ");
        int divisor = Integer.parseInt(s.nextLine());

        Lab006 lab006 = new Lab006(dividend, divisor);

        lab006.isDivisible();
        lab006.printToTerminal();
    }
}
