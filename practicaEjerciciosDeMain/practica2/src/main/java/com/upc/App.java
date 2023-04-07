package com.upc;

public class App {
    public static void main(String[]arg){
        IFundation fundation = new Fundation();

        int donation1 = 10;
        boolean result1 = fundation.putDonation(donation1);
        System.out.println(donation1 + " es par? " + result1);

        int donation2 = 7;
        boolean result2 = fundation.putDonation(donation2);
        System.out.println(donation2 + " es par? " + result2);
    }

}
