package com.blogspot.dedyyuristiawan.androidstudioproject;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dedyyuristiawan on 8/27/16.
 */
public class FragmentOne extends Fragment {

    private TextView tvOne, tvOnClick = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        onClick(rootView);

        return rootView;
    }

    //function to implement onClick function android.
    private void onClick(View view){
        tvOne = (TextView) view.findViewById(R.id.tvOne);
        tvOnClick = (TextView) view.findViewById(R.id.tvOnClick);
        tvOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Hi i am function onclick", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        tvOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Hi i am function onclick", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
