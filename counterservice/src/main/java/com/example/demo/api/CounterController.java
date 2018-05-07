package com.example.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RefreshScope
public class CounterController {

    private static AtomicLong count = new AtomicLong(0);

    @Value(value = "${counter.prefixMessage}")
    private String prefixMessage;

    @GetMapping(path = "/count")
    public String getCount() {
        return prefixMessage + ' ' + count.getAndIncrement();
    }
}
