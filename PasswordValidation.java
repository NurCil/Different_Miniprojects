import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = sc.next();
        if (pw.length() >= 7 && isNumeric(pw) >= 2 && isSpecial(pw) >= 2) {
            System.out.println("Strong");
        }else 
            System.out.println("Weak");
    }

    public static int isNumeric(String str) {
        int resNum = 0;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i]) == true) {
                resNum++;
            }
        }
        return resNum;
    }

    public static int isSpecial(String str) {
        int resSpec = 0;
        char[] c = str.toCharArray();
        String spec = "!@#$%&*";
        char[] d = spec.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (char x : d) {
                if (x == c[i]) {
                    resSpec++;
                }
            }
        }
        return resSpec;
    }
}