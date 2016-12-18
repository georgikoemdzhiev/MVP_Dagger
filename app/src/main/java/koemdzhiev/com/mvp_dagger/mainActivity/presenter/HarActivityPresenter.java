package koemdzhiev.com.mvp_dagger.mainActivity.presenter;

import koemdzhiev.com.mvp_dagger.mainActivity.view.HarActivity;
import koemdzhiev.com.mvp_dagger.mainActivity.view.HarActivityView;

/**
 * Created by Georgi on 12/18/2016.
 */

public interface HarActivityPresenter {

    void loadActivities();

    void setView(HarActivityView harActivityView);
}
