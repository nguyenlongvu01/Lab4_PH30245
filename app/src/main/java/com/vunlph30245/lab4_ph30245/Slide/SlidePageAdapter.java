package com.vunlph30245.lab4_ph30245.Slide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.vunlph30245.lab4_ph30245.Fragment.SlideFragment;

public class SlidePageAdapter extends FragmentStateAdapter {
    public static final int NUM_PAGES = 5;
    public SlidePageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        SlideFragment slideFragment = new SlideFragment();
        Bundle bundle = new Bundle();
        bundle.putString("CONTENT", "SLIDE"+ position + 1);
        slideFragment.setArguments(bundle);
        return slideFragment;


    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
