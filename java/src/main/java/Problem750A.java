import java.util.Scanner;

public class Problem750A {
    public static int solve(int n, int k) {
        int lo = 0, hi = n, ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            int time = k;
            time += 5 * (mid * (mid + 1)) / 2;
            if (time == 240) {
                ans = mid;
                break;
            }
            if (time < 240) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solve(n, k));
    }
}
