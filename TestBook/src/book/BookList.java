package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:21
 */
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",89,"小说", 3);
        books[1] = new Book("西游记","吴承恩",78,"小说", 2);
        books[2] = new Book("红楼梦","曹雪芹",49,"小说", 1);
        this.usedSize = 3;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public void setBook(Book book) {
        this.books[usedSize] = book;
    }

    public void setBook(int pos,Book book) {
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
