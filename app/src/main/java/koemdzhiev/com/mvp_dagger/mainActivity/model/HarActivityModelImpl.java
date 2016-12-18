package koemdzhiev.com.mvp_dagger.mainActivity.model;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;
import koemdzhiev.com.mvp_dagger.commonUtils.Activity;

/**
 * Created by Georgi on 12/18/2016.
 */

public class HarActivityModelImpl implements HarActivityModel {
    private Realm realm;

    public HarActivityModelImpl(Realm realm) {
        this.realm = realm;
    }

    @Override
    public void getActivities(ActivitiesResult result) {
        RealmResults<Activity> activities = realm.where(Activity.class).findAll();
        ArrayList<String> activitiesList = new ArrayList<>(activities.size());
        for (Activity activity : activities) {
            activitiesList.add(activity.getActivityName());
        }
        result.onSuccess(activitiesList);
    }
}
