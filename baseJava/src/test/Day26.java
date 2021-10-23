package test;

import org.junit.Test;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Day26 {
    /**
     * 1. 写出获取Class实例的三种常见方式
     *      Class.forName("java.lang.String");
     *      String.class;
     *      "".getClass();
     *
     * 2. 谈谈你对Class类的理解
     *      Class 可以理解为对 Java 中类的代理， 通过这个代理， 可以通过反射技术操作类。
     *
     * 3. 创建Class对应运行时类的对象的通用方法，代码实现。以及这样操作，需要对应的运行时类构造器方面满足的要求。
            Class<String> clazz = (Class<String>) Class.forName("java.lang.String");
            Constructor<String> declaredConstructor = clazz.getDeclaredConstructor(); // 必须有空参构造
            String str = declaredConstructor.newInstance();
     *
     * 4. 在工程或module的src下有名为”jdbc.properties”的配置文件，文件内容为：name=Tom。如何在程序中通过代码获取Tom这个变量值。代码实现
             Properties ps = new Properties();
             ps.load(new FileInputStream("temp/name.properties"));
             String name = ps.getProperty("name");
             System.out.println(name);
     *
     *
     * 5. 如何调用方法show()
     */

    @Test
    public void test3() throws Exception{
        Class<String> clazz = (Class<String>) Class.forName("java.lang.String");
        Constructor<String> declaredConstructor = clazz.getDeclaredConstructor();
        String str = declaredConstructor.newInstance();
    }

    @Test
    public void test4() throws Exception{
        Properties ps = new Properties();
        ps.load(new FileInputStream("temp/name.properties"));
        String name = ps.getProperty("name");
        System.out.println(name);
    }

    public static class User {
        public void show() {
            System.out.println("我是一个中国人");
        }
    }
    @Test
    public void test5() throws Exception{
        Class<User> userClass = (Class<User>) Class.forName("test.Day26$User");
        Constructor<User> userConstructor = userClass.getDeclaredConstructor();
        User user = userConstructor.newInstance();
        Method show = userClass.getDeclaredMethod("show");
        show.invoke(user);
    }
}
