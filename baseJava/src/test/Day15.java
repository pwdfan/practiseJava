package test;

import java.util.Map;

public class Day15 {
    /**
     *
     1. abstract 能修饰哪些结构？ 修饰以后，有什么特点？
        类：      该类无法被实例化。
        方法:     该方法没有方法体， 该类也必须为抽象类。
        日常开发中， 如果一些类的部分功能都是相同的，可以使用抽象类， 相同的代码使用普通方法， 不同的代码使用抽象方法, 扩展类只需重写抽象方法就可。

     2. 接口是否能继承接口? 抽象类是否能实现(implements)接口? 抽象类是否能继承非抽象的类?
        接口可以继承接口， 并且可以多继承。
        抽象类可以继承接口， 也口译继承抽象类。
        抽象类可以继承非抽象的类， 比如 Object.

     3. 声明抽象类，并包含抽象方法。测试类中创建一个继承抽象类的匿名子类的对象
        abstract class MyAbstractClass {
            public abstract String getName();
            public void sayHello() {
                System.out.println("Hello, My name's " + getName());
            }
        }
        class TestMyAbstractClass {
            public static void main(String[] args) {
                MyAbstractClass myClass = new MyAbstractClass(){
                    public String getName() {return "Jhon";}
                };
                myClass.sayHello();
            }
        }

     4. 抽象类和接口有哪些共同点和区别？
        共同点： 都不能实例化， 方法可以是抽象的。
        不同点： 接口中的方法默认是抽象的，属性是静态fianl的。 抽象类和普通的类一样， 允许使用私有方法。
               接口功能不如抽象类， 但是可以突破单继承限制。
               接口更加关注规范， 抽象类主要是提供功能， 复用代码。


     5. 如何创建静态成员内部类和非静态成员内部类的对象？
        静态内部类可以直接实例化， 不需要以来外部对象。
        Outer.Inner = new Outer.Inner();

        普通内部类的实例化， 必须依赖外部对象
         Outer.Inner = new Outer(). new Inner();

     */
    // test3
    static abstract class MyAbstractClass {
        public abstract String getName();
        public void sayHello() {
            System.out.println("Hello, My name's " + getName());
        }
    }
    static class TestMyAbstractClass {
        public static void main(String[] args) {
            MyAbstractClass myClass = new MyAbstractClass(){
                public String getName() {return "Jhon";}
            };
            myClass.sayHello();
        }
    }

}
