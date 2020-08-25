/*
Constraints:
 1. 8-30 char
 2. alphanumeric + "_"
 3. Starts with alphabet

INPUT:
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

OUTPUT:
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
*/
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-z A-Z]\\w{7,29}$";
}


class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}