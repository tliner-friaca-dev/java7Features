package br.com.java7Features.service;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiamondTest {

    private Diamond diamond;

	@BeforeEach
	public void setUp() {
        diamond = new Diamond();
	}

    @Test
    void obterListaNomes_returnListaPreenchida() {

        List<String> listaNomes = diamond.obterListaNomes();

        assertNotNull(listaNomes);

    }

    @Test
    void obterValorListaCalcados_returnListaPreenchida() {

        Map<String, Set<String>> listaCalcados = diamond.obterValorListaCalcados();

        assertNotNull(listaCalcados);

    }
}
