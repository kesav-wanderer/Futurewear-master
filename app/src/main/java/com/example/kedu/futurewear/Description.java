package com.example.kedu.futurewear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saike on 24-04-2018.
 */

public class Description extends AppCompatActivity{
    ArrayList<String> descriptions = new ArrayList <String>();
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productinfo);
        ImageView img=(ImageView)findViewById(R.id.productimage);
        TextView name=(TextView)findViewById(R.id.distributorname);
        TextView desc=(TextView)findViewById(R.id.desc);
        TextView contact=(TextView)findViewById(R.id.contact);

        String id =  getIntent().getStringExtra("position");
        descriptions=initDescriptions(id);
        int resID = getResources().getIdentifier(id,"drawable","com.example.kedu.futurewear");
        img.setImageResource(resID);
        name.setText(descriptions.get(0));
        desc.setText(descriptions.get(1));
        contact.setText(descriptions.get(2));


    }

    public ArrayList<String> initDescriptions(String id){
        ArrayList<String> desc = new ArrayList <String>();
        ProductDataSource pds = new ProductDataSource(this);
        pds.open();
        desc = pds.getDescription(id);
        pds.close();
        return desc;
    }

}
