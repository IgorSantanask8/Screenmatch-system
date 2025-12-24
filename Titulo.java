package br.com.alura.Screenmatch.models;

public class Titulo {
    private String name;
    private int launchingDate;
    private boolean on_the_plan;
    private double sum_review;
    private int total_reviews;
    private int time;
    private int minutes_duration;

    public int getTotal_reviews(){
        return total_reviews;
    }

    public String getName() {
        return name;
    }

    public boolean isOn_the_plan() {
        return on_the_plan;
    }

    public int getLaunchingDate() {
        return launchingDate;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchingDate(int launchingDate){
        this.launchingDate = launchingDate;
    }

    public void setTime(int time){
        this.time = time;
    }

    public int getMinutes_duration() {
        return minutes_duration;
    }

    public void setMinutes_duration(int minutes_duration) {
        this.minutes_duration = minutes_duration;
    }

    public void Print_Information(){
        System.out.println("Nome do filme " + name);
        System.out.println("Data de lancamento : " + launchingDate);
        System.out.println("Incluso no plano : " + on_the_plan);
        System.out.println("Duracao do filme " + time);
    }
    public void Review_it(double note){
        sum_review += note;
        total_reviews++;
    }
    public double media(){

        return sum_review /total_reviews;
    }
}
