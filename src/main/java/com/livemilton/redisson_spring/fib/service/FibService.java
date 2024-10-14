package com.livemilton.redisson_spring.fib.service;

import org.springframework.stereotype.Service;

@Service
public class FibService {

    public int getFib(int index){
        System.out.println("calculating fib for " + index);
        return this.fib(index);
    }

    //intentional 2N
    private int fib(int index){
        if(index <2){
            return index;
        }
        return fib(index-1) + fib(index -2);
    }

}
