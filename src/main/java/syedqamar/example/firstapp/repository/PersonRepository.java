package syedqamar.example.firstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import syedqamar.example.firstapp.entity.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Integer> {
}
