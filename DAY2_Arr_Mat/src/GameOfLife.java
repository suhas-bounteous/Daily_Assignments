import java.util.*;

public class GameOfLife {

    public static int[][] nextGeneration(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] result = new int[m][n];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int liveNeighbors = 0;

                for (int d = 0; d < 8; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];

                    if (ni >= 0 && nj >= 0 && ni < m && nj < n) {
                        if (board[ni][nj] == 1) {
                            liveNeighbors++;
                        }
                    }
                }

                // Apply rules
                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        result[i][j] = 1;
                    } else {
                        result[i][j] = 0;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter cols: ");
        int n = sc.nextInt();

        int[][] board = new int[m][n];

        System.out.println("Enter board (0 = dead, 1 = alive):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int[][] result = nextGeneration(board);

        System.out.println("Next Generation:");
        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
