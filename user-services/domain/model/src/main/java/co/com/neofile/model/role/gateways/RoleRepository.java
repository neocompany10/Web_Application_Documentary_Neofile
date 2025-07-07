package co.com.neofile.model.role.gateways;

import co.com.neofile.model.permission.Permission;
import co.com.neofile.model.role.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {
    Role findById(Long id);
    Optional<Role> findByNameRole(String name);
    List<Role> findAll();
    Role save(Role role);
    void deleteById(Long id);

    // Extra
    List<Permission> getPermissionsByRole(String roleName);
}
