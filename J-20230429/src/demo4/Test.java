package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 21:30
 */

abstract class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IRunning{
    void run();
}

interface  ISwimming {
    void swim();
}

interface  IFly {
    void fly();
}

class Dog extends Animal implements IRunning {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(name + " 狗正在用四条腿跑！");
    }
}

class Fish extends Animal implements  ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " 鱼正在用鱼鳍游泳！");
    }
}

class Bird extends Animal implements IFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " 鸟正在用翅膀在飞！");
    }
}

//继承是 is-a语义   接口表示的是 具有什么特性
//不支持多继承，但是支持实现多接口
class Goose extends Animal implements IRunning, ISwimming, IFly {
    public Goose(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(name + " 鹅正在跑！");
    }

    @Override
    public void swim() {
        System.out.println(name + " 鹅在游泳！");
    }

    @Override
    public void fly() {
        System.out.println(name + " 鹅在飞！");
    }
}

public class Test {
    public static void walk(IRunning iRunning) {
        iRunning.run();
    }

    public static void swim(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void main(String[] args) {
        walk(new Dog("猪蹄"));
        walk(new Goose("丑小鸭1"));
        System.out.println("-------------------");
        swim(new Fish("泡泡"));
        swim(new Goose("丑小鸭2"));
    }
}
