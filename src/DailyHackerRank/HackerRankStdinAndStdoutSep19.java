package DailyHackerRank;

import java.util.Scanner;

public class HackerRankStdinAndStdoutSep19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);

    }
}
