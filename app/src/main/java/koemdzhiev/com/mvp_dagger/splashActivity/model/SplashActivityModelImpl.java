package koemdzhiev.com.mvp_dagger.splashActivity.model;

import io.realm.Realm;
import io.realm.RealmResults;
import koemdzhiev.com.mvp_dagger.commonUtils.User;

/**
 * Created by Georgi on 12/18/2016.
 */

public class SplashActivityModelImpl implements SplashActivityModel {
    private Realm realm;

    public SplashActivityModelImpl(Realm realm) {
        this.realm = realm;
    }

    @Override
    public void loginNewUser(String userName, LoginUserResult result) {
        RealmResults<User> results = realm.where(User.class).equalTo("userName", userName).findAll();

        if (results.size() < 1) {
            // create or check if user exist
            realm.beginTransaction();
            User user = realm.createObject(User.class);
            user.setUserName(userName);
            realm.commitTransaction();

            result.onSuccess();
        } else {
            result.onError();
        }

    }

    @Override
    public void deleteUser(String userName) {
        // delete user
    }
}
