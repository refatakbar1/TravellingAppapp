package com.rifat.travellingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class TravelPlaceActivity extends AppCompatActivity {

    public  static final String NAME="name";
    public  static final String DETAIL="detail";
    public List<Language> languages=Provider.languageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_place);
        LanguageAdaptar adaptar=new LanguageAdaptar(TravelPlaceActivity.this,R.layout.list_item,languages);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adaptar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Language language = languages.get(i);
                displayDetails(language);
            }
        });

    }
    private void displayDetails(Language language) {
        Intent i = new Intent(TravelPlaceActivity.this,Detail.class);


        i.putExtra(NAME,language.getName());
        i.putExtra(DETAIL,language.getDetail());
        startActivity(i);
    }
}
