package test;

import org.junit.Test;

public class Day13 {
    /**
     * 1. 如何实现向下转型？需要注意什么问题？如何解决此问题？
     *      使用 (type) 括号进行强制转换。
     *      为了保证类型正确， 应该提前使用 instanceof 判断， 或者比较 class 是否相等。
     *
     * 2. == 和 equals()有何区别？
     *      equals 是 Object 的方法， 只有引用类型可以使用。
     *      如果该昂发没有重写过， 则和 == 相同， 都是比较内存地址是否一样
     *      如果引用类型重写过， 则按照重写的逻辑比较。 JDK 中常见的类都重写了该方法。
     *          如果要使用 set， 还要重写 hashcode 方法.
     *
     * 3. class User{
     *      String name;
     *      int age;
     * 		//重写其equals()方法
     *      @Override
     *      public boolean equals(Object other){
     *          if (this == other){ // 内地地址相同肯定相同
     *              return true;
     *          }
     *          if (other == null || User.class != other.getClass()){ // 为 null, 或者类型不同， 返回 false
     *              return false;
     *          }
     *          User otherUser = (User)(other); // 转型后比较属性
     *          return name.equals(otherUser.name) && age == otherUser.age;
     *      }
     *    }
     *
     * 4. 写出8种基本数据类型及其对应的包装类
     *      byte    Byte
     *      short   Short
     *      char    Character
     *      int     Integer
     *      long    Long
     *      float   Float
     *      double  Double
     *
     * 5. 基本数据类型、包装类与String三者之间如何转换
     */
    @Test
    public void test(){
        // 基本类型和包装类, 可以直接赋值， 因为有自动拆装箱
        Integer num = Integer.valueOf(123);
        int intValue = num.intValue();
        num = intValue;
        intValue = num;

        // 基本类型和 String
        int num2 = Integer.parseInt("123");
        String numStr = String.valueOf(num2);
        numStr = "" + num2; // 性能比 valueOf 慢一倍

    }
}
