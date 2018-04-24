package com.example.kedu.futurewear;

import java.io.Serializable;

public class Product implements Serializable{
    private  String Description;
    private String Productname;
    private String productid;
    public String getProductid() {
        return productid;
    }

    public void setProductid(String  productid) {
        this.productid = productid;
    }



    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String productname) {
        Productname = productname;
    }


}
