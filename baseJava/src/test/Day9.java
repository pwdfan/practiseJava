package test;

public class Day9 {
    /**
     * 1. 什么是方法的重载？
     *      方法名相同， 但是参数不同， 构成重载。
     *      编译器认为方法名和参数是一个整体， 必须完全匹配。
     *
     * 2. 说明Java方法中的参数传递机制的具体体现？
     *      参数传递的是 栈内存的值, 基本类型直接保存在栈内存， 引用类型保存堆内存的地址值。
     *      基本类型可以理解为完全拷贝。
     *      引用类型是地址拷贝, 本身地址不会影响， 但是内部的属性默认还是可以修改的。
     *
     * 3. 成员变量和局部变量在声明的位置上、是否有默认初始化值上、是否能有权限修饰符修饰上、内存分配的位置上有何不同？
     *      成员变量声明在类中，允许使用修饰符，有初始化值，引用保存在堆内存。
     *      局部变量声明在方法中，不能使用修饰符，必须手动初始化，引用保存在栈内存。
     *
     * 4. 谈谈return关键字的使用
     *      结束方法， 并返回值。
     *      void 方法仅表示结束方法。
     *
     * 5. 提供如下代码的内存解析
     */
    static class TransferTest {
        public static void main(String[] args) {
            new TransferTest().first();
        }
        public void first() {
            int i = 5;
            Value v = new Value();
            v.i = 25;
            second (v, i);
            System.out.println(v.i);
        }

        private void second(Value v, int i) {
            i = 0;
            v.i = 20; // 此处修改成功
            Value val = new Value();
            v = val; // 此处无法修改
            System.out.println(v.i + " " + i);
        }
    }
    static class Value {
        int i = 15;
    }
}
