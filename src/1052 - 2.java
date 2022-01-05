import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        while (true) {
            int bits = 0;
            for (int i = n; i > 0; i -= i & -i) {
                ++bits;
            }
            if (bits <= k) {
                break;
            }
            ans |= n & -n;
            n += n & -n;
        }
        System.out.println(ans);
    }
}
