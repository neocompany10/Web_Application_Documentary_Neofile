package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.PersonsEntity;
import co.com.neofile.jpa.iRepository.IPersonsRepository;
import co.com.neofile.model.persons.Persons;
import co.com.neofile.model.persons.gateways.PersonsRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaPersonsRepositoryAdapter extends AbstractJpaAdapter<Persons, PersonsEntity, Long, IPersonsRepository> implements PersonsRepository {

    public JpaPersonsRepositoryAdapter(IPersonsRepository repository, ObjectMapper mapper){
        super(repository, mapper, Persons.class, PersonsEntity.class);
    }

    @Override
    public Optional<Persons> findByEmail(String email) {
        return repository.findByEmail(email).map(entity -> mapper.map(entity, Persons.class));

    }

}