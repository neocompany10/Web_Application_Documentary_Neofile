package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.PermissionEntity;
import co.com.neofile.jpa.iRepository.IPermissionRepository;
import co.com.neofile.model.permission.Permission;
import co.com.neofile.model.permission.gateways.PermissionRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaPermissionRepositoryAdapter extends AbstractJpaAdapter<Permission, PermissionEntity, Long, IPermissionRepository> implements PermissionRepository {

    public JpaPermissionRepositoryAdapter(IPermissionRepository repository, ObjectMapper mapper) {
        super(repository, mapper, Permission.class, PermissionEntity.class);
    }

    @Override
    public Optional<Permission> findByName(String name) {
        return repository.findByName(name)
                .map(entity -> mapper.map(entity, Permission.class));
    }
}