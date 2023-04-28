package demo5;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 22:32
 */

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
        //return this.name.compareTo(o.name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",19,10);
        students[1] = new Student("lisi",59,20);
        students[2] = new Student("abc",39,5);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
