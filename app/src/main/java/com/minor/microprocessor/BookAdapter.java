package com.minor.microprocessor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BookAdapter extends BaseAdapter {
    Context context;
    String[] word;
    int[] icon;
    LayoutInflater inflater;
    public BookAdapter(Context context, String[] word,int[] icon) {
        this.context=context;
        this.word=word;
        this.icon=icon;
    }

    @Override
    public int getCount() {
        return word.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(convertView==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.list,null);
        }

        ImageView imageView=v.findViewById(R.id.image);
        TextView textView=v.findViewById(R.id.text);

        imageView.setImageResource(icon[position]);
        textView.setText(word[position]);
        return  v;

    }
}
