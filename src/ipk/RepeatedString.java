package ipk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Priyantha Weerakoon
 */
public class RepeatedString {
    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n) {
        long numberOfAs = 0;
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == 'a') {
                numberOfAs++;
            }
        }
        long repetitions = n/s.length();
        long remaining = n%s.length();

        numberOfAs = numberOfAs*repetitions;

        for (int x = 0; x < remaining; x++) {
            if (s.charAt(x) == 'a') {
                numberOfAs++;
            }
        }

        return numberOfAs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
