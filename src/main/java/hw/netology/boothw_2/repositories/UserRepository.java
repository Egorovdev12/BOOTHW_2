package hw.netology.boothw_2.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import hw.netology.boothw_2.models.Authorities;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConditionalOnClass(ObjectMapper.class)
@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> listOfAuthorities = new ArrayList<>();
        listOfAuthorities.add(Authorities.WRITE);
        listOfAuthorities.add(Authorities.READ);
        return listOfAuthorities;
    }
}