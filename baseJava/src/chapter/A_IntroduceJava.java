package chapter;

public class A_IntroduceJava {
    /** 1 Java 语言的特点是什么
     *      面向对象
     *      跨平台
     *      编译后可以直接在任何平台运行。
     *      适合开发复杂的大型项目
     *      自动释放内存
     */

    /** 2 System.out.println()和System.out.print()什么区别呢？
     *      println 调用 print, 结束后加了一个换行。
     */

    /** 3 一个".java"源文件中是否可以包括多个类（不是内部类）？
     *      可以写很多类, 但是只能有一个 public 修饰的，且必须和文件名相同。
     */

    /** 4 Something类的文件名叫OtherThing.java
     *      Something 被 public 修饰， 编译错误。
     *      如果类名不是 public 修饰， 语法上是通过允许的, 但是不符合语义， 给维护造成困难， 不建议使用。
     */

    /** 5 为什么要设置path（或者说，设置path的目的是什么）？
     *      不设置 path, 运行 java 必须使用 `?/jdk/bin/java` 这样的全路径， 输入 java 只能在 bin 目录下有效
     *      设置 path 后， 可以在任何目录， 直接输入 java 运行 java 软件。
     *      同时， 一些软件， 需要使用到该环境变量, 比如 tomcat， 不设置好是无法启动的。
     */

    /** 6 JDK,JRE和JVM的关系是什么？
     *      包含关系， 前者包含后者。
     *      JDK:    开发工具和JRE
     *      JRE:    运行库和JDK
     *      JDK:    Java 虚拟机
     */

    /** 7 源文件名是否必须与类名相同？如果不是，那么什么情况下，必须相同？
     *      非 public 类不是必须相同， 可以有多个， 但是不推荐这种使用方法。
     *      public 修饰的， 必须和文件名相同。
     */

    /** 8 程序中若只有一个public修饰的类，且此类含main方法。那么类名与源文件名可否不一致？
     *      必须和源文件一致， 否则编译失败
     */

    /** 9 ava的注释方式有哪几种，格式为何？
     *      // 单行注释
     *      /** 文档注释 */
            /* 多行注释 */

    /** 10 自己使用java文档注释的方式编写程序，并用javadoc命令解析
     *
     */
        /** ///: $TestInner.java
         * 测试文档注释
         */
        static class TestInner {
            /** 唯一ID */
            private int id;
            /** 程序入口 */
            public static void main(String[] args) {
                System.out.println("TestInner");
            }
            /* Output 100%
                TestInner
             */
        }
        // javadoc chapter.A_IntroduceJava.TestInner

    /** 11 超纲题目：GC是什么? 为什么要有GC
     *      GC是垃圾回收系统， 垃圾回收是一个线程， 负责分配， 回收内存， 这样就不需要程序员来管理内存的释放。
     *      使用 GC 可以大幅度减少程序员的工作， 降低堆程序员的要求， 提高开发效率。
     */

    /** 12 超纲题目：垃圾回收器的基本原理是什么？垃圾回收器可以马上回收内存吗？有什么办法主动通知虚拟机进行垃圾回收
     *      垃圾回收器会监控堆中的对象， 只要栈内存中没有引用到的， 就会被标记， 在内存不足时候， 会被清理， 简单说， 垃圾回收期是分代的， 自适应的标记清扫、停止、复制。
     *      由于回收资源的行为本身也会占用资源， 所以只有内存不足时才会执行清理动作。
     *      System.gc() 可以建议虚拟机清理内存， 但最终的决定权还是在虚拟机， 程序员不能准确的控制。
     */
}
