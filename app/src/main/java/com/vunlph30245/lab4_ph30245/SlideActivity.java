package com.vunlph30245.lab4_ph30245;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.vunlph30245.lab4_ph30245.Slide.SlidePageAdapter;

public class SlideActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    SlidePageAdapter slidePageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slide);

        viewPager2 = findViewById(R.id.viewPager2);
        slidePageAdapter = new SlidePageAdapter(this);
        viewPager2.setAdapter(slidePageAdapter);

    }
}