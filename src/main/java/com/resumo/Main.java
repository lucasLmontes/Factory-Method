package com.resumo;

public class Main {
    public static void main(String args[]) {
        Banda banda1 = new Banda("Queen");
        banda1.setNomeMusica("Bohemian Rhapsody");
        banda1.publicar();

        Banda banda2 = new Banda("Exaltasamba");
        banda2.setNomeMusica("Telegrama");
        banda2.publicar();
    }
}