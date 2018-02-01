package com.example.october7sveryown.gic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class AboutDevelopersFragment extends Fragment {

    Context context;

    public AboutDevelopersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        context = getActivity();
        View rootView = inflater.inflate(R.layout.fragment_about_developers,container, false);



        Typeface tfcard = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PT_Sans-Web-Bold.ttf");
        TextView devDetail = (TextView)rootView.findViewById(R.id.developersDetail);
        devDetail.setTypeface(tfcard);

        Typeface title = Typeface.createFromAsset(getActivity().getAssets(), "fonts/BreeSerif-Regular.ttf");
        TextView Developers = (TextView)rootView.findViewById(R.id.txtDeveloper);
        Developers.setTypeface(title);


        return rootView;
    }
}


