package com.geek.finance2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.finance2.R;
import com.geek.finance2.model.RVModel;
import com.geek.finance2.databinding.ItemRvBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    ArrayList<RVModel> list;
    ItemRvBinding binding;

    private void addListItem(RVModel model) {
        list.add(model);
    }

    public MainAdapter() {
        list = new ArrayList<>();
        list.add(new RVModel("СОВЕТЫ", R.drawable.ic_advice));
        list.add(new RVModel("РАСХОДЫ", R.drawable.ic_currency_usd));
        list.add(new RVModel("ПОКУПКИ", R.drawable.ic_cart_outline));
        list.add(new RVModel("СОВЕТЫ", R.drawable.ic_advice));
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(ItemRvBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        public MainViewHolder(@NonNull ItemRvBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(RVModel rvModel) {
            binding.itemTextView.setText(rvModel.getTitle());
            binding.itemImageView.setImageResource(rvModel.getImage());
        }
    }
}
