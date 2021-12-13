package Day13.com.rk.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String exp = sc.nextLine();
        String[] values = exp.split("[+,-,*,/, ]");
        for (String a :
                values) {
            System.out.println(a);
        }
    }
}
