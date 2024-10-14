package com.livemilton.redissonspring.fib.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class FibService {

    @Cacheable(value = "math:fib", key = "#index")
    public int getFib(int index, String name){
        System.out.println("calculating fib for " + index+ ", name: "+name);
        return this.fib(index);
    }

    //intentional 2N
    private int fib(int index){
        if(index <2){
            return index;
        }else {
            return fib(index-1) + fib(index -2);
        }


        }

}


