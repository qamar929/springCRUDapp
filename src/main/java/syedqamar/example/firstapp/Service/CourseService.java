package syedqamar.example.firstapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syedqamar.example.firstapp.entity.Course;
import syedqamar.example.firstapp.entity.Person;
import syedqamar.example.firstapp.exception.NotFoundException;
import syedqamar.example.firstapp.repository.CourseRespository;
import syedqamar.example.firstapp.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRespository courseRespository;


    public Course addCourse(Course course)
    {
        courseRespository.save(course);

        return course;
    }

    public List<Course> getAllCourse()
    {
        return courseRespository.findAll();
    }

    public  Course findCourseById(int id)
    {
        Optional<Course> course = courseRespository.findById(id);

        if(!course.isPresent())
        {
            throw  new NotFoundException("Course with " + id + "does not exist");


        }
        return  course.get();

    }

    public Course updateCourse(Course course,int id)
    {
        Optional<Course> OPcourse = courseRespository.findById(id);
        if(!OPcourse.isPresent())
        {

            throw  new NotFoundException("Course with " + id + "does not exist");


        }

        course.setId(id);
        courseRespository.save(course);
        return  course;
    }

    public void  deleteCourse(int id )
    {
        Optional<Course> course = courseRespository.findById(id);
        if(!course.isPresent())
        {

            throw  new NotFoundException("Course with " + id + "does not exist");


        }

        courseRespository.delete(course.get());
    }
}
