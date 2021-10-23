package test;

import java.util.Locale;

public class Day18 {
    /**
     * 1. 画出如下几行代码的内容结构：
     *      String s1 = "hello"; // 栈内存 s1 指向 常量池 hello
     *      String s2 = "hello"; // 栈内存 s2 指向 常量池 hello
     *      String s3 = new String("hello"); // 栈内存 s3 指向堆内存, 堆内存又指向常量池
     *      s1 += “world”;      // 先运算， 栈内存 s1 指向 堆内存的运算结果 helloworld
     *
     * 2. 如何理解String类的不可变性
     *      内部的字符数组是 final 修饰的。
     *
     * 3. String类是否可以被继承？为什么？
     *      不可以被继承， 因为 String 被 final 修饰。
     *      String s = new String(“hello”);在内存中创建了几个对象？请说明
     *          常量池对象 hellp, 堆内存对象 String, 一共两个对象。
     *
     * 4. String，StringBuffer，StringBuilder三者的对比
     *      String 内部是不可变数组， 因此无法修改
     *      StringBuffer 内部是可变数组， 线程安全， 效率不高
     *      StringBuilder 内部是可变数组， 线程不安全， 效率高
     *
     * 5. String的常用方法有哪些？（至少7个）
     *      int length(); // 获取长度
     *      boolean equals(Object o); // 对比字符是否完全相同
     *      char charAt(int index); // 获取指定位置的字符串
     *      int indexOf(char c); // 获取 char 第一次出现的索引
     *      boolean matches(String pattern); // 判断正则是否匹配
     *      boolean contains(String str); // 是否包含
     *      byte[] getBytes(); // 转换为字节数组
     *      char[] toCharArray(); // 转换为字符数组
     *      String replace(oldStr, newStr); // 替换返回新的字符串
     *      String toUpperCase(); // 转换大写并返回
     *      boolean startWith(str); // 是否以 start 开头
     *      String valueOf(Object); // 将其他类型转换为字符串
     */
}
