package br.com.alura.Screematch.calculos;

import br.com.alura.Screenmatch.models.Titulo;

public class Recomendacao {

    private String recomendacao;

    public void Filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        }else if(classificavel.getClassificacao() >=2 ){
            System.out.println("Muito bem avaliavel no momento");
        }else{
            System.out.println("Assista depois");
        }
    }
}
