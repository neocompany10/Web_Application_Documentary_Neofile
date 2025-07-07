package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.PermissionsEntity;

import java.util.Optional;

public interface IPermissionsRepository extends BaseSpringDataRepository<PermissionsEntity, Long> {
    Optional<PermissionsEntity> findByName(String email);
}
