import Business.Abstracts.UserService;
import Business.Concretes.UserCheckManager;
import Business.Concretes.UserManager;
import Core.Abstracts.GoogleService;
import Core.Concretes.GoogleManagerAdapter;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;
import jRegisterWithGoogleAccount.GoogleUserInfo;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Abdullah", "Tütüncü", "abdullahttnc@hotmail.com", "123456");
        User user2 = new User(2, "Sinan", "Tütüncü", "sinanttnc@hotmail.com", "123456");
        User user3 = new User(3, "Mert", "Çakmak", "abdullahttnc@hotmail.com", "123456");
        UserManager userManager = new UserManager(new UserCheckManager(), new HibernateUserDao(), new GoogleUserInfo());
        GoogleService googleService = new GoogleManagerAdapter();

        userManager.add(user1, users);
        userManager.loginWithGoogle(user1); // Kullanıcı 1 için google ile kayıt olmayı simüle ediyoruz.

        userManager.add(user2, users);
        userManager.login(user2);        // Kullanıcı 2 için hibernate ile kayıt olmayı simüle ediyoruz.

        userManager.add(user3, users);  // Kullanıcı 1 ile aynı emaili verdik çıktı olarak hata almayı bekliyoruz.


    }
}