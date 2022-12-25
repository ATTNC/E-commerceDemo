package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User>users=new ArrayList<User>();
    @Override
    public void add(User user) {

        System.out.println("Saved with hibernate: "+user.getFirstName()+" "+user.getLastName());
        users.add(user);

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void get(User user) {

    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
