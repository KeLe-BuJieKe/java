package demo1;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 2:30
 */

/**
 * Cloneable是一个标志性接口，即该接口没有包含任何方法或属性，只是作为一个标志告诉Java虚拟机该类可以被克隆。
 * 当一个类实现了Cloneable接口，就表示它支持使用Object类的clone()方法进行克隆操作，
 * 否则使用clone()方法会抛出CloneNotSupportedException异常。需要注意的是，
 * Cloneable接口并没有规定clone()方法的具体实现，需要自己在类中重写clone()方法，
 * 否则克隆操作只是浅拷贝（即只拷贝对象的引用而不是对象本身），而不是深拷贝（拷贝对象本身）。
 * 因此，在实现Cloneable接口的类中，通常需要自己编写clone()方法，以实现想要的克隆功能。
 */
class Money implements Cloneable{
    public double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return Double.compare(money1.money, money) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }
}

class Student implements Cloneable {
    //不可变对象，编译器直接进行深拷贝
    public String name;
    //可变对象，编译器默认浅拷贝
    public Money money = new Money();
    public int[] arr = new int[2];
    public Student(String name) {
        this.name = name;
        arr[0] = 0;
        arr[1] = 1;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.money = (Money)this.money.clone(); //深拷贝
        student.arr = (int[]) this.arr.clone();
        return student;
        //return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student)obj;
        return this.name.equals(student.name) &&
                this.money.equals(student.money) &&
                Arrays.equals(arr, student.arr);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(money, student.money) &&
                Arrays.equals(arr, student.arr);
    }*/

    @Override
    public int hashCode() {
        int result = Objects.hash(name, money);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

}
public class Test {
    public static void main2(String[] args) {
        Student student1 = new Student("张三");
        Student student2 = new Student("张三");
        System.out.println(student1.equals(student2));
        //我们希望这两个对象 放到同一个位置去
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }

    public static void main(String[] args) {
        Student student1 = new Student("张三");
        try{
            Student student2 = (Student)student1.clone(); //深拷贝
            student2.money.money = 200;
            student2.name = "李四";
            student2.arr[0] = 3;
            student2.arr[1] = 4;
            System.out.println(student1.name);
            System.out.println(student2.name);
            System.out.println(student1.money.money);
            System.out.println(student2.money.money);
            System.out.println(Arrays.toString(student1.arr));
            System.out.println(Arrays.toString(student2.arr));

        }
        catch (CloneNotSupportedException Exception) {

        }
    }
}

