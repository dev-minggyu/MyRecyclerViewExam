package com.example.myrecyclerviewexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> datas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            datas.add(new CardItem(i + "번째", i + ""));
        }
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(datas);
        adapter.setOnClickListener(new MyRecyclerAdapter.MyRecyclerViewClickListener() {
            @Override
            public void onItemClicked(int pos) {

            }

            @Override
            public void onOKButtonClicked(int pos) {
                Toast.makeText(MainActivity.this, pos + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNOButtonClicked(int pos) {

            }
        });
        recyclerView.setAdapter(adapter);

    }
}
