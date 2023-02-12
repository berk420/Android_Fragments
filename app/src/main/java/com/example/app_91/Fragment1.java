package com.example.app_91;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment1 extends ListFragment {
    ArrayList<String> cities = new ArrayList<>();
    ArrayAdapter<String> adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,
                viewGroup, false);
        adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, cities);
        setListAdapter(adapter);

        return view;
    }
    public void onListItemClick(ListView listView, View view,
                                int position, long id) {
        MainActivity.itemSelected = position;
        MainActivity.isSelected = true;
        if(MainActivity.itemSelected >= 0 && MainActivity.itemSelected <= 2){
            if(MainActivity.mp != null){
                MainActivity.startTime = 0;
                MainActivity.mp.stop();
                MainActivity.mp = null;
            }
        }
        if(MainActivity.itemSelected == 0){
            MainActivity.iv.setImageResource(R.drawable.denmark);
        }
        else if(MainActivity.itemSelected == 1){
            MainActivity.iv.setImageResource(R.drawable.france);
        }
        else if(MainActivity.itemSelected == 2){
            MainActivity.iv.setImageResource(R.drawable.poland);
        }
        else{
            MainActivity.iv.setImageResource(R.drawable.denmark);
        }

        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}