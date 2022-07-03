package com.gulshan.patterns.ui;

import com.gulshan.patterns.util.MyModel;

// this will act as presenter
public class AppPresenter {
    // the link between presenter and view(MainActivity) is done by interface

    AppView appView;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    // linkage between the presenter and model
    public MyModel GetAppFromModel() {
        return new MyModel("Master coding app", " 9000", 5);
    }

    // linkage between presenter and view(calling the interface)
    public void getAppDetails(){
        appView.onGetAppName(GetAppFromModel().getAppName());
    }
}
