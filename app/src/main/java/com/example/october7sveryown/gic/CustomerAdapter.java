package com.example.october7sveryown.gic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by Abhi on 24-01-2017.
 */


public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder>{

    private Context context;
    private List<MyData> my_data;
    private String event_url;
    private Intent intent;
private CardView cardView;

    public CustomerAdapter(List<MyData> my_data, Context context) {
        this.my_data = my_data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewFest.setText(my_data.get(position).getEvent_name());
        holder.textViewPlace.setText(my_data.get(position).getEvent_venue());
        Date date=my_data.get(position).getEvent_date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        String str=dateFormat.format(date);
        holder.textViewDate.setText(str);
        event_url=my_data.get(position).getEvent_register_link();
    }



    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewFest;
        public TextView textViewPlace;
        public TextView textViewDate;
        public Button register_link;

        public ViewHolder(View itemView) {
            super(itemView);
            context=itemView.getContext();
            this.textViewFest = (TextView) itemView.findViewById(R.id.event_name);
            this.textViewPlace = (TextView) itemView.findViewById(R.id.event_place);
            this.textViewDate = (TextView) itemView.findViewById(R.id.event_date);
            this.register_link= (Button)itemView.findViewById(R.id.reg_link);

        }



    }
    /*private ArrayList<DataModel> dataSet;
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewFest;
        TextView textViewPlace;
        TextView textViewDate;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewFest = (TextView) itemView.findViewById(R.id.event_name);
            this.textViewPlace = (TextView) itemView.findViewById(R.id.event_place);
            this.textViewDate = (TextView) itemView.findViewById(R.id.event_date);
        }
    }
    public CustomerAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewFest = holder.textViewFest;
        TextView textViewPlace = holder.textViewPlace;
        TextView textViewDate = holder.textViewDate;

        textViewFest.setText(dataSet.get(listPosition).getName());
        textViewPlace.setText(dataSet.get(listPosition).getVersion());
        textViewDate.setText(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }*/

}
