import java.lang.Math;

public class Chess {

    private int[][] board;
    private int boardSize;
    private int dr, dc;
    private int tile;

    public Chess() {
        board = new int[1][1];
        dr = 0; dc = 0; boardSize = 0;
    }

    public Chess(int tr, int tc, int s) {
        int n;
        n = (int) Math.pow(2, s);
        if (n <= tr || n <= tc) {
            System.out.println("初始化参数错误！");
        } else {
            board = new int[n][n];
            dr = tr; dc = tc;
            boardSize = s;
        }
    }

    public void Print() {
        for (int i = 0; i < Math.pow(2, this.boardSize); i++) {
            for (int j = 0; j < Math.pow(2, this.boardSize); j++) {
                System.out.print(String.format("%3d|", this.board[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Chess c1 = new Chess(5, 5, 3);
        c1.chessBoard(0, 0, c1.dc, c1.dr,
                (int)Math.pow(2, c1.boardSize));
        c1.Print();
    }

    public void chessBoard(int tr, int tc, int dr, int dc, int size) {
        if (size == 1) {
            return ;
        }
        int t = tile++, s = size / 2;
        if (dr < tr + s && dc < tc + s) {
            chessBoard(tr, tc, dr, dc, s);
        } else {
            board[tr + s - 1][tc + s - 1] = t;
            chessBoard(tr, tc, tr + s - 1, tc + s - 1, s);
        }
        if (dr < tr + s && dc >= tc + s) {
            chessBoard(tr, tc + s, dr, dc, s);
        } else {
            board[tr + s - 1][tc + s] = t;
            chessBoard(tr, tc + s, tr + s - 1, tc + s, s);
        }
        if (dr >= tr + s && dc < tc + s) {
            chessBoard(tr + s, tc, dr, dc, s);
        } else {
            board[tr + s][tc + s - 1] = t;
            chessBoard(tr + s, tc, tr + s, tc + s - 1, s);
        }
        if (dr >= tr + s && dc >= tc + s) {
            chessBoard(tr + s, tc + s, dr, dc, s);
        } else {
            board[tr + s][tc + s] = t;
            chessBoard(tr + s, tc + s, tr + s, tc + s, s);
        }
    }
}
