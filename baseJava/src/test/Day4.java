package test;

import org.junit.Test;

public class Day4 {
    /**
     * 1. switch后面使用的表达式可以是哪些数据类型的。
     *      byte char short int enum(jdk 5) String(jdk7)
     *
     * 2. 使用switch语句改写下列if语句：
     *  	 int a = 3;
     *  	 int x = 100;
     *  	 if(a==1)
     * 		     x+=5;
     *  	 else if(a==2)
     * 		     x+=10;
     *  	 else if(a==3)
     * 		     x+=16;
     *  	 else
     * 		     x+=34;
     *
     * 		 switch(a){
     * 		     case 1:
     * 		        x += 5;
     * 		        break;
     * 		     case 2:
     * 		        x += 10;
     * 		        break;
     * 		     case 3:
     * 		        x += 16;
     * 		        break;
     * 		     default:
     * 		        x += 345;
     * 		        break; // 建议预防性添加， 避免有疯子在下面写匹配导致贯穿。
     * 		 }
     *
     * 3. 谈谈你对三元运算符、if-else和switch-case结构使用场景的理解
     *      switch 适合匹配有限的常量
     *      三元运算符 适合结构简单， 且需要返回值情况
     *      if-else 适合其他情况
     *
     * 4. 如何从控制台获取String和int型的变量，并输出？使用代码实现
     *      Scanner scanner = new Scanner(System.in);
     *      String str = scanner.nextLine();
     *      int num = Integer.parseInt(str);
     *
     * 5. 使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出。
     *      int sum = 0;
     *      for (int i = 0; i < 100; i++){
     *          if (i % 2 != 0) {
     *              sum = sum + i;
     *          }
     *      }
     *      System.out.println(sum);
     *
     */
    @Test
    public void test1(){
        char c = 97;
        short s = 1;
        switch (s){

        }
        switch (c){
            case 'a':
                System.out.println("a");
                break;
        }
    }
}

