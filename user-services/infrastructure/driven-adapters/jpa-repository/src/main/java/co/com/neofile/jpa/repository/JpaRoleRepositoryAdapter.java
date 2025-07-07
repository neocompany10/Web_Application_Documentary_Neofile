package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.RoleEntity;
import co.com.neofile.jpa.iRepository.IRoleRepository;
import co.com.neofile.model.permission.Permission;
import co.com.neofile.model.role.Role;
import co.com.neofile.model.role.gateways.RoleRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaRoleRepositoryAdapter extends AbstractJpaAdapter<Role, RoleEntity, Long, IRoleRepository> implements RoleRepository {

    public JpaRoleRepositoryAdapter(IRoleRepository repository, ObjectMapper mapper) {
        super(repository, mapper, Role.class, RoleEntity.class);
    }

    @Override
    public Optional<Role> findByNameRole(String name) {
        return repository.findByNameRole(name)
                .map(entity -> mapper.map(entity, Role.class));
    }

    @Override
    public List<Permission> getPermissionsByRole(String roleName) {
        return null;
    }
}