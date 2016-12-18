package koemdzhiev.com.mvp_dagger.splashActivity.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import io.realm.Realm;
import koemdzhiev.com.mvp_dagger.R;
import koemdzhiev.com.mvp_dagger.application.HarApplication;
import koemdzhiev.com.mvp_dagger.mainActivity.view.HarActivity;
import koemdzhiev.com.mvp_dagger.splashActivity.presenter.SplashActivityPresenter;

public class SplashActivity extends AppCompatActivity
        implements SplashActivityView {
    @Inject
    SplashActivityPresenter presenter;
    @Inject
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ((HarApplication) getApplication()).createSplashActivityComponent().inject(this);
        presenter.setView(this);

        presenter.login("Georgi Koemdzhiev");


        Log.d("DAGGER 2", realm.toString());
        Log.d("DAGGER 2", presenter.toString());
    }

    @Override
    public void showLoginSuccessfullMessage() {
        Toast.makeText(this, "Login Successful!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, HarActivity.class);
        startActivity(intent);
    }

    @Override
    public void showLoginErrorMessage() {
        Toast.makeText(this, "Error, User Exists!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ((HarApplication) getApplication()).releaseSplashActivityComponent();
        this.presenter = null;
    }
}
