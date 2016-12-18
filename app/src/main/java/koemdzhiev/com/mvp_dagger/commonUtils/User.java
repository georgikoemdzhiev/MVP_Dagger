package koemdzhiev.com.mvp_dagger.commonUtils;

import io.realm.RealmObject;

/**
 * Created by Georgi on 12/18/2016.
 */

public class User extends RealmObject {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
