package test;

public class Day14 {
    /**
     * 1. static 修饰的属性，相较于实例变量，有哪些特别之处(>=3点)
     *      static 修饰的属于类， 一般用来服务与实例变量。
     *      类变量虚拟机只保存一份， 实例变量每个实例都有一份
     *      类变量在类加载时生成， 实例变量在构造方法运行时生成
     *
     *
     * 2. final 可以用来修饰哪些结构，分别表示什么意思
     *      局部变量：  不能修改。
     *      成员变量：  必须初始化（显式， 代码块， 构造）， 不能修改
     *      方法：     不能被重写。
     *      类：       不能被继承。
     *
     * 3. 代码实现单例模式的饿汉式
     *      class Singleton {
     *          public static final Singleton instance = new Singleton();
     *      }
     *
     * 4. 代码实现单例模式的懒汉式
     *      class Singleton {
     *          private static Inner {
     *              public static final Singleton instance = new Singleton();
     *          }
     *          public Singleton getInstance() {
     *              return Inner.instance;
     *          }
     *      }
     *
     * 5. 类的属性赋值的位置有哪些？先后顺序为何？
     *      默认初始化 （0， false, null)
     *      显式初始化 == 代码块初始化（private age = 13; {age = 15;})
     *      构造器初始化 （this.age = age;), 构造器中可以调用 set 方法
     *      修改属性    （setAge();)
     */
}
