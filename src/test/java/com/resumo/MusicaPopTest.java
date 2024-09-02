package com.resumo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicaPopTest {

    @Test
    public void testarInstalacaoMusicaPop() {
        IMusica musica = MusicaFactory.obterMusica("Pop");
        assertEquals("Música de pop instalada", musica.instalar());
    }

    @Test
    public void testarDesinstalacaoMusicaPop() {
        IMusica musica = MusicaFactory.obterMusica("Pop");
        assertEquals("Música de pop desinstalada", musica.desinstalar());
    }
}