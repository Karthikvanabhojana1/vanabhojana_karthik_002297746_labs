/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author karthikv
 */
public class Order {
    ArrayList<OrderItems> orderItemList;
    public Order(){
        this.orderItemList=new ArrayList<OrderItems>();
    }

    public ArrayList<OrderItems> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItems> oderItemList) {
        this.orderItemList = oderItemList;
    }
    
   public void addNewOderItem(Product product, double price, int quantity){
       OrderItems orderItems=new OrderItems(product,price,quantity);
       
       orderItemList.add(orderItems);
//        return orderItems;
   }

    public OrderItems findProduct(Product productselected) {
        
        for(OrderItems oi:this.getOrderItemList()){
            if(oi.getProduct().equals(productselected)){
                return oi;
            }
        }
        
        return null;
             }

    public void deleteItem(OrderItems item) {
        
        this.orderItemList.remove(item);
    }
   
 
}
