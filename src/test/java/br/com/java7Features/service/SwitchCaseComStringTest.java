package br.com.java7Features.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SwitchCaseComStringTest {

    private SwitchCaseComString switchCaseComString;

	@BeforeEach
	public void setUp() {
        switchCaseComString = new SwitchCaseComString();
	}

    @Test
    void mesReferenciaNumeral_return1_quandoPassadoJaneiro() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Janeiro");

        assertEquals(1, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return2_quandoPassadoFevereiro() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Fevereiro");

        assertEquals(2, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return3_quandoPassadoMarco() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Março");

        assertEquals(3, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return4_quandoPassadoAbril() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Abril");

        assertEquals(4, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return5_quandoPassadoMaio() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Maio");

        assertEquals(5, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return6_quandoPassadoJunho() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Junho");

        assertEquals(6, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return7_quandoPassadoJulho() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Julho");

        assertEquals(7, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return8_quandoPassadoAgosto() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Agosto");

        assertEquals(8, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return9_quandoPassadoSetembro() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Setembro");

        assertEquals(9, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return10_quandoPassadoOutubro() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Outubro");

        assertEquals(10, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return11_quandoPassadoNovembro() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Novembro");

        assertEquals(11, mesNumeral);

    }

    @Test
    void mesReferenciaNumeral_return12_quandoPassadoDezembro() {

        int mesNumeral = switchCaseComString.mesReferenciaNumeral("Dezembro");

        assertEquals(12, mesNumeral);

    }


}
