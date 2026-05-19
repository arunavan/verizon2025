package com.training;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class FutureAndCallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();  // pool
        Callable<String> callable = () -> {
                          return "Hello from Callable";
        };
      
        Callable<Integer> task2 = () -> { return 199;} ;
        
        Runnable task3= ()-> System.out.println("run thread..");
        
        Future<String> future = executorService.submit(callable);
        Future<Integer> result1 = executorService.submit(task2);
        
        executorService.execute(task3);
        
        String result = future.get();
        System.out.println(result +"  "+ result1.get());
        executorService.shutdown();
    }
}
