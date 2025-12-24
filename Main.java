import br.com.alura.Screematch.calculos.Calculos;
import br.com.alura.Screematch.calculos.Recomendacao;
import br.com.alura.Screenmatch.models.Episodios;
import br.com.alura.Screenmatch.models.Movie;
import br.com.alura.Screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.setName("Interstelar");
        myMovie.setTime(180);
        myMovie.setLaunchingDate(2016);

        myMovie.Review_it(9);
        myMovie.Review_it(10);
        myMovie.Review_it(8);

        myMovie.Print_Information();
        System.out.println("Total de avaliacoes : " + myMovie.getTotal_reviews());
        System.out.println("media : " + myMovie.media());

        Serie mySerie = new Serie();
        mySerie.setMin_per_ep(50);
        mySerie.setTemporadas(10);
        mySerie.setEp_temporada(10);
        mySerie.setTime(5000);
        System.out.println("Tempo para maratonar a serie : " + mySerie.getMinutes_duration());

        Movie myMovie_2 = new Movie();
        myMovie_2.setTime(200);

        Calculos calc = new Calculos();
        calc.sum_total_time(myMovie);
        calc.sum_total_time(myMovie_2);
        calc.sum_total_time(mySerie);
        System.out.println(calc.getTotal_time());

        Recomendacao rec = new Recomendacao();
        rec.Filtra(myMovie);

        Episodios episodios = new Episodios();
        episodios.setNumber(1);
        episodios.setSerie(mySerie);
        episodios.setVisu(500);
        rec.Filtra(episodios);
    }
}
