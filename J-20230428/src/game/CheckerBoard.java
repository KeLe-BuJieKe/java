package game;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 2:26
 */
public class CheckerBoard {
    protected Piece red;
    protected Piece blue;
    protected char[][] board;

    private void initCheckerBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                board[i][j] = '0';
            }
        }
    }
    public CheckerBoard() {
        red = new Piece('#');
        blue = new Piece('@');
        this.board = new char[3][3];
        initCheckerBoard();
    }

    public boolean getBoard(int x, int y) {
        return board[x][y] == '0';
    }

    public void setBoard(int x, int y, char flag) {
        this.board[x][y] = flag;
    }

    public void showBoard() {
        int i = 0;
        for (i = 0; i < 3; i++) {
            int j = 0;
            for (j = 0; j < 3; j++) {
                System.out.printf(" %c ", board[i][j]);
                if (j < 3 - 1)
                    System.out.printf("|");
            }
            System.out.printf("\n");
            //打印分割的行
            if (i < 3 - 1) {
                for (j = 0; j < 3; j++) {
                    System.out.printf("---");
                    if (j < 3 - 1)
                        System.out.printf("|");
                }
                System.out.printf("\n");
            }
        }
    }
}
