package com.livemilton.redissonspring.fib.controller;


import com.livemilton.redissonspring.fib.service.FibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("fib")
public class FibController {

    @Autowired
    private FibService service;

    @GetMapping("{index}/{name}")
    public Mono<Integer> getFib(@PathVariable int index,@PathVariable String name ){
        return Mono.fromSupplier(()-> this.service.getFib(index, name));
    }

}
