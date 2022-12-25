package Core.Concretes;

import Core.Abstracts.GoogleService;
import Entities.Concretes.User;
import jRegisterWithGoogleAccount.GoogleUserInfo;

public class GoogleManagerAdapter implements GoogleService {

    @Override
    public void withGoogle(User user) {

        GoogleUserInfo googleUserInfo=new GoogleUserInfo();
        googleUserInfo.registerWithGoogle(user);
    }
}
