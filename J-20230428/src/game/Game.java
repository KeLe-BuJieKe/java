package game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 2:26
 */
public class Game extends CheckerBoard{  //java只能单继承，不能多几次，但C++可以多继承
    public Game() {
    }

    private char isWin() {
        for (int i = 0; i < 3; ++i) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != '0') {
                return board[i][0];
            }
        }
        for (int i = 0; i < 3; ++i) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != '0') {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '0') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '0') {
            return board[0][2];
        }

        if (isFull() == true) {
            return '=';
        }

        return 'X';
    }

    private boolean isFull() {
        for (char[] tmp : board) {
            for (char ch : tmp) {
                if (ch == '0') {
                    return false;
                }
            }
        }
        return true;
    }
    private void player() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要下的坐标");
        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (getBoard(x, y) == true) {
                setBoard(x, y, red.getColor());
                break;
            }
            else {
                System.out.println("该位置已被占用，请重新输入要下的坐标");
            }
        }
        //System.out.println(Arrays.deepToString(board));
        showBoard();
    }

    private void machine() {
        Random random = new Random();
        int x = 0;
        int y = 0;
        while (true) {
            x = random.nextInt(3);
            y = random.nextInt(3);
            if (getBoard(x, y) == true) {
                setBoard(x, y, blue.getColor());
                break;
            }
        }
        //System.out.println(Arrays.deepToString(board));
        showBoard();
    }

    public void play() {
        char ret = '0';
        while (true) {
            //玩家
            player();
            ret = isWin();
            if (ret != 'X') {
                break;
            }
            System.out.println("-------------------------");
            //电脑
            machine();
            ret = isWin();
            if (ret != 'X') {
                break;
            }
            System.out.println("-------------------------");
        }
        if (ret == '#') {
            System.out.println("恭喜玩家获得胜利");
        }
        else if (ret == '@'){
            System.out.println("恭喜电脑获得胜利");
        }
        else {
            System.out.println("平局");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
