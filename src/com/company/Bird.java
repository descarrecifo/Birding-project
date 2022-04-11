package com.company;

import static com.company.Main.ask;
import static com.company.Main.scanner;

public class Bird {
    //attributes
    private String name;
    private String nameLatin;
    private int observations;

    //constructor
    public Bird(String name,  String nameLatin, int observations ) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = observations;
    }

    //methods


    ////getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public static void addObservation(Bird bird){
        int ObsNum = Integer.parseInt(ask(scanner, "How many observations to "+bird.getName()+" do you want to add?"));
        bird.setObservations(bird.getObservations()+ObsNum);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Latin Name: " + nameLatin + ", Number of Observations: " + observations;
    }
}