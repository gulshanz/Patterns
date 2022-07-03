package com.gulshan.patterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayAppText();
            }
        });
    }

    public MyModel GetAppFromModel() {
        return new MyModel("Master coding app", " 9000", 5);
    }

    public void displayAppText() {
        MyModel model = GetAppFromModel();
        textView.setText(model.getAppName() + " " + "Downloads" + model.getAppDownloads());
    }


    //MVC
    // model: MyModel
    // view: Textview
    // controller: MainActivity

    // not used much professionally
}