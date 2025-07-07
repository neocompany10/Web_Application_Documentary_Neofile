package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.PermissionEntity;
import co.com.neofile.jpa.entity.PersonEntity;

import java.util.Optional;

public interface IPermissionRepository extends BaseSpringDataRepository<PermissionEntity, Long> {
    Optional<PermissionEntity> findByName(String email);
}
