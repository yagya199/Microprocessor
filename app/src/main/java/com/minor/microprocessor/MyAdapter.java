package com.minor.microprocessor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private int icons[];
    private String word[];
    private Context context;
    private LayoutInflater inflater;
    public MyAdapter(Context context, String word[],int icons[])
    {
       this.icons=icons;
       this.context=context;
        this.word=word;
    }

    @Override
    public int getCount() {
        return  word.length;
    }

    @Override
    public Object getItem(int position) {
        return word[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v=convertView;
        if(convertView==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.my_layout,null);
        }

        TextView textView=v.findViewById(R.id.tv1);
        textView.setText(word[position]);
        ImageView imageView=v.findViewById(R.id.image);
        imageView.setImageResource(icons[position]);
        return  v;



    }
}
