package com.example.pam2recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AlunoViewHolder extends RecyclerView.ViewHolder {

    TextView nomeTextView;
    TextView idadeTextView;

    public AlunoViewHolder(@NonNull View itemView) {
        super(itemView);

        nomeTextView = (TextView)
                itemView.findViewById(R.id.textViewNome);

        idadeTextView = (TextView)
                itemView.findViewById(R.id.textViewIdade);

    }
}
