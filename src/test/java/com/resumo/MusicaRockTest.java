package com.resumo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicaRockTest {

    @Test
    public void testarInstalacaoMusicaRock() {
        IMusica musica = MusicaFactory.obterMusica("Rock");
        assertEquals("Música de rock instalada", musica.instalar());
    }

    @Test
    public void testarDesinstalacaoMusicaRock() {
        IMusica musica = MusicaFactory.obterMusica("Rock");
        assertEquals("Música de rock desinstalada", musica.desinstalar());
    }
}