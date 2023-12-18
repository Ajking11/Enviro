package com.example.ecommerce.Prevalent;

import com.example.ecommerce.Model.Users;

public class Prevalent
{
    public static Users currentOnlineUser;


    public static final String UserPhoneKey = "UserPhone";
    public static final String UserPasswordKey = "UserPassword";

    public static String getVinId() {
        if (currentOnlineUser != null) {
            return currentOnlineUser.getVinId();
        }
        return null;
    }
}

