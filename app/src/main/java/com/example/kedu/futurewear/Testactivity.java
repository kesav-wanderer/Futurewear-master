package com.example.kedu.futurewear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Testactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testactivity);
        Intent intent = getIntent();
        String query = null;
        ArrayList<Service> hashMap = (ArrayList<Service>)intent.getSerializableExtra("map");
        if(hashMap.isEmpty()) {
             query = "Select product_id from filters";
        }else {
         query = "Select product_id from filters where ";
        }
        for(Service test_name: hashMap){
            if(test_name==hashMap.get(hashMap.size()-1)){
                String name = test_name.getName().replaceAll(" ", "_");
                query= query+name+"= 1";
            }else{
                String name = test_name.getName().replaceAll(" ", "_");

                query= query+name+"= 1 AND ";

            }
        }
        //Toast.makeText(Testactivity.this,query,Toast.LENGTH_LONG).show();
        ProductDataSource pds= new ProductDataSource(this);

        try{
            pds.open();
            ArrayList<Product> productlist =  pds.getproduct(query);

            for(Product product: productlist ){
                Toast.makeText(Testactivity.this,"hi 123 "+product.getProductid()+" "+product.getProductname(),Toast.LENGTH_LONG).show();

            }
            pds.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
