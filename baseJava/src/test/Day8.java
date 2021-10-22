package test;

import org.junit.Test;

public class Day8 {
    /**
     * 1. 面向对象思想是什么?
     *      面向对象是一种更高级的抽象，屏蔽了底层的复杂， 提供通用性更高的类， 帮助程序员更简单的模拟现实问题。
     *      面向对象不可避免会损失性能， 但是相对于开发效率， 可以忽略不计。
     *      Java 在面向对象的基础上， 屏蔽了平台差异.
     *
     * 2. 谈谈你对面向对象中类和对象的理解，并指出二者的关系?
     *      类理解为设计蓝图， 对象是根据设计蓝图产生的产品, 产品之间是可以有些许不同， 但是整体的框架是类决定的。
     *
     * 3. 面向对象思想的体现一：类和对象的创建和执行操作有哪三步？
     *      首先是加载类资源到虚拟机.
     *      虚拟机分配空间，
     *      创建对象的属性并分配为默认值，
     *      执行构造方法， 构造方法返回创建完成的对象。
     *
     * 4. 画出如下代码在执行时的内存分配情况
     *      class Car{
     *        String color = "red";
     *        int num = 4;
     *        void show(){
     * 			  int a = 10;
     * 	          System.out.println("color="+color+",num="+num);
     *         }
     *      }
     *      class CarTest {
     * 	        public static void main(String[] args) {  // 加载 CarTest 类资源， 并执行 main 方法
     * 	        	Car c1 = new Car();             // 加载 Car 类， 创建 Car 对象 指向 c1
     * 	            Car c2 = new Car();             // 继续创建一个 Car 对象 指向 c2
     * 	        	c1.color = "blue";              // c1 的 Car 对象的 color 值修改为 blue
     * 	        	c1.show();                      // 调用 c1 的 show 方法 (blue, 4)
     * 	        	c2.show();                      // 调用 c2 的 show 方法 (red, 4)
     *          }
     *      }
     *
     * 5. 类的方法内是否可以定义变量？是否可以调用属性？是否可以定义方法？是否可以调用方法？
     *      方法内 可以 定义 局部变量
     *      方法内 可以 使用 属性
     *      方法内 不能 定义 方法
     *      方法内 可以 调用 方法
     */

    static class Car{
        String color = "red";
        int num = 4;
        void show(){
            int a = 10;
            System.out.println("color="+color+",num="+num);
        }
    }
    static class CarTest {
        public static void main(String[] args) {  // 加载 CarTest 类资源， 并执行 main 方法
            Car c1 = new Car();             // 加载 Car 类， 创建 Car 对象 指向 c1
            Car c2 = new Car();             // 继续创建一个 Car 对象 指向 c2
            c1.color = "blue";              // c1 的 Car 对象的 color 值修改为 blue
            c1.show();                      // 调用 c1 的 show 方法 (blue, 4)
            c2.show();                      // 调用 c2 的 show 方法 (red, 4)
        }
    }
}
