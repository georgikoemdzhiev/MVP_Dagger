package koemdzhiev.com.mvp_dagger.splashActivity.presenter;

import koemdzhiev.com.mvp_dagger.splashActivity.view.SplashActivityView;

/**
 * Created by Georgi on 12/18/2016.
 */

public interface SplashActivityPresenter {

    void login(String userName);

    void logout();

    void setView(SplashActivityView view);
}
