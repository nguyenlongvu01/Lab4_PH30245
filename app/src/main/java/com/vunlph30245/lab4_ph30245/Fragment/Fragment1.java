package com.vunlph30245.lab4_ph30245.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.vunlph30245.lab4_ph30245.R;


public class Fragment1 extends Fragment {
    TextView tvContent1;
    Button btnSend1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        tvContent1 = view.findViewById(R.id.tvContent1);
        //btnSend1 = view.findViewById(R.id.btnSend1);
//
//        btnSend1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String content1 = edContent1.getText().toString();
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//
//                Fragment2 fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.fragment2);
//                fragment2.edContent2.setText(content1);
//            }
//        });

        return view;
    }
}