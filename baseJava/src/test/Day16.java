package test;

public class Day16 {
    /**
     * 1. 谈谈你对程序、进程、线程的理解
     *      程序是一组可以执行的代码。
     *      程序运行的时候， 需要想系统申请资源， 系统会分配独立的资源， 这个资源就是进程。
     *      线程是进程中的执行路径。
     *
     * 2. 代码完成继承Thread的方式创建分线程，并遍历100以内的自然数
     *      new Thread() {
     *          public void run() {
     *              for (int i = 0; i < 100; i++) {
     *                  System.out.println(i);
     *              }
     *          }
     *      }.start();
     *
     * 3. 代码完成实现Runnable接口的方法创建分线程，并遍历100以内的自然数
     *
     * 4. 对比两种创建方式
     *      继承有单继承限制， 推荐使用 Runnable ， 或者 Callable
     *      实现接口， 可以更通用， 但是使用线程中的方法， 需要通过静态方法获取当前线程对象。
                Thread.currentThread().getName();
     *
     * 5. 说说你对IDEA中Project和Module的理解
     *      Module 是一个模块
     *      Project 是整个项目， 由很多模块组成。
     */
    public static void main(String[] args) {

        // test 2
        new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        }.start();

        // test 3
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        }).start();

    }
}
