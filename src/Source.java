public class Source {
    public static void main(String[] args) {
        double a=2;
        double b=5;
        double margin = 3;
        System.out.println(closeCompare(a,b,margin)==0);
    }
    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) <= margin? 0 : a > b? 1 : -1;
    }
}
