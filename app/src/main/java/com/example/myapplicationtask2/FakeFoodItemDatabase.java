package com.example.myapplicationtask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeFoodItemDatabase {

    public static FoodItem getFooditemById (int fooditemID){
        return fooditems.get(fooditemID);
    }

    public static ArrayList<FoodItem> getAllFoodItems() {
        return new ArrayList<FoodItem>((List) Arrays.asList(fooditems.values().toArray()));
    }

    private static final HashMap<Integer, FoodItem> fooditems = new HashMap<>();

    static {
        fooditems.put(1, new FoodItem(
                1,
                "Bottled Water",
                2,
                "A cold bottle of fresh water",
                "A chilled bottle of H20 straight from the spring mountains. Made with recycled materials!",
                R.drawable.bottledwater
        ));

        fooditems.put(2, new FoodItem(
                2,
                "Breakfast Wrap",
                4,
                "Just the quick snack to get your morning going",
                "A scrumptious hot breakkie wrap with eggs, bacon, secret sauce, wrapped in tortilla goodness and sandwhich pressed to taste",
                R.drawable.breakfastwrap
        ));
        fooditems.put(3, new FoodItem(
                3,
                "Cheese Burger",
                3,
                "A small beef burger with cheese",
                "A fun sized delicious angus beef burger with a slice of dairy goodness with some tomato sauce, pickles and onions",
                R.drawable.cheeseburger
        ));

    }

}
