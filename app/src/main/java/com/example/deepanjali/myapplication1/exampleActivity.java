package com.example.deepanjali.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by deepanjali on 30/6/16.
 */
public class exampleActivity extends AppCompatActivity {

    private ListView mList;
    private MyAdapter mAdapter;
    private  ArrayList<Software> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_layout);


        mList = (ListView)findViewById(R.id.navList);

        arrayList=new ArrayList<>();
        arrayList.add(new Software("Android", "this is cool"));
        arrayList.add(new Software("ios","this is pretty"));
        arrayList.add(new Software("windows","this is damn"));
        arrayList.add(new Software("os linux","this is cool"));

        mAdapter=new MyAdapter(exampleActivity.this,R.layout.row_layout,arrayList);
        mList.setAdapter(mAdapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item position is"+position,Toast.LENGTH_LONG).show();
            }
        });


    }
}
