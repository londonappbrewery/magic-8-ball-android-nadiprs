package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button ask_B;
    private ImageView ball_I;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
        final int[] ballArray = {R.drawable.ball1 , R.drawable.ball2 , R.drawable.ball3 , R.drawable.ball4 , R.drawable.ball5};
        ask_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "ask button: is clicked");
                Random random = new Random();
                int randomTill5 = random.nextInt(5);
                ball_I.setImageResource(ballArray[randomTill5]);
            }
        });
    }

    private void setUp() {
        ask_B = findViewById(R.id.button_B_mainActivity);
        ball_I = findViewById(R.id.image_IV_mainActivity);
    }
}
