package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:13
 */
public class Book implements Cloneable{
    private String name; //书名
    private String author; //作者
    private double price; //价格
    private String type; //类型
    private int num; //剩余数量

    public Book(String name, String author, double price, String type, int num) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", 剩余量为： " + num +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Book bookClone() {
        try {
            return (Book)this.clone();
        }
        catch(CloneNotSupportedException e) {

        }
        return null;
    }
}
