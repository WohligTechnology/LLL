package com.wohlig.lll.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.wohlig.lll.R;

public class HomeFragment extends Fragment {

    private View view;
    private static Activity activity;
    private static String TAG = "LLL";
    private static ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        activity = getActivity();

        initilizeViews();

        return view;
    }

    private void initilizeViews(){

        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);


    }


}
