package co.com.neofile.model.permissions.gateways;

import co.com.neofile.model.permissions.Permissions;

import java.util.List;
import java.util.Optional;

public interface PermissionsRepository {
    Permissions findById(Long id);
    Optional<Permissions> findByName(String name);
    List<Permissions> findAll();
    Permissions save(Permissions permission);
    void deleteById(Long id);
}
