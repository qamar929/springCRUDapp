package syedqamar.example.firstapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "name can not be blank")
    private  String Course_Name;
    private  int Credit_Hours;
    private  String CourseCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public int getCredit_Hours() {
        return Credit_Hours;
    }

    public void setCredit_Hours(int credit_Hours) {
        Credit_Hours = credit_Hours;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }
}
