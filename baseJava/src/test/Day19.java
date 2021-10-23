package test;

import org.junit.Test;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Day19 {
    /**
     * 1. 将字符串”2017-08-16”转换为对应的java.sql.Date类的对象。
     *      see test1
     *
     * 2. 解释何为编码？解码？ 何为日期时间的格式化？解析？
     *      电脑底层仅支持二进制， 将文字变为二进制的过程是编码， 将二进制变为文字的过程是解码, 这个过程同样适用于其他格式， 比如图片和视频。
     *
     *      日期和时间在电脑中是一个 long 类型的整数， 从 1970 年开始计算， 每秒加 1000.
     *      很明显， 这种格式是人类无法轻松阅读的， 需要转换为人类容易理解的格式, 这个过程叫格式化。
     *      反之， 人类的时间让计算机知道， 只需要告诉计算机格式和文本， 计算机会自己解析并得到结果。
     *
     * 3. 自定义Person类如下，如何实现自然排序（按姓名从小到大排序），代码说明
     *      class person implements comparable{
     *      	private string name;
     *      	private int age;
     *      	public int compareto(object obj){
     *              person other = (person) obj;
     *      		return this.name.compareTo(other.name);
     *          }
     *      }
     *
     * 4. 提供定制排序涉及到的接口的实现类对象，并按Person类的年龄从大到小排序
         Person[] people = new Person[10];
         Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
            return Integer.compare(o1.age, o2.age);
            }
        });
         ArrayList<Person> people1 = new ArrayList<>();
         Collections.sort(people1, (p1, p2) -> Integer.compare(p1.age, p2.age) );
         Collections.sort(people1, Comparator.comparingInt(p -> p.age));
     *
     *
     * 5. JDK 8之前和JDK8中日期、时间相关的类分别有哪些？
     *      JDK7                    JDK8
     *      Date                    LocalDate, LocalTime, LocalDateTime
     *      Calendar                Duration, Instant
     *      SimpleDateFormat        DateTimeFormatter
     */
    @Test
    public void test1() throws ParseException {
        // 字符串转换Date
        String dateStr = "2017-08-16";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(sdf.parse(dateStr).getTime());
        System.out.println(date);

        // Date 转换字符串
        String format = sdf.format(date);
        System.out.println(format);


        // JDK 8 实现 字符串转换 Date
        LocalDate ld = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(ld);
        String format1 = ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format1);
    }
    static class Person implements Comparable {
        private String name;
        private int age;
        @Override
        public int compareTo(Object o) {
            Person other = (Person)o;
            return name.compareTo(other.name);
        }

        public static void main(String[] args) {
            Person[] people = new Person[10];
            Arrays.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return Integer.compare(o1.age, o2.age);
                }
            });
            ArrayList<Person> people1 = new ArrayList<>();
            Collections.sort(people1, (p1, p2) -> Integer.compare(p1.age, p2.age) );
            Collections.sort(people1, Comparator.comparingInt(p -> p.age));
        }
    }
}

