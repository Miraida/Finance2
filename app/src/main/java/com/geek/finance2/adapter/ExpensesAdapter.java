package com.geek.finance2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.finance2.R;
import com.geek.finance2.databinding.ExpensesItemBinding;
import com.geek.finance2.model.ExpensesModel;

import java.util.ArrayList;

public class ExpensesAdapter extends RecyclerView.Adapter<ExpensesAdapter.ViewHolder> {
    ArrayList<ExpensesModel> list;
    ExpensesItemBinding binding;

    public ExpensesAdapter() {
        list = new ArrayList<>();
        list.add(new ExpensesModel("Кофе", R.drawable.ic_coffee, "200"));
        list.add(new ExpensesModel("Покупки", R.drawable.ic_shopping, "200"));
        list.add(new ExpensesModel("Oдежда", R.drawable.ic_t_shirt, "200"));
    }

    public void addItem(ExpensesModel model) {
        list.add(model);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ExpensesItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull ExpensesItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(ExpensesModel model) {
            binding.expensesItemIv.setImageResource(model.getImage());
            binding.expensesItemTextTv.setText(model.getName());
            binding.expensesItemAmountTv.setText(model.getAmount());
        }
    }
}
