public abstract class Lab006 {

    private int n;
    private int m;

    public Lab006(int n, int m) {   //is this a setter???
        this.n = n;
        this.m = m;
    }

    public boolean isDivisible() {
        if (n % m == 0) {
            System.out.println("Divisible");
            return true;
        } else {
            System.out.println("Not Divisible");
            return false;
        }
    }
}