package co.com.neofile.jpa.iRepository;

import co.com.neofile.jpa.entity.UsersEntity;

import java.util.Optional;

public interface IUsersRepository extends BaseSpringDataRepository<UsersEntity, Long> {
    Optional<UsersEntity> findByUsername (String username);
}
