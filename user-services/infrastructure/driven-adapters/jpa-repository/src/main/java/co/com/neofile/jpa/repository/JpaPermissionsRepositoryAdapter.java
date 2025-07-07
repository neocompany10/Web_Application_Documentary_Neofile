package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.PermissionsEntity;
import co.com.neofile.jpa.iRepository.IPermissionsRepository;
import co.com.neofile.model.permissions.Permissions;
import co.com.neofile.model.permissions.gateways.PermissionsRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaPermissionsRepositoryAdapter extends AbstractJpaAdapter<Permissions, PermissionsEntity, Long, IPermissionsRepository> implements PermissionsRepository {

    public JpaPermissionsRepositoryAdapter(IPermissionsRepository repository, ObjectMapper mapper) {
        super(repository, mapper, Permissions.class, PermissionsEntity.class);
    }

    @Override
    public Optional<Permissions> findByName(String name) {
        return repository.findByName(name)
                .map(entity -> mapper.map(entity, Permissions.class));
    }
}