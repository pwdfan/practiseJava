package test;

import org.junit.Test;

public class Day1 {
    /** day 1
     1. JDK,JRE,JVM三者之间的关系，以及JDK、JRE包含的主要结构有哪些
        JVM: Java 虚拟机
        JRE: JVM + 运行库文件
        JDK: JRE + 开发工具
        三者为包含关系

     2. 为什么要配置path环境变量？如何配置？
        不配置环境变量， 将只能在 JDK 中的bin 目录下执行 Java 命令， 使用起来会非常麻烦， 每次运行都要从输入全路径。
        添加环境变量后， 就只需要输入 java 就可以了。
        windows 系统在系统高级中设置。 JAVA_HOME:jdk  PATH:%JAVA_HOME%/bin

     3. 常用的几个命令行操作都有哪些？(至少4个)
        ls(dir) cd pwd vi mv cp rm mkdir touch dh grep

     4.创建如下的类，使得运行的话可以输出：
        姓名：Jhon
        性别：男
        年龄：29

     5.编译和运行上述代码的指令
        编译： javac MyInfo.java
        运行： java MyInfo
     */

    @Test
    public void testShowMyInfo(){
        String name = "Jhon";
        String gender = "男";
        int age = 29;
        StringBuffer stringBuffer = new StringBuffer(name.length() + gender.length() + 3);
        stringBuffer.append("姓名 : " + name + "\n");
        stringBuffer.append("性别 : " + gender + "\n");
        stringBuffer.append("年龄 : " + age + "\n");
        System.out.println(stringBuffer);
    }

}
