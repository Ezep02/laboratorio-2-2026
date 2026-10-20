package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.ArrayList;
import java.util.List;

public class EstrategiaCompuesta implements EstrategiaDeMejora {

    private List<EstrategiaDeMejora> estrategias;

    public EstrategiaCompuesta(EstrategiaDeMejora... estrategias) {
        this.estrategias = List.of(estrategias);
    }

    @Override
    public void mejorar(Artefacto artefacto) {
        for(EstrategiaDeMejora estrategia : estrategias){
            estrategia.mejorar(artefacto);
        }
    }
}
