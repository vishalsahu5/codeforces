import java.util.*;

public class Problem202A {
    public static String result;

    public static void solve(char[] s, int pos, StringBuilder tempSb) {
        if (pos == s.length) {
            if (isPalindrome(tempSb) && result.compareTo(tempSb.toString()) < 0) {
                result = tempSb.toString();
            }
            return;
        }

        tempSb.append(s[pos]);
        solve(s, pos+1, tempSb);
        tempSb.deleteCharAt(tempSb.length()-1);
        solve(s, pos+1, tempSb);
    }

    private static boolean isPalindrome(StringBuilder result) {
        StringBuilder reversedSb = new StringBuilder(result.toString());
        reversedSb.reverse();
        return result.toString().compareTo(reversedSb.toString()) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        result = "";
        solve(s.toCharArray(), 0, new StringBuilder());
        System.out.println(result);
    }
}
