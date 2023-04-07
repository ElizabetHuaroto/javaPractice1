package com.upc;

public class Fundation implements IFundation {

    @Override
    public boolean putDonation(Integer entero) {
       if(entero%2==0) return true; //si es par
       else return false; // si es impar

    }
}
