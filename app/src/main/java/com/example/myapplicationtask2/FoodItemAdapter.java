package com.example.myapplicationtask2;

//        at com.example.myapplicationtask2.FoodItemAdapter.onBindViewHolder(FoodItemAdapter.java:35)
//        at com.example.myapplicationtask2.FoodItemAdapter.onBindViewHolder(FoodItemAdapter.java:16)
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder> {

    private ArrayList<FoodItem> fooditemsToAdapt; //if doesnt work may be arraylist name
    public void setData(ArrayList<FoodItem> fooditemsToAdapt){
        this.fooditemsToAdapt = fooditemsToAdapt;
    }

    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        FoodItemViewHolder foodItemViewHolder = new FoodItemViewHolder(view); //somethings wrong here
        return foodItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, int position) {
        final FoodItem foodItemAtPosition = fooditemsToAdapt.get(position);
        holder.foodnameTextView.setText(foodItemAtPosition.getFoodname());
        holder.priceTextView.setText(Integer.toString(foodItemAtPosition.getPrice()));



        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, Food_Item_Details.class);
                intent.putExtra("fooditemID", foodItemAtPosition.getFooditemID());
                context.startActivity(intent);
            }
        });
        holder.itemImageView.setImageResource(FakeFoodItemDatabase.foodimage[position]);

    }

    @Override
    public int getItemCount() {
        return fooditemsToAdapt.size();
    }

    public class FoodItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodnameTextView;
        public TextView priceTextView;
        public ImageView itemImageView;

        //needs a constructor
        public FoodItemViewHolder(View v) {
            super(v);
            view = v;
            foodnameTextView = v.findViewById(R.id.textView_food_name);
            priceTextView = v.findViewById(R.id.textView_price);
            itemImageView = v.findViewById(R.id.imageView_food_picture);
        }
    }
}
