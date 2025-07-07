package co.com.neofile.config;

import co.com.neofile.model.user.gateways.UserRepository;
import co.com.neofile.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.neofile.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {
        @Bean
        public UserUseCase UserUseCase(UserRepository userRepository) {
                return new UserUseCase(userRepository);
        }
}
