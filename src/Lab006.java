public class Lab006 {

    private final int n;
    private final int m;

    public Lab006(int n, int m) {   //is this a setter???
        this.n = n;
        this.m = m;
    }

    public boolean isDivisible() {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printToTerminal(){
        if (isDivisible()) {
            System.out.println("Divisible");
        } else if (!(isDivisible())) {
            System.out.println("Not Divisible");
        }
    }
}