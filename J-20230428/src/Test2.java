/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 00:57
 */

class Animal {
    public String name;
    public int age;

    public void eat () {
        System.out.println(name + "正在吃饭! ");
    }
    public Animal() {

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + "正在狗叫");
    }
    public int n;
    public Dog() {
        super();
    }
    public Dog(String name, int age) {
        //在继承关系上。当我们构造子类的时候，一定要先帮助父类进行构造
        //super与this()一样，在子类构造方法内， 调用父类构造方法的时候，一定要放在第一行
        //且super与this()调用构造方法时不能同时出现
        //例如Dog中的n
        //先写 this.n = 10;  后写super(name, age);是会报错的,调换顺序后即可
        super(name, age);  //显示的调用父类的构造方法，帮助父类的成员进行初始化
        this.n = 10;
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(name + "正在猫叫");
    }
    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

}

public class Test2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
    }
}
