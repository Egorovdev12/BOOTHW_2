//package hw.netology.boothw_2.configFiles;
//
//import hw.netology.boothw_2.repositories.UserRepository;
//import hw.netology.boothw_2.services.AuthorizationService;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JavaConfig {
//
//    @Bean
//    @ConditionalOnProperty("netology.service")
//    public AuthorizationService authorizationServiceBean() {
//        return new AuthorizationService();
//    }
//
//    @Bean
//    @ConditionalOnProperty("netology.repository")
//    public UserRepository userRepositoryBean() {
//        return new UserRepository();
//    }
//
//}