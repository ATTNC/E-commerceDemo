package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface GoogleUserDao {

    void SignIn(User user, List<User> userList);

    void SignUp(User user, List<User> userList);


}
