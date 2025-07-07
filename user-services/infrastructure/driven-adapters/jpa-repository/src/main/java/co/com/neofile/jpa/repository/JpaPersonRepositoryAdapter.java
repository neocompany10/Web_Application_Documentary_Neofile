package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.PersonEntity;
import co.com.neofile.jpa.iRepository.IPersonRepository;
import co.com.neofile.model.person.Person;
import co.com.neofile.model.person.gateways.PersonRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaPersonRepositoryAdapter extends AbstractJpaAdapter<Person, PersonEntity, Long, IPersonRepository> implements PersonRepository {

    public JpaPersonRepositoryAdapter(IPersonRepository repository, ObjectMapper mapper){
        super(repository, mapper, Person.class, PersonEntity.class);
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        return repository.findByEmail(email).map(entity -> mapper.map(entity, Person.class));

    }

}