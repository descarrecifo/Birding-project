package com.company;

import static com.company.Main.ask;
import static com.company.Main.scanner;
import static com.company.Menu.ANSI_RESET;
import static com.company.Menu.YELLOW_BRIGHT;

public class Bird {

    //************************************************************************************
    //********************************** ATTRIBUTES **************************************
    //************************************************************************************
    private String name;
    private String nameLatin;
    private int observations;

    //************************************************************************************
    //********************************** CONSTRUCTOR *************************************
    //************************************************************************************
    public Bird(String name,  String nameLatin, int observations ) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = observations;
    }

    //************************************************************************************
    //**************************** GETTERS AND SETTERS ***********************************
    //************************************************************************************

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

    //************************************************************************************
    //*********************************** METHODS ****************************************
    //************************************************************************************

    public static void addObservation(Bird bird){
        int ObsNum = Integer.parseInt(ask(scanner, "How many observations to "+YELLOW_BRIGHT+bird.getName()+ANSI_RESET+" do you want to add?"));
        bird.setObservations(bird.getObservations()+ObsNum);
    }

    @Override
    public String toString() {
        return "Name: " + YELLOW_BRIGHT + name + ANSI_RESET + ", Latin Name: " + YELLOW_BRIGHT + nameLatin + ANSI_RESET + ", Number of Observations: "
                + YELLOW_BRIGHT + observations + ANSI_RESET;
    }
}