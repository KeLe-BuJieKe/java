import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 13:57
 */

public class Test {
    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        swap(arr, 0 ,1);
        System.out.println(Arrays.toString(arr));
    }
}
