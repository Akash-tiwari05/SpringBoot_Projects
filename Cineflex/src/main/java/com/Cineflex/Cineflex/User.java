package com.Cineflex.Cineflex;

import com.Cineflex.Plan.Plan;

public interface User {
    void setUserDetails(String Name,int age, long contact, String address);
    void getUserDetails();
    Plan getUserPLan();
}
