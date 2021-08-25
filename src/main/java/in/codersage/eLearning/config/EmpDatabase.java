package in.codersage.eLearning.config;

import in.codersage.eLearning.controller.EmpRepository;
import in.codersage.eLearning.entity.Employee;

import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmpDatabase {
    private static final Logger log = LoggerFactory.getLogger(EmpDatabase.class);

    @Bean
    CommandLineRunner initEmpDatabase(EmpRepository EmpRepository){
        return args -> {
            log.info("Preloading " + EmpRepository.save(new Employee("darshan", "tarsariya",20)));
            log.info("Preloading " + EmpRepository.save(new Employee("abcd", "efgh",21)));
        };
    }
}
