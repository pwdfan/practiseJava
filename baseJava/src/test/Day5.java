package test;

import org.junit.Test;

public class Day5 {
    /**
     * 1. 循环结构是如何最后退出循环的，有哪些不同的情况请说明。
     *      ① 循环条件返回false
     *      ② 在循环体内，一旦执行到break，跳出循环. 遇到 return 直接结束整个方法
     *
     * 2.指出如下程序输出的结果：
     *      label:for (int i = 1; i <= 4; i++) {
     * 			for (int j = 1; j <= 10; j++) {
     * 				if (j % 4 == 0) {
     * 					continue label;
     *              }
     * 				System.out.print(j);
     * 			}
     * 			System.out.println();
     *      }
     * //123123123123
     *
     * 3.一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
     *      for (int i = 0; i < 1000; i++) {
     *          int sum = 0;
     *          for (int j = 1; j <= i / 2; j++){
     *              if (i % j == 0){
     *                  sum = sum + j;
     *              }
     *          }
     *          if (i == sum) {
     *              System.out.println(i);
     *          }
     *      }
     *
     * 4. 说明break和continue使用上的相同点和不同点
     *      break:  中断并推出当前循环
     *      continue:   中断本次循环， 进入下一轮循环， 重新判断条件。
     *      相同点是关键字后面代码不会执行。
     *      不同点是 continue 会继续判断判断条件， break 直接完成循环。
     *
     * 5. 从控制台输出如下结构：
     *
     *   ******
     *   *****
     *   ****
     *   ***
     *   **
     *   *
     *   int num = 6;
     *   for (int i = 0; i < num; i++){
     *       for (int j = num -  i; j > 0; j-- ){
     *           System.out.print("*");
     *       }
     *       System.out.println();
     *   }
     *
     */

    @Test
    public void test2() {
         label:for (int i = 1; i <= 4; i++) {
      			for (int j = 1; j <= 10; j++) {
      				if (j % 4 == 0) {
      					continue label;
                   }
      				System.out.print(j);
      			}
      			System.out.println();
      }
    }

    @Test
    public void test3() {
        for (int i = 0; i < 1000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void test5(){

        int num = 6;
        for (int i = 0; i < num; i++){
            for (int j = num -  i; j > 0; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
