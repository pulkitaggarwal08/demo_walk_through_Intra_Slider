package com.walkthrough.pulkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.walkthrough.pulkit.activities.WelcomeActivity;
import com.walkthrough.pulkit.utils.PrefManager;

public class MainActivity extends AppCompatActivity {

    Button btn_play_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        init();
    }

    private void findIds() {

        btn_play_again = (Button) findViewById(R.id.btn_play_again);
    }

    private void init() {
        btn_play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrefManager prefManager = new PrefManager(getApplicationContext());
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();

            }
        });
    }


}
