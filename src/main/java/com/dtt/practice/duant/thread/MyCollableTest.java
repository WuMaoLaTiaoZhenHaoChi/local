package com.dtt.practice.duant.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: duant
 * @Date: 2020/01/07 9:19
 */
public class MyCollableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(Thread.currentThread().getName() + " start !!! ");
        FutureTask<Integer> futureTask = new FutureTask<>(new MyCollable());
        Thread thread01 = new Thread(futureTask);
        thread01.start();

        Thread thread02 = new Thread(futureTask);


        while (!futureTask.isDone()){
            System.out.println(" futureTask is not Done ");
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        Integer result = futureTask.get();
        System.out.println(Thread.currentThread().getName() + result);
        System.out.println(Thread.currentThread().getName() + " end !!! ");
    }

}

class MyCollable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName() + " callable start !!! ");
        return 1;
    }
}