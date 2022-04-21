package com.company.model;

import com.company.utils.Utilities;

import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;

public class Bird {

    private String name, nameLatin;
    private int observations;

    public Bird(String name,  String nameLatin, int observations ) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = observations;
    }

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

    @Override
    public String toString() {
        return "Name: " + YELLOW_BRIGHT + name + ANSI_RESET + ", Latin Name: " + YELLOW_BRIGHT + nameLatin + ANSI_RESET + ", Number of Observations: "
                + YELLOW_BRIGHT + observations + ANSI_RESET;
    }
}
