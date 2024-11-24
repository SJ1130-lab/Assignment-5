package com.example.assignment5;

import static com.example.assignment5.R.*;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SareeAdapter sareeAdapter;
    private List<Saree> sareeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create a list of sarees
        sareeList = new ArrayList<>();
        sareeList.add(new Saree("Kanchipuram Silk Saree", "₹20,000", "https://example.com/saree1.jpg"));
        sareeList.add(new Saree("Banarasi Silk Saree", "₹15,000", "https://example.com/saree2.jpg"));
        sareeList.add(new Saree("Cotton Saree", "₹2,000", "https://example.com/saree3.jpg"));
        sareeList.add(new Saree("Linen Saree", "₹4,500", "https://example.com/saree4.jpg"));

        // Set adapter to RecyclerView
        sareeAdapter = new SareeAdapter(sareeList);
        recyclerView.setAdapter(sareeAdapter);
    }
}
