package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooAzul extends Voo {
    private int capacidadePassageiros;

    public VooAzul(String numeroVoo, String origem, String destino, String datePartida, int capacidadePassageiros) {
        super(numeroVoo, origem, destino, datePartida);
        this.capacidadePassageiros = capacidadePassageiros;

    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
}