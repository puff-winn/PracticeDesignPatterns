package com.adapterPattern.adapter;

import com.adapterPattern.service.RoundPeg;
import com.adapterPattern.service.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getEdge() / 2), 2) * 2));
        return result;
    }
}
