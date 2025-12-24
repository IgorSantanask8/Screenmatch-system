package br.com.alura.Screematch.calculos;
import br.com.alura.Screenmatch.models.Titulo;

public class Calculos {

    private int total_time;

    public int getTotal_time() {
        return total_time;
    }

    public void sum_total_time(Titulo t){
        total_time += t.getTime();
    }
}
