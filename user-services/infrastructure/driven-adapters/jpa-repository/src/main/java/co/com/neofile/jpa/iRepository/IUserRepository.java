package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.UserEntity;

import java.util.Optional;

public interface IUserRepository extends BaseSpringDataRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername (String username);
}
