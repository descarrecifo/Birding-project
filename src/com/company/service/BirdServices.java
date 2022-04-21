package com.company.service;

import com.company.model.Bird;

import java.util.HashMap;

public class BirdServices {

    //************************************************************************************
    //*********************************** ADDING *****************************************
    //************************************************************************************

    public static Bird unpackHashmapBird(HashMap<String, String> dataToAddBird) {

        String name = dataToAddBird.get("name");
        String latinName = dataToAddBird.get("nameLatin");
        int observations = Integer.parseInt(dataToAddBird.get("observations"));

        return new Bird(name, latinName, observations);
    }

}
