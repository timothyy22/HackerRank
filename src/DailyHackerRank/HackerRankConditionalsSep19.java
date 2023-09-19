package DailyHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerRankConditionalsSep19 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N % 2 == 1) {
            System.out.print("Weird");
        } else if (N > 20) {
            System.out.print("Not Weird");
        } else if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.print("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.print("Weird");
            }
        }
        bufferedReader.close();
    }
}
