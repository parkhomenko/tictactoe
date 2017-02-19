package com.hillel.projects.homework20;

import java.util.Date;

public class City {
    private String name;
    private int population;
    private Date foundation;

    public City(String name, int population, Date foundation) {
        this.name = name;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (population != city.population) return false;
        if (!name.equals(city.name)) return false;
        return foundation.equals(city.foundation);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + population;
        result = 31 * result + foundation.hashCode();
        return result;
    }
}
