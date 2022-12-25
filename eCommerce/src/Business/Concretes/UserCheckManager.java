package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Entities.Concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {


    @Override
    public boolean checkPassword(User user) {

        if(user.getPassword().length()>=6){
            return false;
        }
        return true;
    }

    @Override
    public boolean checkName(User user) {
        if(user.getFirstName().length() >=2 && user.getLastName().length()>=2){
            return false;}

        return true;
    }

    @Override
    public boolean checkEmail(User user) {

        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
      return !Pattern.compile(regexPattern).matcher(user.geteMail()).matches();

    }

    @Override
    public boolean checkUsedEmail(User user, List<User> users) {
        if(users.size()==0){
            return false;
        }

        for (User mailList:users) {


            if (mailList.geteMail().equals(user.geteMail())){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean eMailConfirmation(boolean click) {

        if(click) {
            System.out.println("Email confirmed");
            return true;
        }

        return false;
    }
}
