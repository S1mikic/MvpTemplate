package org.template.mvp.app;


import org.template.mvp.main.FragmentProvider;
import org.template.mvp.main.MainActivity;
import org.template.mvp.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = {MainModule.class, FragmentProvider.class})
    @ActivityScope
    abstract MainActivity bindMainActivity();
}
