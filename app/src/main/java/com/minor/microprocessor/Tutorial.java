package com.minor.microprocessor;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Tutorial extends AppCompatActivity {
   ListView listView;
   TextView textView;
   ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        String[] str={
                "Question Set1",
                "Question Set2",
                "Question Set3",
                "Question Set4",
                "Question Set5"

        };

        int []pdf={R.drawable.pdf,R.drawable.pdf,R.drawable.pdf,R.drawable.pdf,R.drawable.pdf};

        listView=findViewById(R.id.list);

       listView.setAdapter(new TutAdapter(this,str,pdf));

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==0)
               {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/questions%201.pdf?alt=media&token=fabc2b23-6490-451a-a1e4-0c425d7d8241"));
                   startActivity(browserIntent);
               }

                if(position==1)
               {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/questons%202.pdf?alt=media&token=949f7e20-6d9d-4057-b67d-75a2dec4756d"));
                   startActivity(browserIntent);
               }
                if (position==2)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/questions%203.pdf?alt=media&token=df3724f9-3753-4ce7-b40e-61a9309dabff"));
                    startActivity(browserIntent);
                }
               if (position==3)
               {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/questions%204.pdf?alt=media&token=474822bb-40ae-4238-8b78-e8e554c6ca6f"));
                   startActivity(browserIntent);
               }
               if (position==4)
               {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/questions%205.pdf?alt=media&token=ff465548-6836-4768-b625-e3ae89fd30bc"));
                   startActivity(browserIntent);
               }

           }
       });








        /*String Url="https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/questions%201.pdf?alt=media&token=fabc2b23-6490-451a-a1e4-0c425d7d8241";
        String finalUrl="http://docs.google.com/gview?embedded=true&url="+Url;
        String s="http://drive.google.com/viewerng/viewer?embedded=true&url=";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

                getSupportActionBar().setTitle("Loading...!");
                if(newProgress==100)
                {
                    progressBar.setVisibility(View.GONE);

                    getSupportActionBar().setTitle(R.string.app_name);
                }
            }
        });

       // webView.loadUrl(finalUrl);*/


    }




    }

