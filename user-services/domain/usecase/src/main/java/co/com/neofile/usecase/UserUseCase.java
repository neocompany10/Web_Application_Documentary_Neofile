package co.com.neofile.usecase;

import co.com.neofile.model.users.Users;
import co.com.neofile.model.users.gateways.UsersRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase {

    private final UsersRepository usersRepository;


    public Users execute(Users user) {
        return usersRepository.save(user);
    }
}


