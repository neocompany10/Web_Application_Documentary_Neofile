package co.com.neofile.usecase;

import co.com.neofile.model.user.User;
import co.com.neofile.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase {

    private final UserRepository userRepository;


    public User execute(User user) {
        return userRepository.save(user);
    }
}


