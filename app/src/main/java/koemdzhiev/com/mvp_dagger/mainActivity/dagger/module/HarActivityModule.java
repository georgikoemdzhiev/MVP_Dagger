package koemdzhiev.com.mvp_dagger.mainActivity.dagger.module;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import koemdzhiev.com.mvp_dagger.mainActivity.model.HarActivityModel;
import koemdzhiev.com.mvp_dagger.mainActivity.model.HarActivityModelImpl;
import koemdzhiev.com.mvp_dagger.mainActivity.presenter.HarActivityPresenter;
import koemdzhiev.com.mvp_dagger.mainActivity.presenter.HarActivityPresenterImpl;

/**
 * Created by Georgi on 12/18/2016.
 */

@Module
public class HarActivityModule {

    @Provides
    @HarActivityScope
    HarActivityModel provideHarModel(Realm realm) {
        return new HarActivityModelImpl(realm);
    }

    @Provides
    @HarActivityScope
    HarActivityPresenter provideHarPresenter(HarActivityModel model) {
        return new HarActivityPresenterImpl(model);
    }
}
