package tdd;

public class PasswordTool {

    public static boolean isPasswordValid(String password) {
        String newPassword = password.substring(1,password.length() -1);

        boolean isLengthGreaterThan8 = isPasswordLengthGreaterThan8(password);
        boolean isContainNumber = isPasswordContainNumber(password);
        boolean isContainUppercase = isPasswordContainUppercase(password);
        return isLengthGreaterThan8 && isContainNumber && isContainUppercase;
    }

    public static boolean isPasswordContainUppercase(String password) {
        boolean containUppercase = false;
        char[] pw=password.toCharArray();

        for(int i=0;i<password.length();i++)
            if(pw[i]>64 && pw[i]<97 ){
                containUppercase = true;
                break;
            }
        return containUppercase;
    }

    public static boolean isPasswordContainNumber(String password) {
        boolean containNumber = false;
        char[] pw=password.toCharArray();

        for(int i=0;i<password.length();i++)
            if(pw[i]>=48 && pw[i]<=57 ){
                containNumber = true;
                break;
        }
        return containNumber;
    }

    public static boolean isPasswordLengthGreaterThan8(String password) {
        return password.length() >= 8;
    }
}

