import java.util.Scanner;

public class MatrixMultiplication {

    public static int[][] multiply(int[][] A, int[][] B) {

        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        // Check validity
        if (n != B.length) {
            throw new IllegalArgumentException("Matrix multiplication not possible");
        }

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter cols: ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];

        System.out.println("Enter board (0 = dead, 1 = alive):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("2. Enter rows: ");
        int p = sc.nextInt();

        System.out.print("Enter cols: ");
        int q = sc.nextInt();

        int[][] B = new int[p][q];

        System.out.println("Enter board (0 = dead, 1 = alive):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        int[][] result = multiply(A, B);

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
