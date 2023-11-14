package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

import java.util.ArrayList;

public class summation2 {
    public static ArrayList<Integer> num1;

    //constructor
    public summation2(ArrayList<Integer> num1) {
        this.num1 = num1;
    }

    public float value= 0;
    public int number=5;

    public float sigma() {
        for (int i = 0; i< num1.size(); i++) {
            value = value + num1.get(i);



        }
        return value/num1.size();
    }




}
