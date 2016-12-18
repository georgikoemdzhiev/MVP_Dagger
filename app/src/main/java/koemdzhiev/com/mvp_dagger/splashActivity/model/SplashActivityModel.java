package koemdzhiev.com.mvp_dagger.splashActivity.model;

/**
 * Created by Georgi on 12/18/2016.
 */

public interface SplashActivityModel {
    void loginNewUser(String userName, LoginUserResult result);

    void deleteUser(String userName);
}
