package co.com.neofile.model.roles.gateways;

import co.com.neofile.model.permissions.Permissions;
import co.com.neofile.model.roles.Roles;

import java.util.List;
import java.util.Optional;

public interface RolesRepository {
    Roles findById(Long id);
    Optional<Roles> findByName(String name);
    List<Roles> findAll();
    Roles save(Roles roles);
    void deleteById(Long id);

    // Extra
    List<Permissions> getPermissionsByRole(String roleName);
}
