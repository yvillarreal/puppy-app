package com.animals.puppy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        HelloWord n = new HelloWord();
        return "Hello " + n.getFirstName() + n.getLastName();
    }
}