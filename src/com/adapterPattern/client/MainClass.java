package com.adapterPattern.client;

import com.adapterPattern.adapter.SquarePegAdapter;
import com.adapterPattern.service.RoundHole;
import com.adapterPattern.service.RoundPeg;
import com.adapterPattern.service.SquarePeg;

public class MainClass {

    public static void main(String[] args){
        RoundPeg roundPeg = new RoundPeg(30);
        RoundHole roundHole = new RoundHole(35);
        SquarePeg squarePeg = new SquarePeg(30);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println("Does round peg fits round hole - "+roundHole.fits(roundPeg));
        System.out.println("Does square peg fits round hole - "+roundHole.fits(squarePegAdapter));
    }
}
