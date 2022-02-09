package hw.netology.boothw_2.repositories;

import hw.netology.boothw_2.models.Authorities;
import hw.netology.boothw_2.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    // Хранилище всех пользователей сервиса (в идеале должно находиться в бд)
    private List<User> userList = new ArrayList<>();

    // For testing
    public UserRepository() {
        User user1 = new User("egorovdev12", "12345");
        user1.addAccess(Authorities.WRITE, Authorities.READ, Authorities.DELETE);
        User user2 = new User("Vanek99", "pass123");
        user2.addAccess(Authorities.WRITE);
        userList.add(user1);
        userList.add(user2);
    }

    public List<Authorities> getUserAuthorities(String userLogin, String userPassword) {
        // Смотрим, есть ли такая комбинация логина и пароля
        for (User user : userList) {
            if (user.getLogin().equals(userLogin) && user.getPassword().equals(userPassword)) {
                return user.getAuthorityList();
            }
        }
        return new ArrayList<Authorities>();
    }
}