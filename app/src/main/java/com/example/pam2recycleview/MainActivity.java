package com.example.pam2recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nossoRecycleView);

        List<Aluno> listAlunos = new ArrayList<>();
        Aluno Guilherme = new Aluno();
        Guilherme.setNome("Guilherme");
        Guilherme.setIdade(17);

        Aluno Ayodele = new Aluno();
        Ayodele.setNome("Ayodele");
        Ayodele.setIdade(17);

        Aluno Luqueta = new Aluno();
        Luqueta.setNome("Luqueta");
        Luqueta.setIdade(17);

        listAlunos.add(Guilherme);
        listAlunos.add(Ayodele);
        listAlunos.add(Luqueta);

        recyclerView.setAdapter(new NossoRecicleViewListDeAlunosAdapter(listAlunos, this));

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

    }



}
