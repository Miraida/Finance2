package com.geek.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geek.finance2.adapter.ExpensesAdapter;
import com.geek.finance2.adapter.MainAdapter;
import com.geek.finance2.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initView();
    }

    private void initView() {
        MainAdapter adapter = new MainAdapter();
        binding.recyclerView.setAdapter(adapter);
        ExpensesAdapter adapterEx = new ExpensesAdapter();
        binding.expensesRecycler.setAdapter(adapterEx);
    }
}