/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 15:10
 */
class Animal {
    public String name;
    public int age;
    /**重写
     * 方法名称相同  参数列表相同  返回值相同 与C++一致  同理也有C++的协变，即返回值可以不相同,但必须是父子类关系
     * 注意点：
     * private 修饰的方法不能重写
     * static 修饰的方法不能重写
     * 子类的访问修饰限定权限  要大于等于父类的权限  private < 默认 < protected < public
     * 被 final 修饰的方法 是不能重写的 此时这个方法 被称作 密封方法
     */
    public void eat() {
        System.out.println(name + ": 正在吃饭!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + ": 正在狗叫");
    }

    @Override
    public void eat() {
        System.out.println(name + ": 正在吃狗粮!");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(name + ": 正在猫叫");
    }

    @Override
    public void eat() {
        System.out.println(name + ": 正在吃猫粮!");
    }
}


public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog)animal;
        animal.name = "向下转型";
        dog.bark();

        //向下转型之前要检查  即animal这个引用 是不是引用了Cat对象
        if (animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.meow();
        }
    }

    public static void main1(String[] args) {
        Animal animal = new Dog();  //向上转型
        animal.name = "向上转型";
        animal.eat();
    }
}
