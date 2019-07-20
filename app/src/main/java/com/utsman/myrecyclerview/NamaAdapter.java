package com.utsman.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NamaAdapter extends RecyclerView.Adapter<NamaHolder> {

    List<String> listNama = new ArrayList<>();

    public NamaAdapter(List<String> listNama) {
        this.listNama = listNama;
    }

    @NonNull
    @Override
    public NamaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_nama, viewGroup, false);
        return new NamaHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NamaHolder namaHolder, int i) {
        String nama = listNama.get(i);
        namaHolder.bind(nama);
    }

    @Override
    public int getItemCount() {
        return listNama.size();
    }
}
