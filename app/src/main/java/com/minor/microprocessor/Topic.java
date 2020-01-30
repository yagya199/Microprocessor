package com.minor.microprocessor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Topic extends AppCompatActivity {
    ListView listView;
    String[] str={"Introduction","Architecture","Instruction Set","Memories","Interrupt System","Addressing Mode","Timing Diagram Of 8085","Introduction of 8086 Microprocessor","Comparison of 8085 and 8086 Microprocessor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);


        listView=findViewById(R.id.list);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,str);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    startActivity(new Intent(Topic.this, Introduction.class));
                }
                if (position == 1) {
                    startActivity(new Intent(Topic.this, Architecture.class));
                }

                if (position == 2) {
                    startActivity(new Intent(Topic.this, InstructionSet.class));
                }

                if (position == 3) {
                    startActivity(new Intent(Topic.this, memories.class));
                }
                if (position == 4) {
                    startActivity(new Intent(Topic.this, interrupt.class));
                }
                if (position == 5) {
                    startActivity(new Intent(Topic.this, addressingmode.class));
                }

                if (position == 6) {
                    startActivity(new Intent(Topic.this, timingdiagram.class));
                }
                if (position == 7) {
                    startActivity(new Intent(Topic.this, intro8086.class));
                }
                if (position == 8) {
                    startActivity(new Intent(Topic.this, comparison.class));

                }

            }
            });
        }
    }
