package test;

import org.junit.Test;

public class Day2 {
    /**
     * 1. 标识符的命名规则有哪些？
     *      * 必须使用大写字母， 小写字母， 下划线， 美元符号, 中文字符
     *      * 不能用数字开头
     *      * 不能使用单个下划线
     *
     * 2. 标识符的命名规范有哪些？不遵守，编译运行都可以通过
     *      * 包名:xxx.yyy.zzz
     *      * 类名、接口名：XxxYyyZzz
     *      * 变量名、方法名：xxxYyyZzz
     *      * 常量名：XXX_YYY_ZZZ
     *
     * 3. Java变量按照数据类型怎么划分？并指出Java的基本数据类型有哪8种，并指出各自占用的内存空间大小
     *      基本类型, 默认为 0:
     *          * byte(1) short(2) int(4) long(8)
     *          * char(2)
     *          * float(8) double(16)
     *          * boolean(4) // 理论上是1bit, 实际上虚拟机按照 byte 或者 int 处理。
     *      引用数据类型：
     *          类、接口、数组, 默认为 null, 内置占用为0；
     *
     * 4. 说明基本数据类型变量之间自动类型提升的运算规则。
     *      byte、short、char -int long float double
     *      注： char 类型不包含负数， 所以不支持
     *
     * 5. 说明基本数据类型变量之间强制类型转换的使用规则和强转可能出现的问题。
     *      容量小 -> 容量大， 直接转换， 要注意转换为浮点数会损失精度。
     *      容量大  容量小,  需要强制转换， 直接切二进制， 可能会造成意外的情况。
     *          强转符：()
     */


    @Test
    public void testVariable(){
        int $ = 1;
        int _1 = 1;
        int 汉字 = 2;
        int __ = 12;
    }
}
