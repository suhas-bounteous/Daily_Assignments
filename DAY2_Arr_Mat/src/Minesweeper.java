import java.util.*;

public class Minesweeper {

    public static char[][] generateBoard(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        char[][] result = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'M') {
                    result[i][j] = 'M';
                } else {
                    int count = 0;

                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if (ni >= 0 && nj >= 0 && ni < m && nj < n) {
                            if (board[ni][nj] == 'M') {
                                count++;
                            }
                        }
                    }

                    result[i][j] = (count == 0) ? '0' : (char)(count + '0');
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

        char[][] board = new char[m][n];

        System.out.println("Enter board (M for mine, E for empty):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        char[][] result = generateBoard(board);

        System.out.println("Generated Board:");
        for (char[] row : result) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
