package Business.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserService {

    void add(User user, List<User> users);

    void delete(User user);

    void update(User user);

    void login(User user);

    void loginWithGoogle(User user);

    void getUser(int id);

    void getAll();



}
