package com.example.soleseeker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private View _bg__frame_34_ek2;
    private View screenshot_2023_05_30_19_50_52_421_com_android_1;
    private Button rectangle_1158;
    private ImageView screenshot_2023_05_30_19_50_52_421_com_android_1_ek1;
    private ImageView sole_seeker_logo_1;
    private View solemate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenshot_2023_05_30_19_50_52_421_com_android_1 = findViewById(R.id.screenshot_2023_05_30_19_50_52_421_com_android_1);
        rectangle_1158 = findViewById(R.id.rectangle_1158);
        solemate = findViewById(R.id.solemate);
        sole_seeker_logo_1 = findViewById(R.id.sole_seeker_logo_1);

        TextView textView = findViewById(R.id.solemate);
        String text = "FIND YOUR PERFECT SOLE MATE";
        SpannableStringBuilder ssb = new SpannableStringBuilder(text);
        ForegroundColorSpan fcsOrange = new ForegroundColorSpan(Color.parseColor("#FFA500"));
        ssb.setSpan(fcsOrange, 18, 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ssb);

        // Button click listener to navigate to MainMenuActivity
        rectangle_1158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, terms_conditions.class);
                startActivity(intent);
            }
        });
    }
}