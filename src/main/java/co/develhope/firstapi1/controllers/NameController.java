package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
class NameController {
    private String name = "Isma";

    @GetMapping("/")
    public String sayName() {
        return name;
    }

    @PostMapping("/")
    public String sayReverseName() {
            StringBuilder reversedName = new StringBuilder(name);
            return reversedName.reverse().toString();
    }
}




