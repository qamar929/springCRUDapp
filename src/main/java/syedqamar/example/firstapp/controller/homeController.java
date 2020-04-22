package syedqamar.example.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class homeController {

    @GetMapping("/")
    public String sayHelloGet()
    {
        return "Hello World from get updated";
    }


    @PostMapping("/")
    public String sayHelloPost()
    {
        return "Hello World from post";
    }


    @PutMapping("/")
    public String sayHelloPut()
    {
        return "Hello World put";
    }


    @DeleteMapping("/")
    public String sayHelloDelete()
    {
        return "Hello World delete";
    }
}
