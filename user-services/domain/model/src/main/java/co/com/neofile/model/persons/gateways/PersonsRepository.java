package co.com.neofile.model.persons.gateways;

import co.com.neofile.model.persons.Persons;

import java.util.List;
import java.util.Optional;

public interface PersonsRepository {

    Persons findById(Long id);
    Optional<Persons> findByEmail(String email);
    List<Persons> findAll();
    Persons save(Persons persons);
    void deleteById(Long id);
}
