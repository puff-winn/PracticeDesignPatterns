package com.random;

class Derived

{

    protected void getDetails(){

        System.out.println("Derived class");

    }

}


public class Practice extends Derived

{

    protected void getDetails(){

        System.out.println("Test class");

    }


    public static void main(String[] args){

        Derived obj = new Derived();

        obj.getDetails();

    }

}
