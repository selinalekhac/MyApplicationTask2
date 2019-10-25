package com.example.myapplicationtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Food_Item_Details extends AppCompatActivity {

    private TextView foodnameTextView;
    private TextView priceTextView;
    private TextView descriptionTextView;
    private ImageView foodpicImageView;
    private TextView quantityOrderNumber;
    private Button addOrderButton;
    private ArrayList<FoodItem> fooditemdetail;

    public void setData(ArrayList<FoodItem> fooditemdetail){
        this.fooditemdetail = fooditemdetail;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__item__details);

        Intent intent = getIntent(); // getting the intent that was sent to get to this activity
        int fooditemID = intent.getIntExtra("fooditemID",0); // getting the extra stuff identified by the food item ID

        //getting the rest of the data for the food item details activity
        FoodItem foodItem = FakeFoodItemDatabase.getFooditemById(fooditemID);

        //connecting the views from the xml file to the java class
        foodnameTextView = findViewById(R.id.textView_fooditems_details_id);
        priceTextView = findViewById(R.id.textView_price_details_id);
        descriptionTextView = findViewById(R.id.textView_description_details_id);
        foodpicImageView = findViewById(R.id.imageView_foodpicdetails_id);
        quantityOrderNumber = findViewById(R.id.textView_quantityordered_id);
        addOrderButton = findViewById(R.id.button_add_to_order_id);

        //time to set the views and make it show the data we want it to show from the database
        foodnameTextView.setText(foodItem.getFoodname());;
        priceTextView.setText(Integer.toString(foodItem.getPrice()));
        descriptionTextView.setText(foodItem.getFulldiscription());
        foodpicImageView.setImageResource(FakeFoodItemDatabase.foodimage[1]);
        //quantityOrderNumber = findViewById(R.id.)  haven't figured out how to input a number and store it to the database yet



    }
}
