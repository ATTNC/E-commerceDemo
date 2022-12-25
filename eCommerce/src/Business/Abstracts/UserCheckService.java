package Business.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserCheckService {


    boolean checkPassword(User user);

    boolean checkName(User user);

    boolean checkEmail(User user);

    boolean checkUsedEmail(User user, List<User> users);

    boolean eMailConfirmation(boolean click);


}
