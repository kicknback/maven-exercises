import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringApp {

    public static void main(String[] args) {

        StringUtils st = new StringUtils();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some input: ");
        String userInput = sc.next();

        System.out.println(st.isNumeric(userInput));
        System.out.println(st.swapCase(userInput));
        System.out.println(st.reverse(userInput));

    }

}
