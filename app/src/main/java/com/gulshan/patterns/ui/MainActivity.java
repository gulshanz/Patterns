package com.gulshan.patterns.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.gulshan.patterns.R;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;

    // connecting mainactivity with viewmodel and listening to livedata
    AppViewModel appViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);

        appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        btn.setOnClickListener(view -> appViewModel.getAppName());

        // listening and observing changes to livedata
        appViewModel.mutableLiveData.observe(this, s -> {
            // any change in live data to this
            textView.setText(s);
        });

    }


    // MVVM
    // M: MyModel
    // V: MainActivity responsible for user input and output
    // VM: AppViewModel processing and sending data from model to view

}