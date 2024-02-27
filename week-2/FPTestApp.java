public class FPTestApp {
    public static void main (String args[]) {
    double x = 0.05;
    double y = x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x;

    double c = 1;
    double d = (c - 0.999);

    y = Math.floor(y);

    System.out.println(x);
    System.out.println(y);
    System.out.println(d);

    }
}
