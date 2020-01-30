package com.minor.microprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Branching extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branching);

        listView=findViewById(R.id.list);

        String[] str={

          "JC:Jump on carry(if result generates carry and CY=1)",
          "JNC:Jump on carry(CY=0)",
          "JZ:Jump on zero(if result is zero & z=1)",
          "JNZ:Jump on no zero(z=0)",
          "JP:Jump on plus(if D7=0 and S=0)",
          "JM:Jump on minus(if D7=1 and S=1)",
          "JPE:Jump on even parity(P=1)",
          "JPO:Jump on odd parity(P=0)",
          "PCHL:Jump to address specified by HL pair",
           "RC:Return if carry flag is set(CY=1)",
           "RNC:Return if carry flag is reset(CY=0)",
           "RZ:Return if zero flag is set(Z=1)",
           "RNZ:Return if zero flag is reset(Z=0)"

        };

        ArrayAdapter<String>adapter=new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,str);
        listView.setAdapter(adapter);
    }
}
