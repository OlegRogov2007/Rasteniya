package com.example.rasteniya;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder>{

    private final List<Flower> flowers;
    private final LayoutInflater inflater;

    public FlowerAdapter(List<Flower> flowers, LayoutInflater inflater) {
        this.flowers = flowers;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Flower flower=flowers.get(position);
        holder.flowerView.setImageResource(flower.getFlowerResource());
        holder.nameView.setText(flower.getName());
        holder.flowerDescriptionView.setText(flower.getFlowerDescription());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView flowerView;
        final TextView nameView, flowerDescriptionView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flowerView=itemView.findViewById(R.id.imageButton);
            nameView=itemView.findViewById(R.id.name);
            flowerDescriptionView=itemView.findViewById(R.id.flowerDescription);

        }
    }
}
