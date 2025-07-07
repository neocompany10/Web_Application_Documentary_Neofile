package co.com.neofile.jpa.repository;

import co.com.neofile.jpa.entity.UserEntity;
import co.com.neofile.jpa.iRepository.IUserRepository;
import co.com.neofile.model.user.User;
import co.com.neofile.model.user.gateways.UserRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Repository
public class JpaUserRepositoryAdapter extends AbstractJpaAdapter<User, UserEntity, Long, IUserRepository> implements UserRepository {

    public JpaUserRepositoryAdapter(IUserRepository repository, ObjectMapper mapper){
        super(repository, mapper, User.class, UserEntity.class);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username)
                .map(entity -> mapper.map(entity, User.class));
    }

    @Override
    public List<User> findUsersByRole(String roleName) {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .filter(userEntity -> userEntity.getRoles().stream()
                        .anyMatch(role -> role.getName().equals(roleName)))
                .map(entity -> mapper.map(entity, User.class))
                .toList();
    }

}
