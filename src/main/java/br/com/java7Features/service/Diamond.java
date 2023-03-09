package br.com.java7Features.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diamond {
    
    public List<String> obterListaNomes() {

        List<String> nomes = new ArrayList<>();

        nomes.add("Ricardo");
        nomes.add("Carla");

        return nomes;

    }

    public Map<String, Set<String>> obterValorListaCalcados() {

        Map<String, Set<String>> calcadosPorIdade = new HashMap<>();

        calcadosPorIdade.put("Adulto", new HashSet<>());
        calcadosPorIdade.get("Adulto").add("42");

        calcadosPorIdade.put("Infantil", new HashSet<>());
        calcadosPorIdade.get("Infantil").add("34");

        return calcadosPorIdade;

    }

}
