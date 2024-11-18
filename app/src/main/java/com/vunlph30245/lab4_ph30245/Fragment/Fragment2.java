package com.vunlph30245.lab4_ph30245.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.vunlph30245.lab4_ph30245.R;


public class Fragment2 extends Fragment {
    EditText edContent2;
    Button btnSend2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        edContent2 = view.findViewById(R.id.edContent2);
        btnSend2 = view.findViewById(R.id.btnSend2);

        btnSend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content2 = edContent2.getText().toString();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

                Fragment1 fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.fragment1);
                fragment1.tvContent1.setText(content2);
            }
        });

        return view;
    }
}