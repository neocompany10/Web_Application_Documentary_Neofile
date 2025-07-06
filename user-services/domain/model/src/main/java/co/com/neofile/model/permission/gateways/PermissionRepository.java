package co.com.neofile.model.permission.gateways;

import co.com.neofile.model.permission.Permission;

import java.util.List;
import java.util.Optional;

public interface PermissionRepository {
    Optional<Permission> findById(Long id);
    Optional<Permission> findByName(String name);
    List<Permission> findAll();
    Permission save(Permission permission);
    void deleteById(Long id);
}
