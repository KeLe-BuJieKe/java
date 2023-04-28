package demo6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 1:52
 */
class Student implements Comparable<Student> {
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
        return this.age - o.age;
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class ScoreComparator implements  Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.score - o2.score;
    }
}

class NameComparator implements  Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",19,10);
        students[1] = new Student("lisi",59,20);
        students[2] = new Student("abc",39,5);
        //比较器
        AgeComparator ageComparator = new AgeComparator();

        ScoreComparator scoreComparator = new ScoreComparator();

        NameComparator nameComparator = new NameComparator();

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, ageComparator);  //相当于C++在sort函数中传入函数指针、仿函数、lambda，使其按照指定方式比较
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, scoreComparator);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, nameComparator);
        System.out.println(Arrays.toString(students));
    }
}
