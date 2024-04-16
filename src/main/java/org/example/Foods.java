package org.example;
import java.time.LocalDate;

public class Foods {
    private LocalDate dataValidade;
    private String ingredientes;

    public Foods(String ingredientes, LocalDate dataValidade){
        this.ingredientes = ingredientes;
        this.dataValidade = dataValidade;
    }
    public Foods(){}

    @Override
    public String toString() {
        return "Ingredientes: " + ingredientes + ", Data de valida: " + dataValidade;
    }

}
