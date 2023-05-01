package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-30
 * Time: 22:00
 */
public class Test {
    public static void main(String[] args) {
        /**
         * String StringBuilder 与 StringBuffer 区别
         * String的内容不可修改，StringBuilder StringBuffer的内容可以修改
         * StringBuffer采用同步处理，属于线程安全的，StringBuilder未采用同步处理
         */
        StringBuilder stringBuilder = new StringBuilder("abc");
        System.out.println(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer("abc");
        System.out.println(stringBuffer);


        stringBuilder.append("123").append(91);
        stringBuilder.append(19.9);
        System.out.println(stringBuilder);
        stringBuffer.append("123").append(91);
        stringBuffer.append(19.9);
        System.out.println(stringBuffer);
    }

    //--------------------截取--------------------
    public static void main7(String[] args) {
        String str = "abcdefgh";
        System.out.println(str.substring(2, 4));
    }
    //--------------------拆分--------------------
    public static void main6(String[] args) {
        String str = "hhh aaa zzz dasdsa";
        String[] strArr = str.split(" ");
        for (String tmp: strArr) {
            System.out.println(tmp);
        }
        System.out.println("--------------------");
        String[] strArr2 = str.split(" ", 2); //只让切割出2组
        for (String tmp: strArr2) {
            System.out.println(tmp);
        }

        String str2 = "192.168.0.1";
        String[] strArr3 = str2.split("\\."); //对于 . | + * 等符号要进行转义
        System.out.println("--------------------");
        for (String tmp: strArr3) {
            System.out.println(tmp);
        }

        //当想以多个字符为分割时，参数以 | 来作分割
        String str3 = "kele.bue@jieke@163.com";
        String[] strArr4 = str3.split("@|\\.");
        System.out.println("--------------------");
        for (String tmp: strArr4) {
            System.out.println(tmp);
        }
    }


    //--------------------替换--------------------
    //替换不会对原串进行任何的修改，它会创建一个新对象来替换
    public static void main5(String[] args) {
        String str = "ababcabcdabcde";

        System.out.println(str.replace('a', 'p'));
        System.out.println(str.replace("ab", "oo"));

        System.out.println(str.replaceAll("ab", "666"));
        System.out.println(str.replaceFirst("ab", "999"));
        System.out.println(str);
    }


    //--------------------转换--------------------
    public static void main4(String[] args) {
        String str = String.valueOf(123);
        System.out.println(str);
        String str1 = "1234";
        System.out.println(Integer.parseInt(str1));
        System.out.println(Double.parseDouble(str1));

        String str2 = "ABCD";
        String str3 = "abcd";
        System.out.println(str2.toLowerCase()); //大小写转换
        System.out.println(str3.toUpperCase());

        String str4 = "abcd";
        char[] arr = str4.toCharArray();
        System.out.println(arr);
    }

    //--------------------查找--------------------
    //lastIndexOf
    public static void main3(String[] args) {
        String str1 = "adsajhdsabadsa";
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.lastIndexOf("ad"));
    }

    //indexof
    public static void main2(String[] args) {
        String str1 = "adsajhdsabadsa";
        //在主串中查找字符的第一次出现的位置。或者从某个位置开始查找
        System.out.println(str1.indexOf('s'));
        System.out.println(str1.indexOf('s', 3));
        System.out.println(str1.indexOf("ajh"));//在主串中查找子串的第一次出现的位置
    }

    //compareto equals charat
    public static void main1(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1.equals(str2)); //不忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写

        System.out.println(str1.compareTo(str2)); //不忽略大小写
        System.out.println(str1.compareToIgnoreCase(str2));//忽略大小写

        for (int i = 0; i < str1.length(); ++i) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
    }
}
