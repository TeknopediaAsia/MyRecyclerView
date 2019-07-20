package com.utsman.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;

    List<String> listNama = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = findViewById(R.id.my_recycler_view);

        listNama.add("Satu");
        listNama.add("Dua");
        listNama.add("Tiga");
        listNama.add("Empat");
        listNama.add("Lima");

        NamaAdapter namaAdapter = new NamaAdapter(listNama);

        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        myRecyclerView.setAdapter(namaAdapter);

    }
}
