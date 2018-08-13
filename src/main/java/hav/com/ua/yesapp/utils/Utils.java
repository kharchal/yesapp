package hav.com.ua.yesapp.utils;

import hav.com.ua.yesapp.constants.ConstantNames;
import hav.com.ua.yesapp.model.Constant;
import hav.com.ua.yesapp.model.ConstantType;
import hav.com.ua.yesapp.model.User;
import hav.com.ua.yesapp.repo.ConstantRepository;
import hav.com.ua.yesapp.repo.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Utils {

    private ConstantRepository constantRepository;

    private UserRepository userRepository;

    public Utils(ConstantRepository constantRepository, UserRepository userRepository) {
        this.constantRepository = constantRepository;
        this.userRepository = userRepository;
    }

    @PostConstruct
    private void foo() {
        Constant isInitiated = constantRepository.findByName(ConstantNames.IS_DB_INITIATED.toString());
        String dbinit = System.getProperty("dbinit");
//        System.out.println(dbinit);
        if ("true".equals(dbinit)) {
            if (isInitiated == null) {
                isInitiated = new Constant();
                isInitiated.setName(ConstantNames.IS_DB_INITIATED.toString());
                isInitiated.setType(ConstantType.BOOLEAN);
//                isInitiated.setValue("false");
            }
            isInitiated.setValue("false");
            constantRepository.save(isInitiated);
        }
        if (isInitiated == null || "false".equals(isInitiated.getValue())) {

            User user = new User();
            user.setLogin("test");
            user.setPassword("123");
            user.setName("Test");
            user.setName("tesT");
            userRepository.save(user);

            if (isInitiated == null) {
                isInitiated = new Constant();
                isInitiated.setName(ConstantNames.IS_DB_INITIATED.toString());
                isInitiated.setType(ConstantType.BOOLEAN);
            }
            isInitiated.setValue("true");
            constantRepository.save(isInitiated);
        }
    }

}
