package com.marinho.instagramlayout.model;

import android.widget.ImageView;
import android.widget.TextView;


public class Postagem {

    private int imagemPessoa;
    private String NomePerfil;
    private int imagePostagem;
    private String  NumeroCurtidas;
    private String textNomePerfil;
    private String textPostagem;

    public Postagem(){

    }

    public Postagem(int imagemPessoa, String nomePerfil, int imagePostagem, String numeroCurtidas, String textNomePerfil, String textPostagem) {
        this.imagemPessoa = imagemPessoa;
        NomePerfil = nomePerfil;
        this.imagePostagem = imagePostagem;
        NumeroCurtidas = numeroCurtidas;
        this.textNomePerfil = textNomePerfil;
        this.textPostagem = textPostagem;
    }

    public int getImagemPessoa() {
        return imagemPessoa;
    }

    public void setImagemPessoa(int imagemPessoa) {
        this.imagemPessoa = imagemPessoa;
    }

    public String getNomePerfil() {
        return NomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        NomePerfil = nomePerfil;
    }

    public int getImagePostagem() {
        return imagePostagem;
    }

    public void setImagePostagem(int imagePostagem) {
        this.imagePostagem = imagePostagem;
    }

    public String getNumeroCurtidas() {
        return NumeroCurtidas;
    }

    public void setNumeroCurtidas(String numeroCurtidas) {
        NumeroCurtidas = numeroCurtidas;
    }

    public String getTextNomePerfil() {
        return textNomePerfil;
    }

    public void setTextNomePerfil(String textNomePerfil) {
        this.textNomePerfil = textNomePerfil;
    }

    public String getTextPostagem() {
        return textPostagem;
    }

    public void setTextPostagem(String textPostagem) {
        this.textPostagem = textPostagem;
    }
}
