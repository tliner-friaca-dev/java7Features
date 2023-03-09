package br.com.java7Features.service;

import br.com.java7Features.Exception.CadastroException;

public class MultiCatchApplicationRegras {

    public void validaRegras(String nome, String idade) throws CadastroException {

        if (nome == null || nome.trim().equals("")) {
            throw new CadastroException("Nome é obrigatório para realizar o cadastro!!!");
        }

        int idadeNumero = Integer.parseInt(idade);

        System.out.println("\n\nOperação realizada com sucesso.");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
    
}
