package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Business.Abstracts.UserService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;
import jRegisterWithGoogleAccount.GoogleUserInfo;

import java.util.List;
import java.util.Scanner;

public class UserManager implements UserService {


    private int choise;
    private UserCheckService userCheckService;
    private GoogleUserInfo googleUserInfo;
    private UserDao userDao;

    public UserManager(UserCheckService userCheckService, UserDao userDao, GoogleUserInfo googleUserInfo) {


        this.userCheckService = userCheckService;
        this.userDao = userDao;
        this.googleUserInfo = googleUserInfo;
    }


    @Override
    public void add(User user, List<User> users) {

        if (userCheckService.checkUsedEmail(user, users)) {
            System.out.println("Email already taken, please enter another email");


        } else if (userCheckService.checkName(user)) {
            System.out.println("First name and last name must be at least 2 characters");


        } else if (userCheckService.checkPassword(user)) {
            System.out.println("Password must be at least 6 characters");


        } else if (userCheckService.checkEmail(user)) {
            System.out.println("Please enter a valid email  Example: firstname@hotmail.com");


        } else {

            users.add(user);
            System.out.println("Do you want to register with google or hibernate 1-Hibernate 2-Google ");
            Scanner input = new Scanner(System.in);
            choise = input.nextInt();
            System.out.println("Successfully registered " + user.getFirstName() + " " + user.getLastName());
            System.out.println("We have sent a confirmation link to your email, please verify your email");
            userCheckService.eMailConfirmation(true);
            switch (choise) {

                case 1: {
                    userDao.add(user);
                    break;
                }
                case 2:
                    googleUserInfo.registerWithGoogle(user);
                    break;
            }



        }

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    Scanner input = new Scanner(System.in);

    @Override
    public void login(User user) {

        System.out.println("----------LOGIN PAGE----------");
        System.out.println("Email: ");
        String mail = input.nextLine();
        System.out.println("password: ");
        String password = input.nextLine();
        if (!mail.isEmpty() && !password.isEmpty()) {
            for (User userList : userDao.getAll()) {
                if (userList.geteMail().equals(mail) && userList.getPassword().equals(password)) {
                    System.out.println("logged in");
                    return;
                }
            }
            System.out.println("Information does not match");
        } else {
            System.out.println("Email and password fields cannot be empty");

        }

    }

    @Override
    public void loginWithGoogle(User user) {

        System.out.println("----------LOGIN PAGE----------");
        System.out.println("Email: ");
        String mail = input.nextLine();
        System.out.println("password: ");
        String password = input.nextLine();
        if (!mail.isEmpty() && !password.isEmpty()) {
            for (User userList : googleUserInfo.getAll()) {
                if (userList.geteMail().equals(mail) && userList.getPassword().equals(password)) {
                    System.out.println("logged in");
                    return;
                }
            }
            System.out.println("Information does not match");
        } else {
            System.out.println("Email and password fields cannot be empty");

        }


    }

    @Override
    public void getUser(int id) {

    }

    @Override
    public void getAll() {
        for (User user : userDao.getAll()) {

            System.out.println("Id: " + user.getId());
            System.out.println("Id: " + user.getFirstName());
            System.out.println("Id: " + user.getLastName());
            System.out.println("Id: " + user.geteMail());
            System.out.println();

        }


    }
}
