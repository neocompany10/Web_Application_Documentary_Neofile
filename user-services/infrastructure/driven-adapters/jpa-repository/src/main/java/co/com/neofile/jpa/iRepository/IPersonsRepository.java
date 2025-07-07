package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.PersonsEntity;

import java.util.Optional;

public interface IPersonsRepository extends BaseSpringDataRepository<PersonsEntity, Long>{
    Optional<PersonsEntity> findByEmail (String email);
}
