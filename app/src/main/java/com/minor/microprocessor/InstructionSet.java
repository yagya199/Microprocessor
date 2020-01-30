package com.minor.microprocessor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class InstructionSet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_set);


        int title[]={R.string.s1,R.string.s2,R.string.s3,R.string.s4,R.string.s5};
        int desc[]={R.string.i11,R.string.i21,R.string.i31,R.string.i41,R.string.i51};

        GridView gridView=findViewById(R.id.g2);

        InstructionAdapter adapter= new InstructionAdapter(InstructionSet.this,title,desc);
        gridView.setAdapter(adapter);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==0)
               {
                   startActivity(new Intent(InstructionSet.this,DataTransfer.class));
               }
               if(position==1)
               {
                   startActivity(new Intent(InstructionSet.this,Arithmetic.class));
               }

               if(position==2)
               {
                   startActivity(new Intent(InstructionSet.this,Logical.class));
               }

               if(position==3)
               {
                   startActivity(new Intent(InstructionSet.this,Branching.class));
               }

               if(position==4)
               {
                   startActivity(new Intent(InstructionSet.this,Control.class));
               }
           }
       });
    }
}
