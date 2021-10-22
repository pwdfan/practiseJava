package test;

public class Day10 {
    /**
     1. 构造器的作用是什么？使用中有哪些注意点(>=3条)
        构造器可以理解为一个创建对象的静态方法， 返回该对象本身。
        调用构造器的过程中， 虚拟机会负责加载资源， 分配空间并初始化默认值， 构造方法结束后， 将该对象的引用返回。
        不写构造的情况下， 虚拟机默认提供空参构造, 写构造后将不会提供， 为了确保框架访问， 建议提供空参。

     2. 关于类的属性的赋值，有几种赋值的方式。谈谈赋值的先后顺序
        方式和顺序：
            默认初始化 (0， false, null)
            显示初始化 (声明时赋值 或 代码块中赋值)
            构造初始化 (构造方法中赋值)
            调用赋值   (set 修改， 对象.属性修改)

     3. this关键字可以用来调用哪些结构，简单说明一下其使用。
        this 在类中， 表示当前对象， 在使用属性或者方法都可以使用， 但是不推荐， 因为这是默认的情况。
        this 一般只有2种情况下使用， 一是在构造方法中， 为了保证语义， 局部变量会覆盖属性， 需要加 this 区分。
            还有就是在构造器中， 第一行可以重载调用其他构造器。

     4. Java中目前学习涉及到的四种权限修饰符都有什么？并说明各自的权限范围
        private 私有的， 只能在当前类中使用
        default 默认的， 在同一个包下， 都可以使用。
        protected   子类， 同一个包下和不同包子类使用。
        public  公开的， 任何位置都可以使用。

        属性一般都设置为私有， 除了实现接口， 其他方法都不应设置为公开。
        在一个类中，所有的权限尽可能的小，只暴露必要的方法，

     5. 创建Circle类，提供私有的radius属性，提供相应的get和set方法，提供求圆面积的方法。
     */
    static class Circle {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
}
