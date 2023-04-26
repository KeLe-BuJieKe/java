import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] ret = Arrays.copyOf(array, 8);  //拷贝，也可以永安里扩容
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));
        System.out.println("------------------------------");

        int[] ret2 = new int[array.length * 2];
        System.arraycopy(array, 1, ret2, 0, array.length - 1); //拷贝，且支持区间拷贝
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret2));

        int[] ret3 = Arrays.copyOfRange(array, 0, 4);  //左闭右开
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret3));


        int[] ret4 = array.clone(); //clone产生一个副本
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret4));
        ret4[0] = 199;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret4));
    }


    public static void main16(String[] args) {
        int[] array = {1, 12, 31, 41, 5};
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------");
        for (int i: array) {
            System.out.println(i);
        }
        System.out.println("----------------");
        Arrays.sort(array);
        String str = Arrays.toString(array);
        System.out.println(str);
    }

    public static void hanota(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            move(pos1, pos3);
            return;
        }
        hanota(n - 1, pos1, pos3, pos2);
        move(pos1, pos3);
        hanota(n - 1, pos2, pos1, pos3);
    }

    public static void move(char pos1, char pos2) {
        System.out.println(pos1 + "->" + pos2);
    }

    public static void main15(String[] args) {
        hanota(3, 'A', 'B', 'C');
    }

    public static void func(int num) {
        if (num == 0) {
            return;
        }
        else {
            func(num / 10);
            System.out.println(num % 10);
        }
    }
    public static void main14(String[] args) {
        func(1234);
    }

    public static boolean isLeapYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main13(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean flag = isLeapYear(year);
        if (flag == true) {
            System.out.println(year+"是闰年");
        }
        else {
            System.out.println(year+"不是闰年");
        }
    }

    public static void main12(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int count = 0;
        while (val != 0) {
            val = val & (val - 1);
            ++count;
        }
        System.out.println(count);
    }

    public static void main11(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        for (int i = 0; i < val; i++) {
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                tmp /= 10;
                ++count;
            }
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }
    public static void main9(String[] args) {
        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            }
            System.out.print("\n");
        }
    }
    public static void main8(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            int j = 2;
            for (; j <= Math.sqrt(i); ++j) {
                if (0 == i % j) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.println(i + "是素数");
            }
            else {
                System.out.println(i + "不是素数");
            }
        }
    }
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int i = 2;
        for (; i <= Math.sqrt(val); ++i) {
            if (val % i == 0) {
                break;
            }
        }
        if (i > Math.sqrt(val)) {
            System.out.println(val + "是素数");
        }
        else {
            System.out.println(val + "不是素数");
        }
    }
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(50) + 50;

        while (true) {
            System.out.print("请输入要猜的数字: ");
            int guestNum = scan.nextInt();
            if (guestNum > randNum){
                System.out.println("猜大了");
            } else if (guestNum == randNum) {
                System.out.println("恭喜你猜对了" + randNum);
                break;
            }
            else{
                System.out.println("猜小了");
            }
        }

    }
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            System.out.println(a);
        }
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);

        int n = scan.nextInt();

        System.out.println(n);
    }

    public static void main3(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (!(i % 5 == 0 && i % 3 == 0)) {
                ++i;
                continue;
            }
            System.out.println(i);
            ++i;

        }
    }
    public static void main2(String[] args) {
        short a = 12;
        a += 66535;
        System.out.println(a);
    }
    public static void main1(String[] args) {
        System.out.println("hello world");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        int a = 12324;
        String str = Integer.toString(a);
        String str1 = String.valueOf(a);
        System.out.println(str);
        System.out.println(str1);
        String str2 = str.toString();
        System.out.println(str2);
        int b = Integer.valueOf(str);
        System.out.println(b);
    }
}
