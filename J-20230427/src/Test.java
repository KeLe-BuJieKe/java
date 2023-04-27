import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-26
 * Time: 23:45
 */
class Person{

    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("2个参数的构造方法");
    }

    //如果是非静态的，那么看 定义 的顺序。谁在前谁先执行，如下面name的值就为wusuowei
    //调换顺序后就为hahaha
    {
        this.name = "hahaha";
        System.out.println("非静态代码块/实例代码块/构造代码块/ -> 初始化非静态的数据成员，调用在构造方法之前");
    }
    public String name = "wusuowei";

    static {
        System.out.println("静态代码块 -> 初始化静态的数据成员  提前准备一些数据");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " 在吃饭");
    }

    public void show() {
        System.out.println("姓名： " + name + " 年龄: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        System.out.println(p);

    }
}




public class Test {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5 , 6}};
        System.out.println(Arrays.deepToString(array));
    }
    public static void  bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    public static void main1(String[] args) {
        int[] array = {3, 2, 1, 4, 5};
        long startTime = System.currentTimeMillis(); //毫秒
        bubbleSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(Arrays.toString(array));
    }
}
