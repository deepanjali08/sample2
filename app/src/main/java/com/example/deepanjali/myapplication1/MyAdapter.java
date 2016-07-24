package com.example.deepanjali.myapplication1;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;



class MyAdapter extends ArrayAdapter<String> {

    private ArrayList<Software> osList;
    private Activity context;

    public MyAdapter(Activity context, int resource, ArrayList<Software> osList) {
        super(context, R.layout.row_layout);
        this.context = context;
        this.osList = osList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d("tag","the hell");

        LayoutInflater theInflater = context.getLayoutInflater();
        View theView = theInflater.inflate(R.layout.row_layout_2, null, false);



        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        TextView textView2=(TextView) theView.findViewById(R.id.textView2);


        theTextView.setText(osList.get(position).osArray);
        textView2.setText(osList.get(position).desc);

        return theView;
    }
}
