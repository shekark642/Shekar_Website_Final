package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

import java.util.ArrayList;

public class summation extends backend{
    //variables
    public static ArrayList<Integer> num0;

    //constructor
    public summation(ArrayList<Integer> num1) {
        this.num0 = num1;
    }

    public int value = 0;
    public int number = 1;


    @Override
    public float findsum() {
        for (int i = 0; i< num0.size(); i++) {
            value = value + num0.get(i);



        }
        return value/num0.size();
    }



    @Override
    public String getMethod(){
        return "while";
    }



    }
