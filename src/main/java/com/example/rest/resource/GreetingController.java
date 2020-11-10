package com.example.rest.resource;

import com.example.rest.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

   public static AtomicLong counter = new AtomicLong();
   public static String template = "Hello, %s!";

   @RequestMapping("/greeting")
   public Greeting greeting(@RequestParam(value = "name", defaultValue = "Word") String name){
       return new Greeting(counter.incrementAndGet(), String.format(template, name));
   }
}
