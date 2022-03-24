package com.marinho.instagramlayout.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.marinho.instagramlayout.R;
import com.marinho.instagramlayout.adapter.PostagemAdapter;
import com.marinho.instagramlayout.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Postagem> postagens = new ArrayList<>();
    private RecyclerView recyclerPostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclePostagem);

        //Definindo Postagens
        this.prepararPostagens();

        //Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);
        //recyclerPostagem.addItemDecoration();

        //Define adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens() {

        Postagem posts = new Postagem(R.drawable.ic_pessoa1, "Brooke Carrie", R.drawable.imagem1, "215", "Brooke Carrie", "Viagem Irada, experiência incrível!! #tbt");
        this.postagens.add(posts);
        posts = new Postagem(R.drawable.ic_pessoa2, "Courtney Destiny", R.drawable.imagem2, "127", "Courtney Destiny", "A vida não tem replay.");
        this.postagens.add(posts);
        posts = new Postagem(R.drawable.ic_pessoa3, "Florence Grace", R.drawable.imagem3, "2806", "Florence Grace", "Vista incrivel!! #paris");
        this.postagens.add(posts);
        posts = new Postagem(R.drawable.ic_pessoa4, "Morgan Becky", R.drawable.imagem4, "98", "Morgan Becky", "Conhecendo varios lugares no mundo!");
        this.postagens.add(posts);
    }
}