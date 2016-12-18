package koemdzhiev.com.mvp_dagger.application.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by Georgi on 12/18/2016.
 */

@Module
public class HarApplicationModule {

    @Provides
    @Singleton
    Realm provideRealmDB() {
        return Realm.getDefaultInstance();
    }
}
