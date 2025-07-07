package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.RoleEntity;

import java.util.Optional;

public interface IRoleRepository extends BaseSpringDataRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByNameRole (String name);
}
