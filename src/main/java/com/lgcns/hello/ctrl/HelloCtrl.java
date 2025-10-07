package com.lgcns.hello.ctrl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hello)
public class HelloCtrl {
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b ;
    }

    @GetMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return a - b ;
    }

    @GetMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return a * b ;
    }

    @GetMapping("/div")
    public String div(@RequestParam int a, @RequestParam int b) {
        if ( b == 0 ) {
            return "Error: Division by Zero!";
        }
        return String.valueOf(a / b) ;
    }
    
}

