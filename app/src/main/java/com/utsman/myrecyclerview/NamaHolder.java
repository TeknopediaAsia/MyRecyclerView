package com.utsman.myrecyclerview;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NamaHolder extends RecyclerView.ViewHolder {

    public NamaHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(String nama) {
        TextView textNama = itemView.findViewById(R.id.text_view_item_nama);

        textNama.setText(nama);
    }
}
