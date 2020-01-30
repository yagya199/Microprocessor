package com.minor.microprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Logical extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical);

        listView=findViewById(R.id.list);

        String[] str={
                "ANA R:(AND register with accumulator)",
                "ANA M:(AND memory with accumulator)",
                "ANI data:(AND immediate data with accumulator ",
                "ORA R:(OR register with accumulator)",
                "ORA M:(OR memory with accumulator)",
                "ORI Data:(OR immediate data with accumulator)",
                "XRA R:(EXOR register with accumulator)",
                "XRA M:(EXOR memory with accumulator)",
                "XRI DATA:(EXOR immediate data with accumulator)",
                "CMA:(Complement the accumulator)",
                "CMP R:(Compare register with accumulator)",
                "CMP M:(Compare memory with accumulator)",
                "CPI DATA:(Compare immediate data with accumulator)",
                "CMC:(Complement the carry status)",
                "STC:Set carry status",
                "RLC:(Rotate accumulator left)",
                "RAL:(Rotate accumulator left through carry)",
                "RRC:(Rotate accumulator right)",
                "RAR:(Rotate accumulator right through carry"
        };

        ArrayAdapter<String>adapter=new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,str);
        listView.setAdapter(adapter);
    }
}
