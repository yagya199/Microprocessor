package com.minor.microprocessor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class InstructionAdapter extends BaseAdapter {

    private int icons[];
    private int word[];
    private Context context;
    private LayoutInflater inflater;

    public InstructionAdapter(Context context, int word[],int icons[])
    {
        this.icons=icons;
        this.context=context;
        this.word=word;
    }
    @Override
    public int getCount() {
        return word.length;
    }

    @Override
    public Object getItem(int position) {
        return  word[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;
        if(convertView==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.instruction_layout,null);
        }

        TextView textView=v.findViewById(R.id.title_text);
        textView.setText(word[position]);
        TextView textView12=v.findViewById(R.id.desc_text);
        textView12.setText(icons[position]);


        return  v;

    }
}
