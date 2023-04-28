package game;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 2:26
 */
final public class Piece { //当使用final修饰类之后，这个类不能被继承与C++一致
    private char color;

    public Piece(char color) {
        this.color = color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "这是一个" + color + "色棋子";
    }
}
