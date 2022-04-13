package com.company;

import java.util.ArrayList;

public class BirdDatabase {
    ArrayList<Bird> birdArray = new ArrayList<>();

    public BirdDatabase(){}
    public void addBird(Bird bird){
        birdArray.add(bird);
    }

    public void sowList(){
        for(int x = 0; x < birdArray.size(); x++){
            System.out.println(birdArray.get(x));
        }
    }

    public int sizeOfBirtArray(){
        return birdArray.size();
    }

    public int getBirdByName(String name){
        int index = -1;
        for(int x = 0; x < birdArray.size(); x++){
            if(name == birdArray.get(x).getName()){
                index = x;
                break;
            }
        }
        return index;
    }
}