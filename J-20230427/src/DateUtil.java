import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-27
 * Time: 13:41
 */
public class DateUtil {
    public int year;
    public int month;
    public int day;

    public DateUtil () {
    }
    public DateUtil (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void show () {
        System.out.println("年: " + year + " 月: " + month + " 日: " + day);
    }

    public static void main(String[] args) {
        DateUtil dateUtil = new DateUtil(2023, 4, 27);
        dateUtil.show();
    }
}
