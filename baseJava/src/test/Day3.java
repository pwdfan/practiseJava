package test;

import org.junit.Test;

public class Day3 {
    /**
     * 1. “&”和“&&”的异同
     *      && 为短路运算， 前面的结果为 false, 后面的将不在执行。
     *      &  会造成一次无效的运算， 一般不使用。
     *
     * 2.程序输出
     * 	public static void main(String[] args) {
     * 		boolean x = true;
     * 		boolean y = false;
     * 		short z = 40;
     * 		if ((z++ == 40) && (y = true)) { //41
     * 			z++; //42
     *                }
     * 		if ((x = false) || (++z == 43)) { //43
     * 			z++; //44
     *        }
     * 		System.out.println("z = " + z); // 44
	 *}
     *
     * 3. 定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
     * 		int a = 1, b = 2, c = 3;
     * 		int temp;
	 * 		if (a > b){
	 * 		 	temp = a;
	 * 		}else{
	 * 		 	temp = b;
	 * 		}
	 * 		if (c > temp){
	 * 		 	temp = c;
	 * 		}
	 * 		System.out.println(temp);
     *
	 * 		// 三元运算符
	 *		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
	 *
	 * 4. 编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
	 * 		double d1 = 2.7;
	 * 		double d2 = 3.14;
     * 		if (d1 > 10 && d2 < 20){
	 * 		 	System.out.println(d1 + d2);
	 * 		} else {
	 * 		 	System.out.println(d1 * d2);
	 * 		}
	 *
	 *
     * 5. 交换两个变量值的代码的实现
     * 		String a = "A";
	 * 		String b = "B";
     *
	 * 		String temp = a;
	 * 		a = b;
	 * 		b = temp;
	 */

    @Test
    public void test2(){
		boolean x = true;
		boolean y = false;
		short z = 40;
		if ((z++ == 40) && (y = true)) { //41
			z++; //42
		}
		if ((x = false) || (++z == 43)) { //43
			z++; //44
		}
		System.out.println("z = " + z);    // 44
	}

	@Test
	public void test3() {
     		int a = 1, b = 2, c = 3;
     		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println(max);
	}


}
