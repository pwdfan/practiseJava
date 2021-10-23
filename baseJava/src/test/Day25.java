package test;

public class Day25 {
    /**
     * 1. 一个IP对应着哪个类的一个对象？
     *      InetAddress
     *    实例化这个类的两种方式是？
     *      InetAddress.getByName(String host);
     *      InetAddress.getLocalHost();//获取本地ip
     *    两个常用的方法是？
     *      getHostName();
     *      getHostAddress();
     *
     * 2. 传输层的TCP协议和UDP协议的主要区别是？
     *      TCP:可靠的数据传输(三次握手)；进行大数据量的传输；效率低
     *      UDP:不可靠；以数据报形式发送，数据报限定为64k；效率高
     *
     * 3. 什么是URL，你能写一个URL吗？
     *      URL:统一资源定位符
     *      URL url = new
     *      URL(“http://192.168.14.100:8080/examples/hello.txt?username=Tom”);
     *      URI: 统一资源标识符， URI 包含URL
     *
     * 4. 谈谈你对对象序列化机制的理解
     *      序列化过程：将对象转换为二进制文件， 保存到硬盘。
     *      反序列化过程：将硬盘中的二进制对象， 恢复为对象。
     *      transient: 修饰属性， 告诉编译器改属性没有保存价值， 恢复后为默认值(0, null, false);
     *
     * 5. 对象要想实现序列化，需要满足哪几个条件
     *      1. 实现接口：Serializable 表示接口， 必须使用。
     *      2. 对象所在的类提供常量：序列版本号, 如果不提供， 虚拟机根据类的信息计算， 修改类属性后将无法恢复。
     *      3. 要求对象的属性也必须是可序列化的。（基本数据类型、String：本身就已经是可序列化的。）
     */
}
