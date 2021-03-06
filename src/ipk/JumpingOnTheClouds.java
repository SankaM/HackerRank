package ipk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int stepCount = 0;
        int current = 0;
        int next = 0;
        int nextAfterNext = 0;

        for (int x = 0; x <= c.length - 2; x++) {
            current = c[x];

            if ( x < c.length - 2 && current == 0 && c[x + 1] == 1 &&  c[x + 2] == 0 ) {
                x = x + 1;
            } else if ( x < c.length - 2 && c[x + 1] == 0 && next == 0 && c[x + 2] == 0) {
                x = x + 1;
            }

            stepCount = stepCount + 1;
        }

        return stepCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
