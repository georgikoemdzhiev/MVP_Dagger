package koemdzhiev.com.mvp_dagger.application.component;

import javax.inject.Singleton;

import dagger.Component;
import koemdzhiev.com.mvp_dagger.application.module.HarApplicationModule;
import koemdzhiev.com.mvp_dagger.mainActivity.dagger.component.HarActivityComponent;
import koemdzhiev.com.mvp_dagger.mainActivity.dagger.module.HarActivityModule;
import koemdzhiev.com.mvp_dagger.splashActivity.dagger.component.SplashActivityComponent;
import koemdzhiev.com.mvp_dagger.splashActivity.dagger.module.SplashActivityModule;

/**
 * Created by Georgi on 12/18/2016.
 */

@Singleton
@Component(modules = HarApplicationModule.class)
public interface HarApplicationComponent {

    HarActivityComponent plus(HarActivityModule module);

    SplashActivityComponent plus(SplashActivityModule module);
}
