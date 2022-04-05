package com.example.ipl01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Expert11Data.DataModel;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> {

    ArrayList<DataModel> dataHolder;

    public myAdapter(ArrayList<DataModel> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expert11_layout, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.img.setImageResource(dataHolder.get(position).getExpert_pic());
        holder.team.setImageResource(dataHolder.get(position).getExpert_team());
        holder.name.setText(dataHolder.get(position).getExpert_name());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {

        ImageView img, team;
        TextView name;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_face);
            team = itemView.findViewById(R.id.imgTeam);
            name = itemView.findViewById(R.id.name);
        }
    }
}
