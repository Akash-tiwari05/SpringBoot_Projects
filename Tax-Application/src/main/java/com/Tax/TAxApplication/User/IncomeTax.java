package com.Tax.TAxApplication.User;

import org.springframework.stereotype.Service;

@Service
public class IncomeTax implements Tax{

    double taxableAmount;
    double taxAmount;
    boolean isTaxPayed;
     public IncomeTax(){
        isTaxPayed = false;
     }

    @Override
    public void setTaxableAmount(double Amount) {
         taxableAmount = Amount;
    }

    @Override
    public void calculateTaxAmount() {
         if(taxableAmount <= 300000){
             taxAmount = 0;
         }else if(taxableAmount <= 600000){
             taxAmount = .05*taxableAmount;
         }else if(taxableAmount <= 900000){
             taxAmount = .1*taxableAmount;
         }else if(taxableAmount <= 1200000) {
             taxAmount = .15 * taxableAmount;
         }else if(taxableAmount <= 1500000) {
             taxAmount = .2 * taxableAmount;
         }else  {
             taxAmount = .3 * taxableAmount;
         }


    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "income";
    }

    @Override
    public boolean isTaxPayed() {
         return isTaxPayed;
    }

    @Override
    public void payTax() {
       if(!isTaxPayed){
           System.out.println("Income Tax Of " +taxAmount + " has been paid" );
           isTaxPayed = true;
       }else{
           System.out.println("Your Income Tax is Already been Paid");
       }
    }
}
