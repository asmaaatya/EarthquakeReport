package com.example.earthquakereport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.earthquakereport.Data.Earthquakes;

import org.json.JSONException;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
recyclerAdapter adapter;
    ArrayList<Earthquakes> eartquakes_array=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.earth_list);
        adapter = new recyclerAdapter(eartquakes_array,this);
        // Create a fake list of earthquakes.
        try {
            ArrayList<Earthquakes> earthquakes = QueryUtils.extractEarthquakes();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        eartquakes_array.add(new Earthquakes("7.2","canda now", 24/5/2021L));
        eartquakes_array.add(new Earthquakes("3.4","america yes", 3/7/2018L));
        eartquakes_array.add(new Earthquakes("7.2","canda", 24/5/2021L));
        eartquakes_array.add(new Earthquakes("7.2","canda", 24/5/2021L));
        eartquakes_array.add(new Earthquakes("7.2","canda", 24/5/2021L));
        eartquakes_array.add(new Earthquakes("7.2","canda", 24/5/2021L));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


    }
}