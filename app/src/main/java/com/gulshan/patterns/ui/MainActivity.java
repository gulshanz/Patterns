package com.gulshan.patterns.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.gulshan.patterns.R;
import com.gulshan.patterns.util.MyModel;

public class MainActivity extends AppCompatActivity implements AppView {

    Button btn;
    TextView textView;

    // linking activity with presenter
    AppPresenter appPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);

        appPresenter = new AppPresenter(this);

        btn.setOnClickListener(view -> {
            // calling the presenter to get data from db
            // no linkage between activity and model
            // MainActivity is handling only UI(View)
            // all logic occurs at presenter
            appPresenter.getAppDetails();
        });

        // instantiating the presenter
    }


    @Override
    public void onGetAppName(String name) {
        textView.setText(name);
    }


    //MVP
    // model: MyModel
    // view: MainActivity (Only Dealing with UI)
    // presenter: AppPresenter (Like waiter)

}