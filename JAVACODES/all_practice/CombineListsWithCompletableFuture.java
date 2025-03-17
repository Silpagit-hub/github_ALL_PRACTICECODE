package com.all_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineListsWithCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<List<String>> future1=CompletableFuture.supplyAsync(()-> Arrays.asList("Silpa","Padhy"));
        CompletableFuture<List<String>> future2=CompletableFuture.supplyAsync(()-> Arrays.asList("Debasish","Padhy"));
        CompletableFuture<List<String>> future3=CompletableFuture.supplyAsync(()-> Arrays.asList("Subhasish","Padhy"));

        List<String> finalResult =
        CompletableFuture.allOf(future1,future2,future3).
                thenApply(v->
                {List<String>combine=new ArrayList<>();
                    combine.addAll(future1.join());
                    combine.addAll(future2.join());
                    combine.addAll(future3.join());
                    return combine;
                }).get();
        System.out.println(finalResult);
    }
}
