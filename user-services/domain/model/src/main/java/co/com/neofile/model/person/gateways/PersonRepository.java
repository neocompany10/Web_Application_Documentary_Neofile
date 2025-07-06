package co.com.neofile.model.person.gateways;

import co.com.neofile.model.person.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Optional<Person> findById(Long id);
    Optional<Person> findByEmail(String email);
    List<Person> findAll();
    Person save(Person person);
    void deleteById(Long id);
}
