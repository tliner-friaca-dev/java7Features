package br.com.java7Features.service;

public class SwitchCaseComString {
    
    public int mesReferenciaNumeral(String mes) {

        switch (mes.toUpperCase()) {
            case "JANEIRO":
                return 1;

            case "FEVEREIRO":
                return 2;

            case "MARÇO":
                return 3;

            case "ABRIL":
                return 4;

            case "MAIO":
                return 5;

            case "JUNHO":
                return 6;

            case "JULHO":
                return 7;

            case "AGOSTO":
                return 8;

            case "SETEMBRO":
                return 9;

            case "OUTUBRO":
                return 10;

            case "NOVEMBRO":
                return 11;

            case "DEZEMBRO":
                return 12;
            default:
                return 0;
        }
        
    }

}
