package syedqamar.example.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class homeController {

    @GetMapping("/")
    public String sayHelloGet()
    {
     String a =  "Welcome to Syed Qamar Abbas";
        a +="Urls for Course";
        a +="POST: http://localhost:8080/course";
        a +="GET : http://localhost:8080/course ";
        a +="GET | DELETE |UPDATE BY ID : http://localhost:8080/course ";
        a +="Urls for Person";
        a +="POST: http://localhost:8080/person";
        a +="GET : http://localhost:8080/person ";
        a +="GET | DELETE |UPDATE BY ID : http://localhost:8080/person ";
        return a;

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
