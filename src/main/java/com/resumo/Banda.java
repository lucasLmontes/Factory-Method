package com.resumo;

public class Banda {

    private String nomeMusica;
    private Musica banda;

    public Banda(String nomeBanda) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("com.resumo." + nomeBanda);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            this.banda = null;
        }
        if (!(objeto instanceof Musica)) {
            this.banda = null;
        }
        this.banda = (Musica) objeto;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public void publicar(){
        this.banda.publicar(nomeMusica);
    }
}

