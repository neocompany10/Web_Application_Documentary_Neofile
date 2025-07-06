package co.com.neofile.model.user.gateways;

import co.com.neofile.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    List<User> findAll();
    User save(User user);
    void deleteById(Long id);

    // Extra
    List<User> findUsersByRole(String roleName);
    List<User> findUsersByPermission(String permissionName);
}
