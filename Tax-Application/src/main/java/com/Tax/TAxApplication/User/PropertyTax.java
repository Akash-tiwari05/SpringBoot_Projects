package com.Tax.TAxApplication.User;

import org.springframework.stereotype.Service;

@Service
public class PropertyTax implements Tax {

    double taxableAmount;
    double taxAmount;
    boolean isTaxPayed;

    @Override
    public void setTaxableAmount(double Amount) {
        taxableAmount = Amount;
    }

    @Override
    public void calculateTaxAmount() {
        taxAmount = .05* taxableAmount;
    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "property";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        if(!isTaxPayed){
            System.out.println("Property Tax Of " +taxAmount + " has been paid" );
            isTaxPayed = true;
        }else{
            System.out.println("Your Property Tax is Already been Paid");
        }
    }
}
