package com.util.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() ->
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello completable future...";
        });
        future.thenAccept(result->System.out.println(result));

        future.join();//waits for the task to complete
        System.out.println("Task completed..");
    }
}
