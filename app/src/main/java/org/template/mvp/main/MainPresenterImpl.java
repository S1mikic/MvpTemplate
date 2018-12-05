package org.template.mvp.main;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

public class MainPresenterImpl implements MainContract.Presenter {

    @Inject
    MainContract.View view;

    private Disposable disposable;

    @Inject
    public MainPresenterImpl() {
    }

    @Override
    public void init() {
    }

    @Override
    public void deinit() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }
}