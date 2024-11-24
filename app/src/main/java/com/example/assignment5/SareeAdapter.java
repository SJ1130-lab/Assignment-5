package com.example.assignment5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SareeAdapter extends RecyclerView.Adapter<SareeAdapter.ViewHolder> {

    private List<Saree> sareeList;

    public SareeAdapter(List<Saree> sareeList) {
        this.sareeList = sareeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout for individual saree
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_saree, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Saree saree = sareeList.get(position);
        holder.nameTextView.setText(saree.getName());
        holder.priceTextView.setText(saree.getPrice());


    }

    @Override
    public int getItemCount() {
        return sareeList.size();
    }

    // ViewHolder for individual items in the RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, priceTextView;
        ImageView sareeImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.saree_name);
            priceTextView = itemView.findViewById(R.id.saree_price);
            sareeImageView = itemView.findViewById(R.id.saree_image);
        }
    }
}
