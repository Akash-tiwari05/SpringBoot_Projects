package com.Cineflex.Plan;

public class Premium implements Plan{
   private String planName = "Premium";

    @Override
    public String getPlanName() {
        return planName;
    }
}
