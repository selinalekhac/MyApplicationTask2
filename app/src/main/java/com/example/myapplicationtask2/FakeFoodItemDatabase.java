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
        fooditems.put(4, new FoodItem(
                4,
                "Chicken Caesar Salad",
                5,
                "A healthy bowl of greens",
                "A crunchy, scrumptious bowl of a variety of greens, tossed together with the freshest produce such as tomatoes, rocket, love it",
                R.drawable.chickencaesarsalad
        ));
        fooditems.put(5, new FoodItem(
                5,
                "Chicken Nuggets",
                3,
                "Mince Chicken Bites",
                "A golden, succulent bite of the best spices and flavours, you'll be sad when you only have one left",
                R.drawable.chickennuggets
        ));
        fooditems.put(6, new FoodItem(
                6,
                "Chicken Royale",
                3,
                "Chicken burger at affordable prices",
                "A juicy chicken burger, with just the right amount of mayo and lettuce, how good",
                R.drawable.chickenroyale
        ));
        fooditems.put(7, new FoodItem(
                7,
                "Chicken Wrap",
                5,
                "The wrap to satisfy your hunger",
                "A golden, succulent tender of chicken blanketed in a soft tortilla, some fresh salad tossed in as well",
                R.drawable.chickenwrap
        ));
        fooditems.put(8, new FoodItem(
                8,
                "Coca-Cola",
                2,
                "The soda that reins over the rest",
                "The golden liquid that's perfect with any meal, the sweetest, the most bubbly drink ever",
                R.drawable.coke
        ));
        fooditems.put(9, new FoodItem(
                9,
                "Fanta",
                2,
                "Orange flavoured soda, so yum",
                "The orange liquid that tastes so scrumptious, so delicious that will satisfy your cravings of a sweet drink",
                R.drawable.fanta
        ));
        fooditems.put(10, new FoodItem(
                10,
                "Fries",
                3,
                "Golden fries perfectly cooked and salted",
                "Soft potatoes, with the perfect outside crunch, perfectly salted and delicious you'll need more",
                R.drawable.fries
        ));
        fooditems.put(11, new FoodItem(
                11,
                "Frozen Drink",
                2,
                "An icy soda that is cold for longer",
                "Similar to shaved ice, but not really, sweet, but still icy, with a good texture where you can not just sip but also spoon",
                R.drawable.frozendrink
        ));
        fooditems.put(12, new FoodItem(
                12,
                "Hamburger",
                2,
                "Beef patty, sauce, and buns",
                "A small burger that involves a beef patty, with some tomato sauce, pickles, and onions, sandwiched between two soft buns",
                R.drawable.hamburger
        ));
        fooditems.put(13, new FoodItem(
                13,
                "Hashbrown",
                1,
                "Fried flat big potato",
                "Golden fried minced potatoes, perfectly fried and golden, with some soft delicious insides",
                R.drawable.hashbrown
        ));
        fooditems.put(14, new FoodItem(
                14,
                "Onion Rings",
                2,
                "Deep fried and golden battered onion",
                "Golden fried, perfectly sized onion rings, thats perfectly salted, yet sweet at the same time, but don't be afraid to have onion breath",
                R.drawable.onionrings
        ));
        fooditems.put(15, new FoodItem(
                15,
                "Sprite",
                2,
                "Transparent and sweet soda water",
                "Spicy water, that's just the right amount of carbonation, it goes so well with every meal",
                R.drawable.sprite
        ));
        fooditems.put(16, new FoodItem(
                16,
                "Sundae",
                2,
                "Dairy ice cream, with a drizzle of sauce",
                "Sweet, soft and smooth ice cream, that can have a drizzle of whatever sauces from chocolate, caramel, and strawberry",
                R.drawable.sundae
        ));
        fooditems.put(17, new FoodItem(
                17,
                "Whooper Burger",
                6,
                "The perfect burger with all the right ratios",
                "The best beef burger in the country, with a bun topped with sesame, with the best condiments to complement the angus beef",
                R.drawable.whopperburger
        ));
        fooditems.put(15, new FoodItem(
                18,
                "Whooper Junior",
                4,
                "Mini version of the whooper",
                "If you cannot finish the almighty whooper burger, the whooper junior is the burger for you, not only can you eat the burger you can also enjoy some fries",
                R.drawable.sprite
        ));
    }

}
