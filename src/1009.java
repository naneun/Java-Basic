import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long r = a % 10;
            b = (b - 1) % 4;
            while (b-- > 0) {
                r *= a;
                r %= 10;
            }
            System.out.println(r == 0 ? 10 : r);
        }
    }
}
