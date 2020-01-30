package com.minor.microprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Arithmetic extends AppCompatActivity {

    ListView listView;

    String[] str={
        "ADD R:(Add register to accumulator)",
            "ADC R:(Add register with carry to accumulator)",
            "ADD M:(Add memory to accumulator)",
            "ADC M:(Add memory with carry to accumulator)",
            "ADI data:(Add immediate data to accumulator)",
            "ACI data:(Add with carry immediate data to accumulator)",
            "SUB R:(Subtract register from accumulator)",
            "SBB R:(Subtract register from accumulator with borrow)",
            "SUB M:(Subtract memory from accumulator)",
            "SBB M:(Subtract memory from accumulator with borrow)",
            "SUI data:(Subtract immediate data from accumulator)",
            "SBI data:Subtract immediate data from accumulator with borrow",
            "INR R:(Increment register content by 1)",
            "INR M:(Increment the memory content by 1)",
            "INX Rp:(Increment the content of register pair by 1)",
            "DCR R:(Decrement the register content by 1)",
            "DCR M:(Decrement the memory content by 1)",
            "DCX Rp:(Decrement the register pair content by 1)",
            "DAA:(Decrement adjust accumulator after addition)",
            "DAD Rp:(Double addition register-pair)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        listView=findViewById(R.id.list);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,str);
        listView.setAdapter(adapter);
    }
}
