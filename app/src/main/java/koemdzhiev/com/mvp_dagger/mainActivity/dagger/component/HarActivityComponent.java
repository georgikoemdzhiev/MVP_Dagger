package koemdzhiev.com.mvp_dagger.mainActivity.dagger.component;

import dagger.Subcomponent;
import koemdzhiev.com.mvp_dagger.mainActivity.dagger.module.HarActivityModule;
import koemdzhiev.com.mvp_dagger.mainActivity.dagger.module.HarActivityScope;
import koemdzhiev.com.mvp_dagger.mainActivity.view.HarActivity;

/**
 * Created by Georgi on 12/18/2016.
 */
@HarActivityScope
@Subcomponent(modules = HarActivityModule.class)
public interface HarActivityComponent {

    void inject(HarActivity harActivity);
}
