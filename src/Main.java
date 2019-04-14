import ipk.JumpingOnTheClouds;
import ipk.RepeatedString;
import ipk.arrays.LeftRotation;

public class Main {

    public static void main(String[] args) {

        // Jumping on the clouds
        int[] arr = new int[]{0, 0, 0, 1, 0, 0};
        System.out.println("JumpingOnTheClouds -> :" + JumpingOnTheClouds.jumpingOnClouds(arr));

        // Repeated Strings
        System.out.println("RepeatedString -> :" + RepeatedString.repeatedString("aba", 10));

        // left rotate
        int[] arrlr = LeftRotation.rotLeft(new int[]{1, 2, 3, 4, 5},4);

        for (int x = 0; x < arr.length -1 ; x++) {
            System.out.println(arrlr[x]);
        }
    }
}
