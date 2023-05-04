package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-05-04
 * Time: 20:07
 */
public class UserNameException extends RuntimeException{
    public UserNameException() {
        super();
    }


    public UserNameException(String s) {
        super(s);
    }
}