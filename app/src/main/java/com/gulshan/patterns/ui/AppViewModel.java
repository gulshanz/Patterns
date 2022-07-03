package com.gulshan.patterns.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.gulshan.patterns.util.MyModel;

public class AppViewModel extends ViewModel {

    // livedata
    LiveData<String> liveData;
    MutableLiveData<String> mutableLiveData = new MutableLiveData<>();


    // connecting viewmodel view database
    private MyModel getAppFromDatabase() {
        return new MyModel("MyAppName", "43244", 5);
    }

    // connecting viewmodel view mainactivity
    public void getAppName() {
        String appName = getAppFromDatabase().getAppName();
        mutableLiveData.postValue(appName);
    }
}
