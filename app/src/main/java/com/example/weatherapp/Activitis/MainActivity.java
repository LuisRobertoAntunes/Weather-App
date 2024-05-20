package com.example.weatherapp.Activitis;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.Adapters.HourlyAdapters;
import com.example.weatherapp.Domains.Hourly;
import com.example.weatherapp.R;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapertHourly;
private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        intRecyclerview();

    }

    private void intRecyclerview() {
        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("21", "cloudy", 28));
        items.add(new Hourly("22", "sunny", 29));
        items.add(new Hourly("23", "wind", 30));
        items.add(new Hourly("00", "rainy", 31));
        items.add(new Hourly("01", "storm", 32));


        recyclerView = findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapertHourly = new HourlyAdapters(items);
        recyclerView.setAdapter(adapertHourly);

    }
}