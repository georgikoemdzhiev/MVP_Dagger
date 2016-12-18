package koemdzhiev.com.mvp_dagger.commonUtils;

import io.realm.Realm;

/**
 * Created by Georgi on 12/18/2016.
 */

public class MockDataManager {

    public static void createMockActivities(Realm realm){
        realm.beginTransaction();
        for(int i = 0; i < 10; i++){
            Activity activity = realm.createObject(Activity.class);
            activity.setActivityName("Acclivity " + i);
        }
        realm.commitTransaction();
    }
}
