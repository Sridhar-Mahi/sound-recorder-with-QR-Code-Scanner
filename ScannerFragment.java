package com.danielkim.soundrecorder.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.danielkim.soundrecorder.R;
import com.danielkim.soundrecorder.activities.Scan;


public class ScannerFragment extends Fragment {


    public ScannerFragment() {

    }

    private static final String ARG_POSITION = "position";

    private int position;

    public static ScannerFragment newInstance(int position) {

        ScannerFragment f = new ScannerFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.activity_scan, container, false);

        Intent intent = new Intent(getContext(), Scan.class);

        startActivity(intent);

        return v;

    }

}


