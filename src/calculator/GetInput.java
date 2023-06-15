package calculator;

import java.util.Scanner;

public class GetInput {
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression (eg:4+5/3) :");
        String inpExp = scanner.next();
        scanner.close();
        return inpExp;
    }
}
