import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the input string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter the pattern p: ");
        String p = scanner.nextLine();
        System.out.println(solution.isMatch(s, p));
    }
}
