package br.com.java7Features;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TryWithResourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryWithResourcesApplication.class, args);
		
		System.out.println("\n----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------\n");

		try (RecursoA recursoA = new RecursoA();
				RecursoB recursoB = new RecursoB()) {
            
            System.out.println("Try");

        } catch (Exception e) {
			System.err.println("Catch");
		}

	}

	static public class RecursoA implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Recurso - Close = fechou corretamente o RecursoA");
        }
        
    }

	static public class RecursoB implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Recurso - Close = fechou corretamente o RecursoB");
        }
        
    }
}
