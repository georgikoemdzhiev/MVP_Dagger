package koemdzhiev.com.mvp_dagger.splashActivity.dagger.module;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import koemdzhiev.com.mvp_dagger.splashActivity.model.SplashActivityModel;
import koemdzhiev.com.mvp_dagger.splashActivity.model.SplashActivityModelImpl;
import koemdzhiev.com.mvp_dagger.splashActivity.presenter.SplashActivityPresenter;
import koemdzhiev.com.mvp_dagger.splashActivity.presenter.SplashActivityPresenterImpl;

/**
 * Created by Georgi on 12/18/2016.
 */

@Module
@SplashActivityScope
public class SplashActivityModule {

    @Provides
    @SplashActivityScope
    SplashActivityPresenter provideSplashActivityPresenter(Realm realm) {
        return new SplashActivityPresenterImpl(new SplashActivityModelImpl(realm));
    }

    @Provides
    @SplashActivityScope
    SplashActivityModel provideSplashActivityModel(Realm realm) {
        return new SplashActivityModelImpl(realm);
    }
}
