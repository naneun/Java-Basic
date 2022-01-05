import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int msb = -1;
        while ((1 << ++msb) <= n);
        int idx, cnt = 0;
        for (idx = msb - 1; idx >= 0; --idx) {
            if (((n >> idx) & 1) == 1) {
                ++cnt;
            }
        }
        int ans = 0;
        if (cnt > k) {
            for (idx = msb - 1; k > 0 && idx >= 0; --idx) {
                if (((n >> idx) & 1) == 1) {
                    --k;
                }
            }
            ans = 1 << ++idx;
            n = (ans - 1) & n;
            ans -= n;
        }
        System.out.println(ans);
    }
}
