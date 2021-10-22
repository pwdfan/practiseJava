package test;

import org.junit.Test;

import java.util.Arrays;

public class Day7 {
    /**
     * 1. 使用冒泡排序，实现如下的数组从小到大排序。
     *      int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
     *
     *      for (int i = 0; i < arr.length - 1; i++){
     *          boolean swapHappen = false;
     *          for (int j = 0; j < arr.length - 1; j++){
     *              if (arr[j + 1] < arr[j]) {
     *                  int temp = arr[j];
     *                  arr[j] = arr[j + 1];
     *                  arr[j + 1] = temp;
     *                  swapHappen = true;
     *              }
     *          }
     *          if ( ! swapHappen){
     *              break;
     *          }
     *      }
     *
     * 2. 如何反转上面的数组。请代码实现
     *      for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
     *          int temp = arr[left];
     *          arr[left] = arr[right];
     *          arr[right] = temp;
     *      }
     *
     * 3. 复制上述数组，得到一个新的数组
     *      int[] newArr = new int[arr.length];
     *      for (int i = 0; i < arr.length; i++) {
     *          newArr[i] = arr[i];
     *      }
     *
     * 4. 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
     *      int index = -1;
     *      for (int i = 0; i < arr.length; i++) {
     *          if (arr[i] == 22){
     *              index = i;
     *              break;
     *          }
     *      }
     *      System.out.println(index);
     *
     * 5. 数组中常见的异常有哪些？请举例说明
     *      int[] arr = null;
     *      System.out.println(arr[1]); // NullPointerException
     *      arr = new int[3];
     *      System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
     */

    @Test
    public void test1() {

        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapHappen = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapHappen = true;
                }
            }
            if (!swapHappen) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3() {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("内存地址是否相等 ： " + (arr == newArr));
        System.out.println("内容是否相同：" + Arrays.equals(arr, newArr));
    }
    
    @Test
    public void test5() {
        int[] arr = null;
//        System.out.println(arr[1]); // NullPointerException
        arr = new int[3];
//        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
    }
}
