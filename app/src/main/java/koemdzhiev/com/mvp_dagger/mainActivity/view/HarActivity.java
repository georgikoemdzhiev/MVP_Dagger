package koemdzhiev.com.mvp_dagger.mainActivity.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import koemdzhiev.com.mvp_dagger.R;
import koemdzhiev.com.mvp_dagger.application.HarApplication;
import koemdzhiev.com.mvp_dagger.commonUtils.MockDataManager;
import koemdzhiev.com.mvp_dagger.mainActivity.presenter.HarActivityPresenter;

public class HarActivity extends AppCompatActivity implements HarActivityView {
    @Inject
    Realm realm;
    @Inject
    HarActivityPresenter presenter;
    @BindView(R.id.activitiesListView)
    ListView mActivitiesListView;

    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((HarApplication) getApplication()).createHarMainActivityComponent().inject(this);
        ButterKnife.bind(this);
        presenter.setView(this);

        //create some mock data
        MockDataManager.createMockActivities(realm);

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        mActivitiesListView.setAdapter(mAdapter);

        Log.d("DAGGER 2", realm.toString());
        Log.d("DAGGER 2", presenter.toString());

        presenter.loadActivities();
    }

    @Override
    public void setActivities(ArrayList<String> activities) {
        mAdapter.clear();
        mAdapter.addAll(activities);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ((HarApplication) getApplication()).releaseHarActivityComponent();
        this.presenter = null;
    }
}
