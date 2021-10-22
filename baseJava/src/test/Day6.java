package test;

public class Day6 {
    /**
     *     1. 写出一维数组初始化的两种方式
     *     int[] arr1;
     *     arr1 = new int[3];   arr1[1] = 33;
     *
     *     int[] arr2 = new int[3];
     *
     *     int[] arr3 = new int[]{1,2,3};
     *
     *     int[] arr4 = {1, 2, 3};
     *
     *     2. 写出二维数组初始化的两种方式
     *     int[][] table1;
     *     table = new int[4][]; table[0] = new int[3]; table[0][0] = 33;
     *
     *     int[][] table2 = new int[4][3];
     *
     *     int[][] table3 = new int[][]{
     *          {1,2,3,4},
     *          {1,2,3,4},
     *          {1,2,3,4}
     *     };
     *
     *     int[][] table4 = {
     *          {1,2,3,4},
     *          {1,2,3,4},
     *          {1,2,3,4}
     *     };
     *
     *     3. 如何遍历如下的二维数组
     *          int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
     *          for (int[] row : arr){
     *              for (int num : row){
     *                  System.out.print(num);
     *              }
     *              System.out.println();
     *          }
     *
     *     4. 不同类型的一维数组元素的默认初始化值各是多少
     *          基本类型： 0， false
     *          引用类型： null
     *
     *     5. 一维数组的内存解析：
     *          String[] strs = new String[5];  // 栈内存 strs, 堆内存 string[5](null)
     *          strs[2] = “Tom”;                               堆内存 string[2] = "Tom", else (null)
     *          strs = new String[3];           // 栈内存 strs, 堆内存 string[3](null)
     */
}
