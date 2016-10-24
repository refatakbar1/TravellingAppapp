package com.rifat.travellingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
private ListView listViewallcontact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listViewallcontact=(ListView)findViewById(R.id.listView2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_new_signup:
                startActivity(new Intent(this,signupdetail.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        DBHelper db=new DBHelper(this);
        ArrayList<String>names=new ArrayList<String>();
        for(int i=0;i<db.getAllSignUps().size();i++)
            names.add(db.getAllSignUps().get(i).getName());
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        listViewallcontact.setAdapter(adapter);
        super.onResume();
    }
}
