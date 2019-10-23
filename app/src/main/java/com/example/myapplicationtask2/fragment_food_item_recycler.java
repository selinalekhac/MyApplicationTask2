package com.example.myapplicationtask2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_food_item_recycler extends Fragment {

    private RecyclerView recyclerView;

    public fragment_food_item_recycler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment_food_item_recycler, container, false);
        View view = inflater.inflate(R.layout.fragment_fragment_food_item_recycler, container, false);

        // time to put in the normal layout stuff here
        recyclerView = view.findViewById(R.id.recyclerview_fooditem_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        FoodItemAdapter fooditemAdapter = new FoodItemAdapter();
        fooditemAdapter.setData(nameofdatabase.getAllFoodItems());
        recyclerView.setAdapter(fooditemAdapter);

        return view;

    }

}
