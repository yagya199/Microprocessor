package com.minor.microprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Control extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        listView=findViewById(R.id.list);

        String[] str={
                "PUSH Rp:(Push the content of register pair to stack)",
                "POP Rp:(Pop the content of register pair,which was saved,from the stack)",
                "SPCHL:(Move the contents of HL pair to SP)",
                "XTHL:(Exchange stack-top with HL pair)",
                "IN Port address:(Input to accumulator from I/O port)",
                "OUT Port address:(Output from accumulator to I/O port)",
                "HLT:(Stops the microproceesor)",
                "NOP:(No Operation)"

        };

        ArrayAdapter<String>adapter=new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,str);
        listView.setAdapter(adapter);
    }
}
