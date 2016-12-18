package koemdzhiev.com.mvp_dagger.application;

import android.app.Application;

import io.realm.Realm;
import koemdzhiev.com.mvp_dagger.application.component.DaggerHarApplicationComponent;
import koemdzhiev.com.mvp_dagger.application.component.HarApplicationComponent;
import koemdzhiev.com.mvp_dagger.mainActivity.dagger.component.HarActivityComponent;
import koemdzhiev.com.mvp_dagger.mainActivity.dagger.module.HarActivityModule;
import koemdzhiev.com.mvp_dagger.splashActivity.dagger.component.SplashActivityComponent;
import koemdzhiev.com.mvp_dagger.splashActivity.dagger.module.SplashActivityModule;
import koemdzhiev.com.mvp_dagger.splashActivity.view.SplashActivity;

/**
 * Created by Georgi on 12/18/2016.
 */

public class HarApplication extends Application {
    private HarApplicationComponent harApplicationComponent;

    private HarActivityComponent harActivityComponent;
    private SplashActivityComponent splashActivityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        harApplicationComponent = DaggerHarApplicationComponent.builder().build();
        createHarMainActivityComponent();
    }

    public HarActivityComponent createHarMainActivityComponent() {
        this.harActivityComponent = harApplicationComponent.plus(new HarActivityModule());
        return this.harActivityComponent;
    }

    public void releaseHarActivityComponent() {
        this.harActivityComponent = null;
    }

    public SplashActivityComponent createSplashActivityComponent() {
        this.splashActivityComponent = harApplicationComponent.plus(new SplashActivityModule());
        return this.splashActivityComponent;
    }

    public void releaseSplashActivityComponent() {
        this.splashActivityComponent = null;
    }
}
