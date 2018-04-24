package com.example.kedu.futurewear;

/**
 * Created by saike on 17-04-2018.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class DB_helper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "future_wear.db";
    private static final int DATABASE_VERSION = 35;

    // Database creation sql statement
    private static final String CREATE_TABLE_PRODUCT =
            "create table if not exists product (product_id text primary key , "+"Productname text not null,"+" Description text);";

    private static final String CREATE_TABLE_Distributor ="create table if not exists distributor (product_id text primary key, "+"Name text not null, "+"Description text,"+" Website text);";
    private static final String CREATE_TABLE_FILTER =
            "create table if not exists filters (product_id text primary key, "+"Fair_Trade_Sourcing text  not null," +
                    " Fair_Wages text  not null," +
                    " Gender_Equal_Hiring text," +
                    " Gives_Back_To_Charity text," +
                    " Local_Production text," +
                    " Biodegradable_products text," +
                    " Carbon_natrual text," +
                    " Energy_Saving_Practices text," +
                    " Organic_Materials text," +
                    " Recycled_materials text," +
                    " B_Corporation text," +
                    " Fair_Trade_USA text," +
                    " Fairtrade_International text," +
                    " WRAP text," +
                    " GOTS text);";
    private static final String sql =
            "INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1001','1','0','0','0','1','1','1','1','1','1','1','1','1','1','1');" ;

    public DB_helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(CREATE_TABLE_FILTER);
        database.execSQL(CREATE_TABLE_PRODUCT);
        database.execSQL(CREATE_TABLE_Distributor);
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1002','1','1','0','0','1','1','1','1','1','1','1','1','1','1','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1003','1','1','0','1','1','1','1','1','1','1','1','1','1','1','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1004','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1005','1','1','1','0','1','1','1','1','1','1','1','1','1','1','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1006','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1007','0','1','1','0','1','1','1','1','1','0','1','1','0','0','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1008','0','1','1','0','1','1','0','0','1','1','1','1','1','1','1');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1009','1','0','1','0','1','1','1','1','1','1','1','0','1','1','0');");
        database.execSQL("INSERT INTO filters(product_id,Fair_Trade_Sourcing,Fair_Wages,Gender_Equal_Hiring,Gives_Back_To_Charity,Local_Production,Biodegradable_products,Carbon_natrual,Energy_Saving_Practices,Organic_Materials,Recycled_materials,B_Corporation,Fair_Trade_USA,Fairtrade_International,WRAP,GOTS) VALUES('a1010','1','1','0','0','1','0','1','1','1','1','1','1','1','0','1');");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1002','A & A Eco Products','Fabrics,Clothing and bedding')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1003','Pohono Apparel','Unisex Clothing')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1004','Tamga Design','Sustainable Fabrics')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1005','One Savvy Mother','Ethnically Produced')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1006','Maven Women','For Professional Women')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1007','Modernation','Vintage. One of a kind.')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1008','Cozy Cocoon','For Tender Infants')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1009','Olli','Footwear For Women')");
        database.execSQL("INSERT INTO product(product_id,productname,description) values('a1010','Coco Colectivo','Handmade Exotic Accessories')");
       //Distributor Table insertion
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1002','A & A Eco Products','We are manufacturers of organic fabrics,clothing and bedding.Offer low MOQs,private label on offer.','http://www.aaeco.net/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1003','Pohono Apparel','ohono Apparel is a clothing brand offering sustainable apparel that supports environmental conservation. We offer high-quality garments made from 100% organic cotton and manufactured using renewable clean energy, to minimize the environmental footprint of our products.','http://www.aaeco.net/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1004','Tamga Design','Biomaterials design and develop from materials that are 100% biodegradable, ethically sourced & produced healthy, and highly functional.','http://www.made-from-malai.com/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1005','One Savvy Mother','To create 100% sustainable products that combine ethics and aesthetics. We believe fashion can be beautiful and responsible and hence we created this line to make stylish ethical fashion available to people at a price they can afford.','http://www.made-from-malai.com/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1007','Modernation','We strive to use sustainable fabrics of materials that are kind to the environment, better working conditions for the people who help us create, and better technology to track our impact. exceptional quality.','http://www.made-from-malai.com/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1008','Cozy Cocoon','Provide beautiful eco-friendly swaddling products using only fabrics, design and manufactured in the USA.','http://www.made-from-malai.com/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1009','Olli','Fair Trade natural rubber flip flops. A biodegradable, renewable, and sustainable material safe for the environment and your foot.','http://www.made-from-malai.com/')");
        database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1010','Coco Colectivo','orking with different artisan families, collectives and small productions worldwide to provide fair produced, handmade, exclusive and exotic fashion trends and accessories','https://pohonoapparel.com/')");
//       database.execSQL("INSERT INTO distributor(product_id,name,description,website) values('a1001','Malai','Biomaterials design and develop from materials that are 100% biodegradable, ethically sourced & produced healthy, and highly functional.','http://www.made-from-malai.com/');");



        database.execSQL(sql);
        insertproduct(database);
        insertproduct1(database);

    }
    public  void insertproduct(SQLiteDatabase database){
        try{
            boolean didSucceed = false;
            ContentValues initialValues = new ContentValues();
            initialValues.put("product_id","a1001");
            initialValues.put("productname","Malai" );
            initialValues.put("Description","Biomaterial Design" );

            didSucceed = database.insert("product", null, initialValues) > 0;

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public  void insertproduct1(SQLiteDatabase database){
        try{
            boolean didSucceed = false;
            ContentValues initialValues = new ContentValues();
            initialValues.put("product_id","a1001");
            initialValues.put("name","Malai" );
            initialValues.put("Description","Biomaterials design and develop from materials that are 100% biodegradable, ethically sourced & produced healthy, and highly functional." );
            initialValues.put("website","http://www.made-from-malai.com/" );

            didSucceed = database.insert("distributor", null, initialValues) > 0;
             boolean boolean1 = didSucceed;


        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(DB_helper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");

        db.execSQL("DROP TABLE IF EXISTS filters");
        db.execSQL("DROP TABLE IF EXISTS product");
        db.execSQL("DROP TABLE IF EXISTS distributor");
        onCreate(db);
    }

}