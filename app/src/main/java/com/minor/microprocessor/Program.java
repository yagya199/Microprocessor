package com.minor.microprocessor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        String[] programs = {"1. 8085 program to store 8-bit data in memory.", "2. 8085 program to exchange the contents of memory locations", "3. 8085 program to find one's complement of a 8-bit number.", "4. 8085 program to find two's complement of a 8-bit number",
                "5. 8085 program to find one's complement of a 16 bit hexadecimal number", "6. 8085 program to find two's complement of a 16 bit hexadecimal number","7. 8085 program to add two 8 bit number without carry","8. 8085 program to add two 8 bit number with carry","9. 8085 program to add two 16 bit number","10. 8085 program to subtract two 8 bit number","11. 8085 program to subtract two 16 bit number"};
        ListView listView = findViewById(R.id.listview);


        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, programs);
        listView.setAdapter(myadapter);

        //click on listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(Program.this, program1.class);
                    startActivity(intent);
                }

                if (i==1)
                {
                    Intent intent = new Intent(Program.this,program2.class);
                    startActivity(intent);
                }
                if (i==2)
                {
                    Intent intent = new Intent(Program.this,program3.class);
                    startActivity(intent);
                }
                if (i==3)
                {
                    Intent intent = new Intent(Program.this,program4.class);
                    startActivity(intent);
                }
                if (i==4)
                {
                    Intent intent = new Intent(Program.this,program5.class);
                    startActivity(intent);
                } if (i==5)
                {
                    Intent intent = new Intent(Program.this,program6.class);
                    startActivity(intent);
                }

                if (i==6)
                {
                    Intent intent = new Intent(Program.this,program7.class);
                    startActivity(intent);
                }

                if (i==7)
                {
                    Intent intent = new Intent(Program.this,problem8.class);
                    startActivity(intent);
                }

                if (i==8)
                {
                    Intent intent = new Intent(Program.this,program9.class);
                    startActivity(intent);
                }

                if (i==9)
                {
                    Intent intent = new Intent(Program.this,program10.class);
                    startActivity(intent);
                }
                if (i==10)
                {
                    Intent intent = new Intent(Program.this,program11.class);
                    startActivity(intent);
                }




            }

        });
    }
}


