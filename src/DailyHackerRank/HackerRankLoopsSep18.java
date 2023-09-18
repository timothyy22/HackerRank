package DailyHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HackerRankLoopsSep18 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input: Read an integer from the user
        int N = scanner.nextInt();

        for (int x = 1; x <= 10; x++) {
            int sum = N * x;
            System.out.printf("%d x %d = %d%n", N, x, sum);
        }


    }
}
