package co.com.neofile.model.users.gateways;

import co.com.neofile.model.users.Users;

import java.util.List;
import java.util.Optional;

public interface UsersRepository {

    Users findById(Long id);
    Optional<Users> findByUsername(String username);
    List<Users> findAll();
    Users save(Users user);
    void deleteById(Long id);

    // Extra
    List<Users> findUsersByRole(String roleName);
}
