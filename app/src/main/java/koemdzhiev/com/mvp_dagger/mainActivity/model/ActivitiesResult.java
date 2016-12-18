package koemdzhiev.com.mvp_dagger.mainActivity.model;

import java.util.ArrayList;

/**
 * Created by Georgi on 12/18/2016.
 */
public interface ActivitiesResult {

    void onSuccess(ArrayList<String> activities);

    void onError();
}
