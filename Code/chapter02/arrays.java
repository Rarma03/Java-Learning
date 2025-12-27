package chapter02;

public class arrays {
    public static void main(String[] args) {

        // 1-D array
        int arr[] = { 100, 20, 34, -1, 0 };

        // Dynamic array
        int dyn[] = new int[5]; // 5 sized, all value 0

        // multi-dimensional 2D or 3D
        int mul2d[][] = new int[4][6];
        int mul3d[][][] = new int[4][6][2];

        // random number generator
        int randoms = (int) (Math.random() * 10); // single
        int randomd = (int) (Math.random() * 100); // double

        // print array
        for (int val : arr) {
            System.out.println(val);
        }

        // jagged array
        // multi dim array with different row size
        int jagged[][] = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];

    }
}