package test;

import org.junit.Test;

import java.io.File;
import java.util.*;

public class Day23 {
    /**
     * 1. 如何遍历Map的key集，value集,key-value集，使用上泛型
         Set<String> keySet = map.keySet();
         Collection<String> values = map.values();
         Set<Map.Entry<String, String>> entries = map.entrySet();
         for (Map.Entry<String, String> entry : entries){
         String key = entry.getKey();
         String value = entry.getValue();
     *
     * 2. 写出使用Iterator 和 增强for 循环遍历List<String>的代码,使用上泛型
         List<String> list = new ArrayList<>();
         for (Iterator<String> iterator = list.iterator(); iterator.hasNext();  ){
         System.out.println(iterator.next());
         }
         for (String s : list) {
         System.out.println(s);
         }
     *
     * 3. 提供一个方法，用于遍历获取HashMap<String,String>中的所有value，并存放在List中返回。考虑上集合中泛型的使用。
         HashMap<String, String> map = new HashMap<>(); map.put("1", "张三");
         ArrayList<String> list = new ArrayList<>(map.values());
     *
     * 4. 创建一个与a.txt文件同目录下的另外一个文件b.txt
         File a = new File("a.txt");
         File b = new File(a.getParent(), "b.txt");
     *
     * 5. Map接口中的常用方法有哪些
     *      T put();
     *      T get();
     *      Set<T> keySet();
     *      Collection<T> values();
     *      boolean containsKey();
     *      boolean containsValue();
     *      Map.Entry<T,T> entrySet();
     *      int size();
     *      void clear();
     *      T remove();
     */
    @Test
    public void test1(){
        HashMap<String, String> map = new HashMap<>(); map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        Set<String> keySet = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
        }
    }

    @Test
    public void test2() {
        List<String> list = new ArrayList<>();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();  ){
            System.out.println(iterator.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test3() {
        HashMap<String, String> map = new HashMap<>(); map.put("1", "张三");
        ArrayList<String> list = new ArrayList<>(map.values());
    }

    @Test
    public void test4() {
        File a = new File("a.txt");
        File b = new File(a.getParent(), "b.txt");
    }
}

