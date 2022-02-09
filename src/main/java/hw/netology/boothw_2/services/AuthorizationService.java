package hw.netology.boothw_2.services;

import hw.netology.boothw_2.exceptions.InvalidCredentials;
import hw.netology.boothw_2.exceptions.UnauthorizedUser;
import hw.netology.boothw_2.models.Authorities;
import hw.netology.boothw_2.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Принимает в себя логин и пароль и возвращает разрешения для этого пользователя, если такой пользователь найден и данные валидны
@Service
public class AuthorizationService {

    UserRepository userRepository;

    public AuthorizationService(UserRepository ur) {
        this.userRepository = ur;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        // Если присланные строка пароля или логина пусты, тогда выкидывается InvalidCredentials
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        // Если репозиторий не вернул никаких разрешений, либо вернул пустую коллекцию, тогда выкидывается ошибка UnauthorizedUser
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}