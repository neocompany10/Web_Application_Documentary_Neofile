package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.PersonEntity;

import java.util.Optional;

public interface IPersonRepository extends BaseSpringDataRepository<PersonEntity, Long>{
    Optional<PersonEntity> findByEmail (String email);
}
