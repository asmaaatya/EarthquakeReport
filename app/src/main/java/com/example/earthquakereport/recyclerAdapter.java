package com.example.earthquakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.earthquakereport.Data.Earthquakes;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.earthquakesHolder> {
ArrayList<Earthquakes> eartquakes_array=new ArrayList<>();
Context context;

    public recyclerAdapter(ArrayList<Earthquakes> eartquakes_array, Context context) {
        this.eartquakes_array = eartquakes_array;
        this.context = context;
    }

    @NonNull
    @Override
    public earthquakesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
 View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleritem,null,false);

        return new earthquakesHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull earthquakesHolder holder, int position) {
        Earthquakes earthquakes=eartquakes_array.get(position);
        holder.mag_text.setText(earthquakes.getMagnitude());
        holder.loc_text.setText(earthquakes.getLocation());
        holder.date_text.setText(String.valueOf(earthquakes.getDate()));
    }

    @Override
    public int getItemCount() {
        return eartquakes_array.size();
    }

    class earthquakesHolder extends RecyclerView.ViewHolder{
        TextView mag_text,loc_text,date_text;
        CardView cardView;
        public earthquakesHolder(@NonNull View itemView) {
            super(itemView);
            mag_text=itemView.findViewById(R.id.mag_text);
            loc_text=itemView.findViewById(R.id.loc_text);
            date_text=itemView.findViewById(R.id.date_text);
            cardView=itemView.findViewById(R.id.card);
        }

    }
}
