package com.example.android.map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CodeTribe on 7/27/2017.
 */


public class CustomAdapter extends BaseAdapter{
    Context context;
    int[] Images;
    String[] Names;
    String[] titlename;
   double[] firstNumber, secondNumber;
    LayoutInflater inflater;


    public CustomAdapter(Context applicationContext, int[]Images, String[] Names,String[] titlename, double[] firstNumber, double[] secondNumber){
        this.context = applicationContext;
        this.Images = Images;
        this.Names = Names;
        this.titlename = titlename;
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;

        inflater = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount()
    {
        return Names.length;
    }


    @Override
    public  Object getItem(int position){
        return null;
    }
    @Override
    public long getItemId(int position){
        return 0;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent){

        view = inflater.inflate(R.layout.photo_items,null);
        TextView nameg = (TextView) view.findViewById(R.id.name);
        TextView titleg = (TextView) view.findViewById(R.id.title);
        ImageView Imageg = (ImageView) view.findViewById(R.id.imageIm);

        nameg.setText(Names[position]);
        titleg.setText(titlename[position]);
        Imageg.setImageResource(Images[position]);
        //...........................
        return view;
    }


}
