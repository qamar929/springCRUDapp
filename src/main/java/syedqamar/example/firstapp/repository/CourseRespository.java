package syedqamar.example.firstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import syedqamar.example.firstapp.entity.Course;
import syedqamar.example.firstapp.entity.Person;

public interface CourseRespository extends JpaRepository<Course,Integer> {


}
