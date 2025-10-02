package com.lgcns.hello.ctrl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
// import java.util.Map;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
// import java.time.ZoneId;
// import java.time.ZonedDateTime;

@RestController
@RequestMapping("/hello")
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

    // @RestController
    // public class SimpleController {

    //         @GetMapping("/hello")
    //         public Map<String, Object> sayHello(){

    //                 return Map.of(
    //                                 "message", "Hello, World!",
    //                                 "timesptamp", System.currentTimeMillis(),
    //                                 "koreatime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
    //                             );
    //         }
    // }  
        
}
