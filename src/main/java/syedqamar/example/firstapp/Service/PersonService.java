package syedqamar.example.firstapp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syedqamar.example.firstapp.entity.Person;
import syedqamar.example.firstapp.exception.NotFoundException;
import syedqamar.example.firstapp.repository.PersonRepository;


import javax.validation.constraints.Max;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
   private PersonRepository personRepository;


    public Person addPerson(Person person)
    {
personRepository.save(person);

return person;
    }

    public List<Person> getAllPersons()
    {
       return personRepository.findAll();
    }

    public  Person findPersonById(int id)
    {
        Optional<Person> person = personRepository.findById(id);
        if(!person.isPresent())
        {

            throw  new NotFoundException("person with " + id + "does not exist");


        }
        return  person.get();

    }

    public Person updatePerson(Person person,int id)
    {
        Optional<Person> Opperson = personRepository.findById(id);
        if(!Opperson.isPresent())
        {

            throw  new NotFoundException("person with " + id + "does not exist");


        }

                 person.setId(id);
                 personRepository.save(person);
                 return  person;
    }

    public void  deletePerson(int id )
    {
        Optional<Person> person = personRepository.findById(id);
        if(!person.isPresent())
        {

            throw  new NotFoundException("person with " + id + "does not exist");


        }

        personRepository.delete(person.get());
    }
}
