package com.resumo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MusicaFactoryTest {

    @Test
    public void testarExcecaoParaMusicaInexistente() {
        try {
            IMusica musica = MusicaFactory.obterMusica("Eletronica");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Música não encontrada", e.getMessage());
        }
    }

    @Test
    public void testarExcecaoParaMusicaIndisponivel() {
        try {
            IMusica musica = MusicaFactory.obterMusica("Classica");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Música indisponível", e.getMessage());
        }
    }
}