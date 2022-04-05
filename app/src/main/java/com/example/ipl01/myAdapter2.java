package com.example.ipl01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ExpertRanks.DataModel;

import java.util.ArrayList;

public class myAdapter2 extends RecyclerView.Adapter<myAdapter2.myViewHolder2> {

    ArrayList<DataModel> dataHolder;

    public myAdapter2(ArrayList<DataModel> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expert11_ranks_layout, parent, false);
        return new myViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder2 holder, int position) {
        holder.img.setImageResource(dataHolder.get(position).getExpert_pic());
        holder.team.setImageResource(dataHolder.get(position).getExpert_team());
        holder.name.setText(dataHolder.get(position).getExpert_name());
        holder.rank.setText(dataHolder.get(position).getExpertTeam_rank());
        holder.points.setText(dataHolder.get(position).getExpertTeam_points());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class myViewHolder2 extends RecyclerView.ViewHolder {

        ImageView img, team;
        TextView name, rank, points;

        public myViewHolder2(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_face);
            team = itemView.findViewById(R.id.imgTeam);
            name = itemView.findViewById(R.id.name);
            rank = itemView.findViewById(R.id.expert_rank);
            points = itemView.findViewById(R.id.expert_points);
        }
    }
}
