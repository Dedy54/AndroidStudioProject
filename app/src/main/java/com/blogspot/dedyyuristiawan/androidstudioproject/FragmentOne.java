package com.blogspot.dedyyuristiawan.androidstudioproject;

import android.os.Bundle;
import android.os.Handler;
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

    private TextView tvOne, tvOnClick, tvHandler = null;

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
        tvHandler = (TextView) view.findViewById(R.id.tvHandler);

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

        tvHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerFunction(v);
            }
        });
    }

    //function handler, it will be show snackbar after 3 second.
    // 3000 it mean, 3000 millisecond = 3 second.
    private void handlerFunction(final View v){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Snackbar.make(v, "Hi i am show after  3 second",
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }, 3000);
    }
}
