/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-27
 * Time: 19:06
 */

class Animal {
    public String name;
    public int age;

    public void eat () {
        System.out.println(name + "正在吃饭! ");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + "正在狗叫");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(name + "正在猫叫");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "zj";

        Cat cat = new Cat();
        cat.name = "cdn";

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}
