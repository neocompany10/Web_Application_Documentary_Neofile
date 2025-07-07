package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.UsersEntity;
import co.com.neofile.jpa.iRepository.IUsersRepository;
import co.com.neofile.model.users.Users;
import co.com.neofile.model.users.gateways.UsersRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Repository
public class JpaUsersRepositoryAdapter extends AbstractJpaAdapter<Users, UsersEntity, Long, IUsersRepository> implements UsersRepository {

    public JpaUsersRepositoryAdapter(IUsersRepository repository, ObjectMapper mapper){
        super(repository, mapper, Users.class, UsersEntity.class);
    }

    @Override
    public Optional<Users> findByUsername(String username) {
        return repository.findByUsername(username)
                .map(entity -> mapper.map(entity, Users.class));
    }

    @Override
    public List<Users> findUsersByRole(String roleName) {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .filter(userEntity -> userEntity.getRoles().stream()
                        .anyMatch(role -> role.getName().equals(roleName)))
                .map(entity -> mapper.map(entity, Users.class))
                .toList();
    }

}
