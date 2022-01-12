import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static String sum(char[] arr, char[]brr) {
        int len = Math.max(arr.length, brr.length);
        List<Character> list = new ArrayList<>();
        char[] A = new char[len];
        char[] B = new char[len];
        Arrays.fill(A, '0');
        Arrays.fill(B, '0');

        System.arraycopy(arr, 0, A, 0, arr.length);
        System.arraycopy(brr, 0, B, 0, brr.length);

        int idx, carry = 0;
        for (idx = 0; idx < len; ++idx) {
            int sum = (A[idx] - '0') + (B[idx] - '0') + carry;
            carry = sum / 10;
            sum %= 10;
            list.add((char) (sum + '0'));
        }
        if (carry == 1) {
            list.add('1');
        }

        String ret = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        return new StringBuffer(ret).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        char[] arr = new StringBuffer(A).reverse().toString().toCharArray();
        char[] brr = new StringBuffer(B).reverse().toString().toCharArray();

        System.out.println(sum(arr, brr));
    }
}
