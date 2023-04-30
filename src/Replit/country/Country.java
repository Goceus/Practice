package Replit.country;

public class Country {

    String name;
    String continent;
    long population;
    boolean nearWater;

    public Country(String name, String continent){
        this.name = name;
        this.continent = continent;
    } // two argument constructor

    public Country(String name, String continent, long population){
        this(name, continent);
        this.population = population;
    } // three argument constructor

    public Country(String name, String continent, long population, boolean nearWater){
        this(name, continent, population);
        this.nearWater = nearWater;
    } // four argument constructor



}
