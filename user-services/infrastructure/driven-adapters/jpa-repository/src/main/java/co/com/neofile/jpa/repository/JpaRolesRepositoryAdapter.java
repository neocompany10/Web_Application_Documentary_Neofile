package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.RolesEntity;
import co.com.neofile.jpa.iRepository.IRolesRepository;
import co.com.neofile.model.permissions.Permissions;
import co.com.neofile.model.roles.Roles;
import co.com.neofile.model.roles.gateways.RolesRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaRolesRepositoryAdapter extends AbstractJpaAdapter<Roles, RolesEntity, Long, IRolesRepository> implements RolesRepository {

    public JpaRolesRepositoryAdapter(IRolesRepository repository, ObjectMapper mapper) {
        super(repository, mapper, Roles.class, RolesEntity.class);
    }

    @Override
    public Optional<Roles> findByName(String name) {
        return repository.findByName(name)
                .map(entity -> mapper.map(entity, Roles.class));
    }

    @Override
    public List<Permissions> getPermissionsByRole(String roleName) {
        return null;
    }
}