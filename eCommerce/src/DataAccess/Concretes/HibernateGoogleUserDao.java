package DataAccess.Concretes;

import DataAccess.Abstracts.GoogleUserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateGoogleUserDao implements GoogleUserDao {


    @Override
    public void SignIn(User user, List<User> userList) {

        System.out.println("Signing in is successful with Google account");
    }

    @Override
    public void SignUp(User user, List<User> userList) {

        System.out.println("Signing up is successful with Google account");

    }
}
