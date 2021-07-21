import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String str) {
//        return Hashing.sha256().hashString(str, StandardCharsets.UTF_8).toString();
        String hashString = "";
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            switch (strArray[i]) {
                case 'a':
                case 'A':
                    hashString += '4';
                    break;
                case 'e':
                case 'E':
                    hashString += '3';
                    break;
                case 'i':
                case 'I':
                    hashString += '1';
                    break;
                case 'o':
                case 'O':
                    hashString += '0';
                    break;
                case 'u':
                case 'U':
                    hashString += '9';
                    break;
                default:
                    hashString += strArray[i];
            }
        }
        return hashString;
    }

    public static boolean checkPassword(String pass, String hash) {
        return hash.equals(hashPassword(pass));
    }

}
