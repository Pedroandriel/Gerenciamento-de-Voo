package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooGol extends Voo{
    private int capacidadePassageiros;

    public VooGol(String numeroVoo, String origem, String destino, String datePartida, int capacidadePassageiros){
        super(numeroVoo, origem, destino,  datePartida);
        this.capacidadePassageiros = capacidadePassageiros;

    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

}
