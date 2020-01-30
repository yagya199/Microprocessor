package com.minor.microprocessor;

import android.R.layout;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DataTransfer extends AppCompatActivity {

    //String array[];
   String[] str={"MVI R,DATA:(Move immediate data to register)","MOV R1,R2:(Move the content of one register to another register","LXI Rp,16-bit DATA:(Load register-pair immediately)","MOV R,M:(Move the content of memory to register)","MOV M,R:(Move the content of register to memory)"," LDA Address:(Load accumulator direct)","STA Address:(Store accumulator direct)","LDAX Rp:(Load accumulator indirect)","STAX Rp:(Store accumulator indirect)","MVI M,DATA:(Move immediate data to memory)"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

     // array=getResources().getStringArray(R.string.dataTransfer);

        ListView listView=findViewById(R.id.list);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, layout.simple_list_item_1,str);
        listView.setAdapter(adapter);


    }
}
