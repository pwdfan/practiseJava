package test;

public class Day12 {
    /**
     * 1. 什么是多态性？什么是虚拟方法调用？
     *      基类的引用， 可以指向扩展类的实例。
     *      基类执行方法， 如果扩展类重写了， 会执行扩展类重写的方法。
     *      Java 语言默认调用的是虚拟方法， 不是直接调用当前类的方法。
     *      属性没有这个特点， 由于属性基本都是私有的， 所以影响不大。
     *
     * 2.  一个类可以有几个直接父类? 一个, 单继承。
     *     一个父类可有多少个子类？多个, Object 子孙满天下
     *     子类能获取直接父类的父类中的结构吗？ 可以获取， 包括私有
     *
     * 3. 方法的重写(override/overwrite)的具体规则有哪些？
     *      方法名和参数列表相同
     *      权限相同或更大
     *      返回值类型相同或者是子类
     *      异常相同或者是子类
     *      推荐和父类完全相同。
     *
     * 4. super调用构造器，有哪些具体的注意点
     *      默认编译器会添加一个空参的 super() 调用
     *      必须放在第一行， 不能和 this 同时出现
     *      可以根据参数， 重载直接父类的构造方法
     *
     * 5. 在下面的代码结构中：使用关键字：this,super;方法的重写;继承;
     */
    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle() {
            this(1);
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
    static class Cylinder extends Circle {
        private double length;

        public Cylinder(double radius, double length) {
            super(radius);
            this.length = length;
        }
        public Cylinder(double length) {
            super();
            this.length = length;
        }
        public Cylinder() {
            this(1);
        }

        public double getVolume(){
            return getArea() * length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    }
}