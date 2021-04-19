package com.geek.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geek.finance2.adapter.MainAdapter;
import com.geek.finance2.databinding.ActivityMainBinding;
import com.geek.finance2.model.RVModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private final ArrayList<RVModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        addListItem();
        initView();
    }

    private void addListItem() {
        list.add(new RVModel("СОВЕТЫ", R.drawable.ic_advice));
        list.add(new RVModel("РАСХОДЫ", R.drawable.ic_currency_usd));
        list.add(new RVModel("ПОКУПКИ", R.drawable.ic_cart_outline));
        list.add(new RVModel("СОВЕТЫ", R.drawable.ic_advice));

    }

    private void initView() {
        MainAdapter adapter = new MainAdapter(list);
        binding.recyclerView.setAdapter(adapter);
    }
}