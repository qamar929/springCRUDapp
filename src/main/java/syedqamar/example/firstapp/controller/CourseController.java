package syedqamar.example.firstapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import syedqamar.example.firstapp.Service.CourseService;
import syedqamar.example.firstapp.entity.Course;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {


    @Autowired
    private CourseService CourseService;

    @GetMapping
    public List<Course> getAllCourses()
    {
        return  CourseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public  Course findCourseById(@PathVariable int id)
    {
        return  CourseService.findCourseById(id);
    }

    @PostMapping
    public ResponseEntity<? > addCourse(@Valid @RequestBody Course course, BindingResult result)
    {

        if(result.hasErrors())
        {
            Map<String,String> errors  = new HashMap<>();
            for(FieldError error: result.getFieldErrors())
            {
                errors.put(error.getField(),error.getDefaultMessage());

            }
            return  new ResponseEntity<Map<String,String>>(errors, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Course>( CourseService.addCourse(course),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<? >  updateCourse(@PathVariable int id ,@Valid @RequestBody Course course, BindingResult result)
    {

        if(result.hasErrors())
        {
            Map<String,String> errors  = new HashMap<>();
            for(FieldError error: result.getFieldErrors())
            {
                errors.put(error.getField(),error.getDefaultMessage());

            }
            return  new ResponseEntity<Map<String,String>>(errors, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Course>(  CourseService.updateCourse(course,id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<?>  deleteCourse(int id)
    {
        CourseService.deleteCourse(id);

        return new ResponseEntity<String>("Record deleted by Id" + id ,HttpStatus.OK);
    }
}
