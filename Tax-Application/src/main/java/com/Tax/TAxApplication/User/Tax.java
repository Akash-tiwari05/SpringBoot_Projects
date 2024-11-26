package com.Tax.TAxApplication.User;

public interface Tax
{
void setTaxableAmount(double Amount);
void calculateTaxAmount();
double getTaxAmount();
String getTaxType();
boolean isTaxPayed();
void payTax();
}
