package koemdzhiev.com.mvp_dagger.splashActivity.dagger.component;

import dagger.Subcomponent;
import koemdzhiev.com.mvp_dagger.splashActivity.dagger.module.SplashActivityModule;
import koemdzhiev.com.mvp_dagger.splashActivity.dagger.module.SplashActivityScope;
import koemdzhiev.com.mvp_dagger.splashActivity.view.SplashActivity;

/**
 * Created by Georgi on 12/18/2016.
 */
@SplashActivityScope
@Subcomponent(modules = SplashActivityModule.class)
public interface SplashActivityComponent {
    void inject(SplashActivity splashActivity);
}
