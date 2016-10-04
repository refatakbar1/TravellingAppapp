package com.rifat.travellingapp;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by refat on 10/4/2016.
 */
public class LanguageAdaptar extends ArrayAdapter<Language> {

    private List<Language> languages;
    public LanguageAdaptar(Context context, int resource, List<Language>objects){
        super(context,resource,objects);
        this.languages=objects;

    }
    public View getView(int position, View view, ViewGroup parent) {

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Language language = languages.get(position);

        TextView text = (TextView) view.findViewById(R.id.textView);
        text.setText(language.getName());
        ImageView iv=(ImageView)view.findViewById(R.id.imageView);
        Bitmap bitmap=getBitmapFromAsset(language.getId());
        iv.setImageBitmap(bitmap);
        return view;
    }
    private Bitmap getBitmapFromAsset(String id){
        AssetManager assetManager=getContext().getAssets();
        InputStream stream=null;
        try {
            stream = assetManager.open(id + ".jpg");
            return BitmapFactory.decodeStream(stream);
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
}
