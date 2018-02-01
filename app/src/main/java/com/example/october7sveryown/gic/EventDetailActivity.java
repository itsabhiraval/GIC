package com.example.october7sveryown.gic;

import android.graphics.Typeface;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class EventDetailActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);
        webView=(WebView)findViewById(R.id.web_view);


        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/Overpass-Regular.ttf");
        Typeface title= Typeface.createFromAsset(getAssets(),"fonts/BreeSerif-Regular.ttf");


        TextView name = (TextView)findViewById(R.id.tvTitle);
        name.setTypeface(title);

        TextView txtVenue = (TextView)findViewById(R.id.txtVenue);
        txtVenue.setTypeface(title);

        TextView venue = (TextView)findViewById(R.id.Venue);
        venue.setTypeface(title);

        TextView txtTime = (TextView)findViewById(R.id.txtTime);
        txtTime.setTypeface(title);

        TextView time = (TextView)findViewById(R.id.Time);
        time.setTypeface(title);



        TextView txt = (TextView)findViewById(R.id.txtDetails);
        txt.setTypeface(tf);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);


    }
}
