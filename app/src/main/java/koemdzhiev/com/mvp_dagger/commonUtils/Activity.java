package koemdzhiev.com.mvp_dagger.commonUtils;

import io.realm.RealmObject;

/**
 * Created by Georgi on 12/18/2016.
 */

public class Activity extends RealmObject {
    private String activityName;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}
