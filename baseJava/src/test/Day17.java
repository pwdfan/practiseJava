package test;

import java.util.concurrent.*;

public class Day17 {
    /**
     * 1. 画图说明线程的生命周期，以及各状态切换使用到的方法等
     *      NEW: 新创建的线程, 没有开始运行。
     *      RUNNABLE: 运行中的线程。
     *      BLOCKED: 没有获取到锁， 没有运行权限。
     *      WAITING: 调用 wait() 或者 join() 方法进入等待状态。
     *      TIMED_WAITING: 调用 sleep(), wait(100), join(100) 方法进入计时等待状态
     *      TERMINATED: 运行完毕销毁的线程
     *
     * 2. 同步代码块中涉及到同步监视器和共享数据，谈谈你对同步监视器和共享数据的理解，以及注意点。
     *      synchronized(同步监视器){
     *      	//操作共享数据的代码 （不能包括多了，也不能包括少了）
     *      }
     *
     * 3. sleep()和wait()的区别
     *      sleep 会让线程进入等待状态, 但是不释放锁。
     *      wait 线程进入等待状态， 但是会释放锁， 其他线程可以获取并执行。
     *
     * 4. 写一个线程安全的懒汉式
     *      class Singleton {
     *          private static class Inner {
     *              public static Singleton instance = new Singleton();
     *          }
     *          public static Singleton getInstance() {
     *              return Inner.instance;
     *          }
     *      }
     *
     * 5. 创建多线程有哪几种方式：4种
     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {
         // 继承Thread类
        new Thread() {
            @Override
            public void run() {
            }
        }.start();

         //实现Runnable接口
        new Thread(new Runnable() {
            @Override
            public void run() {
            }
        }).start();

         //实现Callable接口
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        new Thread(task).start();
        Integer result = task.get();

        //线程池（响应速度提高了，提高了资源的重用率，便于管理）
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(); //无返回值
        FutureTask<Integer> task1 = new FutureTask<Integer>( () -> {
            return 1;
        });
        executorService.submit(task1);
        Integer result1 = task1.get();
    }
}
