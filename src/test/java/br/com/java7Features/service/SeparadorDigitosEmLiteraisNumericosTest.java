package br.com.java7Features.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeparadorDigitosEmLiteraisNumericosTest {

	private SeparadorDigitosEmLiteraisNumericos separadorDigitosEmLiteraisNumericos;
	private static final Long PONTUACAO = 25_000L;
	private static final Long VALOR = 5_000L;

	@BeforeEach
	public void setUp() {
		separadorDigitosEmLiteraisNumericos = new SeparadorDigitosEmLiteraisNumericos();
	}

	@Test
	@DisplayName("obterPrecoComSeparadorDeDigitosEmLiterais_return15000000.53")
	void obterPrecoComSeparadorDeDigitosEmLiterais_return1500000053() {

		double valorSemSeparador = separadorDigitosEmLiteraisNumericos.obterPrecoComSeparadorDeDigitosEmLiterais();

		assertEquals(15000000.53, valorSemSeparador);

	}

	@Test
	void obterValorComSeparadorDeDigitosEmLiterais_return15000000() {

		Long valorSemSeparador = separadorDigitosEmLiteraisNumericos.obterValorComSeparadorDeDigitosEmLiterais();

		assertEquals(15000000, valorSemSeparador);

	}

	@Test
	void somar_return30000_quando25_000SomadoCom5_000() {

		Long valorSemSeparador = separadorDigitosEmLiteraisNumericos.somar(PONTUACAO, VALOR);

		assertEquals(30000, valorSemSeparador);

	}

	@Test
	void subtrair_return20000_quando25_000SubtraidoPor5_000() {

		Long valorSemSeparador = separadorDigitosEmLiteraisNumericos.subtrair(PONTUACAO, VALOR);

		assertEquals(20000, valorSemSeparador);

	}

	@Test
	void multiplicar_return125000000_quando25_000MultiplicadoPor5_000() {

		Long valorSemSeparador = separadorDigitosEmLiteraisNumericos.multiplicar(PONTUACAO, VALOR);

		assertEquals(125000000, valorSemSeparador);

	}

	@Test
	void dividir_return5_quando25_000MDivididoPor5_000() {

		Long valorSemSeparador = separadorDigitosEmLiteraisNumericos.dividir(PONTUACAO, VALOR);

		assertEquals(5, valorSemSeparador);

	}
	
}
