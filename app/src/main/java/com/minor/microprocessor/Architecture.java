package com.minor.microprocessor;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Architecture extends AppCompatActivity {

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);

        builder = new AlertDialog.Builder(this);







    }

    public void action(View view)

    {
        if(view.getId()==R.id.accumulator){

            builder.setMessage(R.string.accumulator);
            AlertDialog alert = builder.create();
            alert.setTitle("Accumulator");
            alert.show();

        }
        if(view.getId()==R.id.alu);
        {
            builder.setMessage(R.string.alu);
            AlertDialog alert = builder.create();
            alert.setTitle("Arithmetic and Logic Unit");
            alert.show();

        }

        if(view.getId()==R.id.control)
        {
            builder.setMessage(R.string.control);
            AlertDialog alert = builder.create();
            alert.setTitle("Timing and Control Unit");
            alert.show();

        }

        if(view.getId()==R.id.general)
        {
            builder.setMessage(R.string.general);
            AlertDialog alert = builder.create();
            alert.setTitle("General Purpose Register");
            alert.show();

        }

        if(view.getId()==R.id.counter)
        {
            builder.setMessage(R.string.counter);
            AlertDialog alert = builder.create();
            alert.setTitle("Program Counter");
            alert.show();

        }

        if(view.getId()==R.id.stack)
        {
            builder.setMessage(R.string.stack);
            AlertDialog alert = builder.create();
            alert.setTitle("Stack Pointer");
            alert.show();

        }

        if(view.getId()==R.id.register)
        {
            builder.setMessage(R.string.register);
            AlertDialog alert = builder.create();
            alert.setTitle("Increment And Decrement Register");
            alert.show();

        }

        if(view.getId()==R.id.flag)
        {
            builder.setMessage(R.string.flag);
            AlertDialog alert = builder.create();
            alert.setTitle("Flag Register");
            alert.show();

        }

        if(view.getId()==R.id.temporary)
        {
            builder.setMessage(R.string.temporary);
            AlertDialog alert = builder.create();
            alert.setTitle("Temporary Register");
            alert.show();

        }

        if(view.getId()==R.id.buffer)
        {
            builder.setMessage(R.string.buffer);
            AlertDialog alert = builder.create();
            alert.setTitle("Address and Address Data buffer");
            alert.show();

        }

        if(view.getId()==R.id.serial)
        {
            builder.setMessage(R.string.serial);
            AlertDialog alert = builder.create();
            alert.setTitle("Serial Input/Output Control");
            alert.show();

        }

        if(view.getId()==R.id.interupt)
        {
            builder.setMessage(R.string.temporary);
            AlertDialog alert = builder.create();
            alert.setTitle("Interrupt Control");
            alert.show();

        }

        if(view.getId()==R.id.decoder)
        {
            builder.setMessage(R.string.decoder);
            AlertDialog alert = builder.create();
            alert.setTitle("Instruction Register and Decoder");
            alert.show();

        }









    }



    }
