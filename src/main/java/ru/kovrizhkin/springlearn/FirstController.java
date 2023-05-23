package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world.html";
    }
}
