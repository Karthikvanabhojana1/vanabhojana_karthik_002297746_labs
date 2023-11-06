/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> featurelist;
    
    public ArrayList<Feature> getFeature() {
        return featurelist;
    }

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        featurelist=new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
public Feature addNewFeature(){
     Feature f = new Feature();
        featurelist.add(f);
        return f;
}
    
    @Override
    public String toString() {
        return name;
    }
    
}
