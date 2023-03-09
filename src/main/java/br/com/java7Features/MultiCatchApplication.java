package br.com.java7Features;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.java7Features.Exception.CadastroException;
import br.com.java7Features.service.MultiCatchApplicationRegras;

@SpringBootApplication
public class MultiCatchApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MultiCatchApplication.class, args);
		
		System.out.println("\n----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------\n");


        MultiCatchApplicationRegras multiCatchApplicationRegras = new MultiCatchApplicationRegras();

		try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.println("Informe qual erro deseja verificar: \n1. para Erro no Cadastro \n2. para Erro no formato do número \n3. para realizar o processo corretamente ");
            String erro = entrada.nextLine();

            
            if (erro.equalsIgnoreCase("1")) {

                String nome = "";
                String idade = "35";
                multiCatchApplicationRegras.validaRegras(nome, idade);

            } else if (erro.equalsIgnoreCase("2")){
                
                String nome = "Renato";
                String idade = "trinta";
                multiCatchApplicationRegras.validaRegras(nome, idade);
                
            } else if (erro.equalsIgnoreCase("3")){
                
                String nome = "Ricardo";
                String idade = "40";
                multiCatchApplicationRegras.validaRegras(nome, idade);
                
            } else {
                
                System.err.println("Os parâmetros de entrada devem ser 1, 2 ou 3.");

            }
            

        } catch (CadastroException | NumberFormatException e) {
			System.err.println("Erro na operação. Motivo: " + e.getMessage());
		}

	}

}
