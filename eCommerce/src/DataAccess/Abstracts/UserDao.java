package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserDao {


    void add(User user);
    void delete(User user);
    void update(User user);
    void get(User user);
    List<User> getAll();


}
