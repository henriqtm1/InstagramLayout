package com.marinho.instagramlayout.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marinho.instagramlayout.R;
import com.marinho.instagramlayout.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_adapter,parent,false);
       return new MyViewHolder(itemLista);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);
        holder.imagemPessoa.setImageResource(postagem.getImagemPessoa());
        holder.textNome.setText(postagem.getNomePerfil());
        holder.imagePostagem.setImageResource(postagem.getImagePostagem());
        holder.textCurtidas.setText(postagem.getNumeroCurtidas());
        holder.textNomepessoa.setText(postagem.getTextNomePerfil());
        holder.textPostagem.setText(postagem.getTextPostagem());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //Atributos
        private ImageView imagemPessoa;
        private TextView  textNome;
        private ImageView imagePostagem;
        private TextView  textCurtidas;
        private TextView textNomepessoa;
        private TextView textPostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemPessoa = itemView.findViewById(R.id.imagemPessoa);
            textNome = itemView.findViewById(R.id.textNome);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
            textCurtidas = itemView.findViewById(R.id.textCurtidas);
            textNomepessoa = itemView.findViewById(R.id.textNomepessoa);
            textPostagem = itemView.findViewById(R.id.textPostagem);


        }


    }



}
