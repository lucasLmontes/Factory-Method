package com.resumo;

public class MusicaFactory {

    public static IMusica obterMusica (String genero){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("com.resumo.Musica" + genero);
            objeto = classe.newInstance();
        } catch(Exception e){
            throw new IllegalArgumentException("Música não encontrada");
        }
        if(!(objeto instanceof IMusica)){
            throw new IllegalArgumentException("Música indisponível");
        }
        return (IMusica) objeto;
    }
}
