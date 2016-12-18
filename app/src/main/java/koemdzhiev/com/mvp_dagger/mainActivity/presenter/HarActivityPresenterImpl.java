package koemdzhiev.com.mvp_dagger.mainActivity.presenter;

import java.util.ArrayList;

import koemdzhiev.com.mvp_dagger.mainActivity.model.ActivitiesResult;
import koemdzhiev.com.mvp_dagger.mainActivity.model.HarActivityModel;
import koemdzhiev.com.mvp_dagger.mainActivity.view.HarActivityView;

/**
 * Created by Georgi on 12/18/2016.
 */

public class HarActivityPresenterImpl implements HarActivityPresenter {
    private HarActivityView view;
    private HarActivityModel model;

    public HarActivityPresenterImpl(HarActivityModel model) {
        this.model = model;
    }

    @Override
    public void loadActivities() {
        model.getActivities(new ActivitiesResult() {
            @Override
            public void onSuccess(ArrayList<String> activities) {
                view.setActivities(activities);
            }

            @Override
            public void onError() {

            }
        });
    }

    @Override
    public void setView(HarActivityView harActivityView) {
        this.view = harActivityView;
    }
}
