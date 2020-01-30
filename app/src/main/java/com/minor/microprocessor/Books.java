package com.minor.microprocessor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Books extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        listView=findViewById(R.id.listview);

        String[] str={
               "Architecture",
                "Instruction Set",
                "Instruction Format and Addressing Mode",
                "Timing Diagram",
                "Memories",
                "Memory and Interface",
                "Digital Circuit Parameters"
        };

        int icon[]={R.drawable.pdf,R.drawable.pdf,R.drawable.pdf,R.drawable.pdf,R.drawable.pdf,R.drawable.pdf,R.drawable.pdf};

        listView.setAdapter(new BookAdapter(this,str,icon));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/8085%20uP%20Architecture.pdf?alt=media&token=3a72fa32-1128-4380-b675-8e24210e7a96"));
                    startActivity(browserIntent);
                }
                if (position==1)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/8085%20Instruction%20set.pdf?alt=media&token=b3e3d4a0-3501-4152-a668-e2de50c3e443"));
                    startActivity(browserIntent);
                }
                if (position==2)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/Instruction%20format%20and%20addressing%20mode.pdf?alt=media&token=5cac6273-a0d3-4157-970b-02feb7c69191"));
                    startActivity(browserIntent);
                }
                if (position==3)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/8085%20Timimg%20diagram.pdf?alt=media&token=66ce1ba8-c7a7-4833-87ab-70716c17054a"));
                    startActivity(browserIntent);
                }
                if (position==4)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/Memories.pdf?alt=media&token=28dc5c5b-2216-471c-af2a-cf054cdec325"));
                    startActivity(browserIntent);
                }
                if (position==5)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/Memory%20and%20Interface.pdf?alt=media&token=faa66fc9-17b7-484e-9c2f-6df43fd1f75f"));
                    startActivity(browserIntent);
                }
                if (position==6)
                {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/microprocessor-e65cc.appspot.com/o/Digital%20Circuit%20Parameters.pdf?alt=media&token=667a0229-6e6e-4390-8556-889713657f68"));
                    startActivity(browserIntent);
                }
            }
        });

        TextView textView=findViewById(R.id.tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Books.this,Video.class));
            }
        });

    }


}
