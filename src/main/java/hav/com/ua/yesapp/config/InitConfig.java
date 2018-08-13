package hav.com.ua.yesapp.config;

import hav.com.ua.yesapp.repo.ConstantRepository;
import hav.com.ua.yesapp.repo.UserRepository;
import hav.com.ua.yesapp.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig {

    @Bean
    @Autowired
    public Utils utils(ConstantRepository constantRepository, UserRepository userRepository) {
        return new Utils(constantRepository, userRepository);
    }
}
