package br.com.java7Features.service;

public class SeparadorDigitosEmLiteraisNumericos {
    
    public double obterPrecoComSeparadorDeDigitosEmLiterais() {

        var valorComSeparador = 15_000_000.53d;

        return valorComSeparador;

    }

    public Long obterValorComSeparadorDeDigitosEmLiterais() {

        var valorComSeparador = 15_000_000L;

        return valorComSeparador;

    }

    public Long somar(long pontuacao, long valor) {

        var valorSomaComSeparador = pontuacao + valor;

        return valorSomaComSeparador;
        
    }
    
    public Long subtrair(long pontuacao, long valor) {

        var valorSubtracaoComSeparador = pontuacao - valor;

        return valorSubtracaoComSeparador;
        
    }
    
    public Long multiplicar(long pontuacao, long valor) {

        var valorMultiplicacaoComSeparador = pontuacao * valor;

        return valorMultiplicacaoComSeparador;
        
    }
    
    public Long dividir(long pontuacao, long valor) {

        var valorDivisaoComSeparador = pontuacao / valor;

        return valorDivisaoComSeparador;
        
    }

}
