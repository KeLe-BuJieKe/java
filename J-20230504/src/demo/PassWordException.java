package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-05-04
 * Time: 20:07
 */
public class PassWordException extends RuntimeException{
    public PassWordException() {
        super();
    }


    public PassWordException(String s) {
        super(s);
    }
}