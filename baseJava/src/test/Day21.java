package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Day21 {
    /**
     *     1. 集合Collection中存储的如果是自定义类的对象，需要自定义类重写哪个方法？为什么？
     *          equals()方法。  contains() /remove()/retainsAll() ….
     *          List：equals()方法
     *          Set：(HashSet、LinkedHashSet为例)：equals()、hashCode()
     *               (TreeSet为例)：Comparable：compareTo(Object obj)
     *
     *     2. ArrayList,LinkedList,Vector三者的相同点与不同点？【面试题】
     *          Vector 是古来实现类， 数组实现， 线程安全， 性能低。
     *          ArrayList 是Vector的继任者，数组是吓死你， 线程不安全， 性能高。
     *          LinkedList  链表实现， 增删快， 查询慢。
     *
     *     3. List 接口的常用方法有哪些？(增、删、改、查、插、长度、遍历)
     *          add(Object obj)
     *          remove(Object obj)/remove(int index)
     *          set(int index,Object obj)
     *          get(int index)
     *          add(int index,Object obj)
     *s         ize()
     *          使用Iterator;foreach;普通的for
     *
     *     4. 如何使用Iterator和增强for循环遍历List。举例说明
     *          ArrayList<String> list = new ArrayList<>();
     *          for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
     *              System.out.println(iterator.next());
     *          }
     *          for (String str : list) {
     *              System.out.println(str);
     *          }
     *
     *     5. Set存储数据的特点是什么？常见的实现类有什么？说明一下彼此的特点。
     *          HashSet         Set 基础实现类
     *          LinkedHashSet   相比 Set， 内部维护了前一个和后一个， 遍历会更快。
     *          TreeSet         自动排序， 默认情况下需要重写 compareTo() 方法, 或者添加 Comparator 排序对象
     *          HashMap         Map 基础实现
     *          LinkedHashMap   优化遍历。
     *          TreeMap         根据 Key 自动排序, Key 需实现 compareTo, 或者使用 Comparator 自定义排序
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
