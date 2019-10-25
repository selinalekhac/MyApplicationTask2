package com.example.myapplicationtask2;

public class FoodItem {

    private int fooditemID; // unique identifier for food item
    private String foodname; // name of food item
    private int price; // cost of the food item
    private String shortdiscription; // short discription of the food item
    private String fulldiscription; // detailed discription of the food item
    private int imageDrawableID; // R.drawable.my_image


    public FoodItem(int fooditemID, String foodname, int price, String shortdiscription, String fulldiscription, int imageDrawableId) {
        this.fooditemID = fooditemID;
        this.foodname = foodname;
        this.price = price;
        this.shortdiscription = shortdiscription;
        this.fulldiscription = fulldiscription;

        // idk how to add the picture to the fooditem detail help
        this.imageDrawableID = imageDrawableID;
    }


    public int getFooditemID() {
        return fooditemID;
    }

    public void setFooditemID(int fooditemID) {
        this.fooditemID = fooditemID;
    }


    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShortdiscription() {
        return shortdiscription;
    }

    public void setShortdiscription(String shortdiscription) {
        this.shortdiscription = shortdiscription;
    }

    public String getFulldiscription() {
        return fulldiscription;
    }

    public void setFulldiscription(String fulldiscription) {
        this.fulldiscription = fulldiscription;
    }

    // help picture needs setting
    public int getImageDrawableID() {
        return imageDrawableID;
    }

    public void setImageDrawableID(int imageDrawableID) {
        this.imageDrawableID = imageDrawableID;
    }

}