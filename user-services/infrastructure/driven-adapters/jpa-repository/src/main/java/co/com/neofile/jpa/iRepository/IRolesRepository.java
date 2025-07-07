package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.RolesEntity;

import java.util.Optional;

public interface IRolesRepository extends BaseSpringDataRepository<RolesEntity, Long> {
    Optional<RolesEntity> findByName (String name);
}
