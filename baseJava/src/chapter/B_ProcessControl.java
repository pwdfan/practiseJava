package chapter;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class B_ProcessControl {
    /** 1分支结构, 写出结果 */
    @Test
    public void test1(){
        int m=0,n=3;
        if(m>0)
            if(n>2)
                System.out.println("A");
            else
                System.out.println("B");
    } //answer:没有结果

    /** 2 实现对三个整数进行排序，输出时按照从小到大的顺序输出。*/
    @Test
    public void test2() {
        int a = 10, b = 2, c = 30;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /** 3 编写程序，从键盘接收整数参数。如果该数为1-7，打印对应的星期值，否则打印“非法参数”。*/
    @Test
     public void test3() {
     	int week = (int)(Math.random() * 10);
     	switch(week){
     		case 1:
     			System.out.println("星期一：Monday");
     			break;
     		case 2:
     			System.out.println("星期二：Tuesday");
     			break;
     		case 3:
     			System.out.println("星期三：Wednesday");
     			break;
     		case 4:
     			System.out.println("星期四：Thursday");
     			break;
     		case 5:
     			System.out.println("星期五：Friday");
     			break;
     		case 6:
     			System.out.println("星期六：Saturday");
     			break;
     		case 7:
     			System.out.println("星期天：Sunday");
     			break;
     		default:
     			System.out.println("非法星期值");
     			break;
     	}
    }

     /** 4 从键盘分别输入年、月、日，判断这一天是当年的第几天 */
     @Test
     public void test4() {
         int year = (int)(Math.random() * 100 + 1950);
         int month = (int)(Math.random() * 12 + 1);
         int day = (int)(Math.random() * 31 + 1);
         int days = 0;
         //加前面几个月的满月天数
         switch(month){
             case 12:
                 days += 30;
             case 11:
                 days += 31;
             case 10:
                 days += 30;//九月
             case 9:
                 days += 31;//八月
             case 8:
                 days += 31;//七月
             case 7:
                 days += 30;//六月
             case 6:
                 days += 31;//五月
             case 5:
                 days += 30;//四月
             case 4:
                 days += 31;//三月
             case 3:
                 days += 28;//二月
                 if(year% 4==0 && year %100!= 0 || year%400 ==0){
                     days++;
                 }
             case 2:
             	days += 31;//一月
         }
         System.out.println(year + "年" + month + "月" + day + "日");
         System.out.println(days);
     }

     /** 5 switch是否能作用在byte上，是否能作用在long上，是否能作用在String上
            答：switch（expr1）中，expr1是一个整数表达式。因此传递给 switch 和 case 语句的参数应该是
            int、 short、 char 或者 byte。long不能作用于swtich.JDK1.7新加入了String类型。 */

    /** 6 编写程序，判断给定的某个年份是否是闰年*/
    @Test
    public void test6() {
        int year = 2000;
        if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("it is");
        } else {
            System.out.println("not is");
        }
    }

    /** 7 要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。*/
    @Test
    public void test7() {
        int a = (int)(Math.random() * 1000);
        int b = (int)(Math.random() * 1000);
        if (b % a == 0 || a + b > 1000) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    /** 8 使用条件结构实现，如果用户名等于字符‘青’，密码等于数字‘123’，就输出“欢迎你，青”，否则就输出“对不起，你不是青”。
          提示：先声明两个变量，一个是char型的，用来存放用户名，一个是int型的，用来存放密码。*/
    @Test
    public void test8() {
        String userName = "樊";
        String password = "123";
        if ("樊".equals(userName) && "123".equals(password)) {
            System.out.println("你好， 樊");
        }else{
            System.out.println("登录失败");
        }
    }

    /** 9 编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
          score>=90           等级：A
          70=<score<90        等级：B
        * 60=<score<70        等级：C
        * score<60            等级：D
     */
    @Test
    public void test9() {
        int score = (int) (Math.random() * 101);
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

    /** 10 根指定月份，打印该月份所属的季节。
             * 3,4,5春季 6,7,8夏季  9,10,11 秋季 12, 1, 2 冬季*/
    @Test
    public void test10() {
     	int month = (int)(Math.random()*12+1);
     	switch(month){
            case 3:
     		case 4:
     		case 5:
     			System.out.println("春季");
     			break;
     		case 6:
     		case 7:
     		case 8:
     			System.out.println("夏季");
     			break;
     		case 9:
     		case 10:
     		case 11:
     			System.out.println("秋季");
     			break;
     		case 12:
     		case 1:
     		case 2:
     			System.out.println("冬季");
     			break;
     		default:
     			System.out.println("非法月份");
     	}
    }

    /** 11 彩票游戏
     * 假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
     *      1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
     *      2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
     *      3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
     *      4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
     *      5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
     */
    @Test
    public void test11(){
        int guess = (int)(Math.random() * 100);
        int result = (int)(Math.random() * 100);
        int g1 = guess / 10;
        int g2 = guess % 10;
        int r1 = result / 10;
        int r2 = result % 10;
        if (g1 == r1 && g2 == r2) {
            System.out.println("10000");
        } else if (g1 == r2 && g2 == r1){
            System.out.println("3000");
        } else if (g1 == r1 || g2 == r2){
            System.out.println("1000");
        } else if (g1 == r2 || g2 == r1){
            System.out.println("500");
        } else {
            System.out.println("作废");
        }
    }

    /** 12 赌数游戏
     *提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
     *如果三个骰子点数和，小于或等于9，则为“小”。
     *如果三个骰子点数和，大于9，则为“大”。
     *用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
     */
    @Test
    public void test12() {
        int[] nums = {(int)(Math.random() * 6 + 1), (int)(Math.random() * 6 + 1),(int)(Math.random() * 6 + 1)};
        int result = -1;
        if (nums[0] == nums[1] && nums[0] == nums[2]){
            result = 0;
        }else if (Arrays.stream(nums).sum() <= 9){
            result = 1;
        }else{
            result = 2;
        }
        int guess = (int)(Math.random() * 3);
        String[] strs = {"豹子", "小", "大"};
        if (guess == result){
            System.out.println("猜对了, 结果是" + strs[guess]);
        }else {
            System.out.println("猜错了， 您的猜测是" + strs[guess] + ", 结果是" + strs[result]);
        }
    }

    /** 13 编写一个程序，为一个给定的年份找出其对应的中国生肖。*/
    @Test
    public void test13() {
        // 鼠、牛、虎、兔、龙、蛇、马、羊、猴、鸡、狗、猪
        String[] strs = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};
        int year = (int)(Math.random()*100+1900);
        int index = 1992 % 12 + year % 12;
        System.out.println(year + " : " + strs[index]);
    }

    /** 14 求ax2+bx+c=0方程的根。
     *      求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，
     *      如果a≠0，那么：
     *        （1） 当b2-4ac>0，则有两个解；
     *        （2） 当b2-4ac=0，则有一个解；
     *        （3） 当b2-4ac<0，则无解；
     *      如果a=0,b≠0，那么，x = -(c/b);
     */
    @Test
    public void test14() {
        double a = Math.random() * 100 + 1;
        double b = Math.random() * 100;
        double c = Math.random() * 100;
        if (a != 0) {
            double temp = b*b - 4*a*c;
            if(temp==0){
                double x = -b/(2*a);
                System.out.println("该方程是一元二次方法，有两个相同解：" + x);
            }else if(temp>0){
                double sqrt = Math.sqrt(temp);
                double x1 = (-b+ sqrt)/(2*a);
                double x2 = (-b- sqrt)/(2*a);
                System.out.println("该方程是一元二次方法，两个不同解：" + x1 +"," + x2);
            }else{
                System.out.println("该方程是一元二次方法，在实数范围内无解！");
            }
        }else{
            if(b!=0){
                double x = -c/b;
                System.out.println("该方程是一元一次方程，有一个解：" + x);
            }else{
                System.out.println("不是方程，是一个等式");
                if(c == 0){
                    System.out.println("等式成立");
                }else{
                    System.out.println("等式不成立");
                }
            }
        }
    }

    /** 15 下面代码的运行结果是： */
    @Test
    public void test15() {
        int a = 3;
        int b = 1;
        //if(a = b){ // if 中只能使用布尔值， 不支持 其他类型。
        if (a == b){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }

    /** 16 What is the result when you compile and run the following code?
         public class Test{
             public void method(){
                 for(int i = 0; i < 3; i++) {
                    System.out.print(i);
                 }
            System.out.print(i);
            }
         }
        // 编译不通过， 类中不允许使用删除语句。
     */

    /** 17 打印1-100之间13的倍数，使用for循环*/
    @Test
    public void test17() {
        for (int i = 0; i < 100; i++) {
            if (i % 13 == 0){
                System.out.println(i);
            }
        }
    }

    /** 18 使用双重循环打印20 * 8的矩形，使用for循环实现 */
    @Test
    public void test18() {
        int col = 20, row = 8;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /** 19 用for循环计算1000以内偶数的和 */
    @Test
    public void test19() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    /** 20 执行如下代码后，c的值是多少？ */
    @Test
    public void test20() {
        int a = 0;
        int c = 0;
        do {
            --c; // do while 第一次循环体必然会执行。 如果只能在循环体中得到结果， 使用do...while更符合语义。
            a = a - 1;
        } while (a >= 0);
        System.out.println("c = " + c);
    }

    /** 21  以下代码的运行结果？*/
    @Test
    public void test21(){
        int i=10;
        while(i>0){
            i = i +1;
            if(i==10){
                break;
            }
        }
        System.out.println("i=" + i);
        // Integer.MIN_VALUE
    }

    /** 22 修正如下代码
         int n=3;
         for (int i = 0; i < n; i--) {
            System.out.println("=");
         }
     */
    @Test
    public void test22() {
        int n=3;
        for (int i = 0; -i < n; i--) {
            System.out.println("=");
        }
    }

    /** 23 输入长和宽，输出长方形，如：输入4和3, 将输出如下图形
     ####
     ####
     ####
     */
    @Test
    public void test23() {
        int row = 3, col = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /** 24 输入高度，输出直角三角形。如：输入4, 将输出如下图形
     #
     ##
     ###
     ####
     */
    @Test
    public void test24() {
        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /** 25 输入高度，输出倒直角三角形。如：输入4, 将输出如下图形
     ####
     ###
     ##
     #
     */
    @Test
    public void test25() {
        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /** 26 打印九九乘法表 */
    @Test
    public void test26() {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d x %d = %d\t", j, i, j * j);
            }
            System.out.println();
        }
    }

    /** 27 3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。*/
    @Test
    public void test27() {
        int days = 0;
        for (double length = 3000; length >= 5; length = length / 2) {
            days++;
        }
        System.out.println(days);
    }

    /** 28 打印1-100之间非13的倍数，使用continue语句 */
    @Test
    public void test28() {
        for (int i = 1; i < 100; i++) {
            if (i % 13 == 0) continue;
            System.out.println(i);
        }
    }

    /** 29 用循环控制语句打印输出：1+3+5+...+99=?的结果 */
    @Test
    public void test29() {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    /** 30 写出结果
        int i = 0, j = 5;
        tp: for (;;){
            i++;
            for(;;){
                if(i > j--)
                    break tp;
            }
        }
        System.out.println("i = " + i + ", j = "+ j);
     */
    @Test
    public void test30() {
        int i = 0, j = 5;
        tp: for (;;){
            i++;
            for(;;){
                if(i > j--) // 会一直减到 -1, 最后跳出循环， 所以 i = 1, j = -1;
                    break tp;
            }
        }
        System.out.println("i = " + i + ", j = "+ j);
    }

    /** 31 输出从1到100之间所有不能被3整除的数;并输出这些整数的和 */
    @Test
    public void test31() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("sum : " + sum);
    }

    /** 32 猜数字游戏
     随机生成一个100以内的数，猜数字游戏：
     从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次？ */
    @Test
    public void test32() {
        int result = (int)(Math.random() * 100);
        System.out.println("电脑猜测的数字是 : " + result);
        int min = 0;
        int max = 100;
        for (int count = 7; count > 0; ) {
            count--;
            int guess = min + (max - min) / 2;
            if (guess < result){
                System.out.println("你猜测的结果是: " + guess + "小了，小了, 请继续， 还有个" + count + "次机会");
                min = guess + 1;
            }else if (guess > result){
                System.out.println("你猜测的结果是: " + guess + "大了大了, 请继续， 还有个" + count + "次机会");
                max = guess - 1;
            }else {
                System.out.printf("猜对了， 结果是%d, 你猜测的是%d, 一共用了%d次机会\n",result, guess, 7 - count);
                break;
            }
        }
    }

    /** 33 打印1-100之间数，其中3、5、7的倍数不打印 */
    @Test
    public void test33() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 ==0) continue;
            System.out.println(i);
        }
    }

    /** 34 一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
     例如6=1＋2＋3.编程 找出1000以内的所有完数 */
    @Test
    public void test34() {
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2 ; j++) {
                if (i % j == 0){
                    sum = sum + j;
                }
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }

    /** 35  输入两个正整数m和n，求其最大公约数和最小公倍数 */
    @Test
    public void test35() {
        int m = 40, n = 60;

        int gcd = 0;
        int a = m, b = n;
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        gcd = a;
        System.out.println("最大公约数为：" + gcd);
        System.out.println("最小公倍数是：" + (m * n / gcd));
    }
}


