package DailyHackerRank;
import java.io.*;
import java.util.*;

public class HackerRankDay1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header line
        System.out.println("================================");

        while (scanner.hasNext()) {
            String s = scanner.next();
            int x = scanner.nextInt();

            // Format and print the output
            System.out.printf("%-15s%03d%n", s, x);
        }

        // Footer line
        System.out.println("================================");

        scanner.close();
    }
    }
}
