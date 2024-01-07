/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the upper-case letters are converted to lower-case letters.
     * Non-letter characters are left as is.
     */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String update = "";
        boolean check = false;
        int count;
        for (int i = 0; i < s.length(); i++) {
            check = false;
            count = -1;
            for (int c = 0; c < upper.length(); c++) {
                if (s.charAt(i) == upper.charAt(c)) {
                    check = true;
                    count = c;
                }
            }
            if (check) {

                if (s.charAt(i) == upper.charAt(count))
                    update += lower.charAt(count);
                else
                    update += s.charAt(i);
            } else
                update += s.charAt(i);
        }
        return update;
    }
}
