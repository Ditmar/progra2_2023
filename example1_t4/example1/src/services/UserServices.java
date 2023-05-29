package services;

import services.base.Service;

public class UserServices implements Service {
    public UserServices() {
        // todo until 7o semester
        // use the patern dependecies injection
    }

    public Boolean login(String userName, String password) {
        return userName.equals("pepito") && password.equals("123456");
    }

}
