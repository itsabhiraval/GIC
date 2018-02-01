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

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {


    Integer[] imageIDs = {
            R.drawable.event, R.drawable.sections, R.drawable.conference, R.drawable.male_final,
            R.drawable.aboutus, R.drawable.feedback
    };
    String[] titles = {
            "Events", "GIC Sections", "Clubs", "Online Courses", "About us", "Feedback"
    };

    SliderLayout sliderLayout;
    HashMap<String, String> Hash_file_maps;
    Context context;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        //  TextView myCard=(TextView)findViewById(R.id.cardTitle);
        Typeface tfcard = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PT_Sans-Web-Bold.ttf");
        //     myCard.setTypeface(tfcard);
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter1(getActivity()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    Intent iy = new Intent(getActivity(), EventActivity.class);
                    startActivity(iy);
                } else if (i == 1) {
                    Intent iy1 = new Intent(context,SectionActivity.class);
                    startActivity(iy1);
                } else if (i == 2) {
                    Intent iy2 = new Intent(context, ClubActivity.class);
                    startActivity(iy2);
                } else if (i == 3) {
                    Intent iy3 = new Intent(context, OnlineCourseActivity.class);
                    startActivity(iy3);
                } else if (i == 4) {
                    Intent iy4 = new Intent(context, AboutActivity.class);
                    startActivity(iy4);
                } else if (i == 5) {
                    Intent iy5 = new Intent(context,FeedbackActivity.class);
                    startActivity(iy5);
                }

            }
        });


        Hash_file_maps = new HashMap<String, String>();

        sliderLayout = (SliderLayout) rootView.findViewById(R.id.slider);

        Hash_file_maps.put("Faculty Development Program for DE", "http://gtuinnovationcouncil.ac.in/wp-content/uploads/2016/03/fdp.jpg");
        Hash_file_maps.put("Code for Gujarat - Hackathon", "http://gtuinnovationcouncil.ac.in/wp-content/uploads/2016/02/Resized-1.png");
        Hash_file_maps.put("International Conference", "http://gtuinnovationcouncil.ac.in/wp-content/uploads/2016/03/international-conference.jpg");
        Hash_file_maps.put("5th Innovation Sankul Day Awards", "http://gtuinnovationcouncil.ac.in/wp-content/uploads/2016/03/award1.jpg");
        Hash_file_maps.put("Dr.Akshai aggarwal", "http://akshaiaggarwal.org/wp-content/gallery/gallery/at-gtu-innovation-sankuls-day.jpg");

        for (String name : Hash_file_maps.keySet()) {

            TextSliderView textSliderView = new TextSliderView(getActivity());
            textSliderView
                    .description(name)
                    .image(Hash_file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Default);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(5000);
        sliderLayout.addOnPageChangeListener(this);
        return rootView;

    }


    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    public class ImageAdapter1 extends BaseAdapter {
        private Context context;

        public ImageAdapter1(Context c) {
            context = c;
        }

        //---returns the number of images---
        public int getCount() {
            return imageIDs.length;
        }

        //---returns the ID of an item---
        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        //---returns an ImageView view---
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView icon;
            icon = new ImageView(context);

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.image_name);
            label.setText(titles[position]);
            Typeface tflist = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PT_Sans-Web-Regular.ttf");
            label.setTypeface(tflist);
            icon = (ImageView) row.findViewById(R.id.album_image);

            icon.setImageResource(imageIDs[position]);

            return row;
        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
