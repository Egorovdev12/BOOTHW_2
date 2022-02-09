package hw.netology.boothw_2.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String login;
    private transient String password;
    List<Authorities> accessList;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        accessList = new ArrayList<>();
    }

    public List getAuthorityList() {
        return this.accessList;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void addAccess(Authorities...authorities) {
        for (int i = 0; i < authorities.length; i++) {
            if (!accessList.contains(authorities[i]))
                accessList.add(authorities[i]);
        }
    }
}