package jRegisterWithGoogleAccount;

import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class GoogleUserInfo {
    List<User> users = new ArrayList<>();
    public void registerWithGoogle(User user) {
        System.out.println("Registered with Google: " + user.getFirstName()+" "+user.getLastName());
        users.add(user);

    }

    public List<User> getAll() {
        return users;
    }


}
