package syedqamar.example.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class homeController {

    @GetMapping("/")
    public String sayHelloGet()
    {
        return "Welcome to Syed Qamar Abbas \n  \n      Urls for Course  \n POST: http://localhost:8080/course \n GET : http://localhost:8080/course \n GET | DELETE |UPDATE BY ID : http://localhost:8080/course \n \n    Urls for person  \n POST: http://localhost:8080/person \n GET : http://localhost:8080/person \n GET | DELETE |UPDATE BY ID : http://localhost:8080/person";
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
