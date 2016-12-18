package koemdzhiev.com.mvp_dagger.splashActivity.presenter;

import koemdzhiev.com.mvp_dagger.splashActivity.model.LoginUserResult;
import koemdzhiev.com.mvp_dagger.splashActivity.model.SplashActivityModel;
import koemdzhiev.com.mvp_dagger.splashActivity.view.SplashActivityView;

/**
 * Created by Georgi on 12/18/2016.
 */

public class SplashActivityPresenterImpl implements SplashActivityPresenter {
    private SplashActivityView view;
    private SplashActivityModel model;

    public SplashActivityPresenterImpl(SplashActivityModel model) {
        this.model = model;
    }

    @Override
    public void login(String userName) {
        model.loginNewUser(userName, new LoginUserResult() {
            @Override
            public void onSuccess() {
                view.showLoginSuccessfullMessage();
            }

            @Override
            public void onError() {
                view.showLoginErrorMessage();
            }
        });
    }

    @Override
    public void logout() {
        // logout functionality here
    }

    @Override
    public void setView(SplashActivityView view) {
        this.view = view;
    }
}
