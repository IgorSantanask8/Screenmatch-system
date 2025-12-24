package br.com.alura.Screenmatch.models;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int ep_temporada;
    private int min_per_ep;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMin_per_ep() {
        return min_per_ep;
    }

    public void setMin_per_ep(int min_per_ep) {
        this.min_per_ep = min_per_ep;
    }

    public int getEp_temporada() {
        return ep_temporada;
    }

    public void setEp_temporada(int ep_temporada) {
        this.ep_temporada = ep_temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getMinutes_duration() {
        return temporadas * min_per_ep * ep_temporada;
    }
}
