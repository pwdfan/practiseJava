package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiConsumer;

public class Day22 {
    /**
     * 1. Map存储数据的特点是什么？并指明key，value，entry存储数据的特点。
     *      获取数据和插入数据都是 O(1), 通过 Key 的 Hash 值和内存地址映射实现。
     *      Map 是键值对， Key是 Set 集合， Value 是 链表和红黑树
     *      Map 中包含 Entry, Entry 中有一个 Key 和 Value 属性.
     *
     * 2. 描述HashMap的底层实现原理(jdk 8版)
     *      内务维护数组， 根据 Key 的 hash 值， 取余数组长度， 得到位置。
     *      如果位置为空， 直接加入。 如果位置非空， 比较 equals, 相同则替换， 不同则追加.
     *      如果长度小于8， 作为链表存在， 否则转换为红黑树。
     *
     * 3. Map中常用实现类有哪些？各自有什么特点？
     *      HashMap:        基本实现类, 线程不安全。
     *      Properties:     获取，保存配置。
     *      HashTable:      古老实现类， 线程安全， 不支持null, 效率比较低。
     *      TreeMap:        以为 key 自动排序, 对象需要重写 compareTo 方法;
     *      CurrentHashMap: 多线程优化，为空时采用乐观锁， 非空单独锁定单个value.
     *
     * 4. 如何遍历Map中的key-value对，代码实现
     *      see code;
     *
     * 5. Collection和Collections的区别？
     *      Collection      是集合接口， 包含 List 和 Set
     *      Collections     是服务 List 和 Set 的工具类
     */
    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');

        System.out.println("forEach");
        for (Integer integer : map.keySet()) {
            System.out.println("key:" + integer + ", val:" + map.get(integer));
        }

        System.out.println("iterator");
        for (Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext(); ){
            Integer key = iterator.next();
            System.out.println("key:" + key + ", val:" + map.get(key));
        }

        System.out.println("stream");
        map.forEach((k, v) -> {
            System.out.println("key:" + k + ", val:" + v);
        });
    }

}
