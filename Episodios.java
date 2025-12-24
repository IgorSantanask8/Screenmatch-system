package br.com.alura.Screenmatch.models;

import br.com.alura.Screematch.calculos.Classificavel;

public class Episodios implements Classificavel {

    private int number;
    private String name;
    private Serie serie;
    private int visu;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getVisu(){
        return visu;
    }

    public void setVisu(int visu){
        this.visu = visu;
    }

    @Override
    public int getClassificacao() {
        if(visu > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
