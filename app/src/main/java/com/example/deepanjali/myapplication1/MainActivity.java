package com.example.deepanjali.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {


    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
//    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDrawerList = (ListView)findViewById(R.id.navList);
            String[] osArray = { "Android", "iOS", "Windows", "OS X", "Linux" };
            mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
            mDrawerList.setAdapter(mAdapter);


        Button submitButton= new (Button)findViewById(R.id.submit);

        submitButton.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v) {
                                               Intent intent = new Intent(this,exampleActivity.class);
                                            }
                                        }
        );

//        try{
//            webView1=(WebView) this.findViewById(R.id.webView1);
//        }
//        catch(Exception ex){
//            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//
//
//        webView1.setWebViewClient(new WebViewClient());
//        webView1.getSettings().setJavaScriptEnabled(true);
//
//        /* Go to link */
//        webView1.loadUrl("http://codeproject.com/");


//        final TextView firstTextView =(TextView)findViewById(R.id.textView);
//
//        Button firstButton=(Button)findViewById(R.id.firstButton);
//        firstButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                firstTextView.setText("You Clicked");
//
//            }
//        });



//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}