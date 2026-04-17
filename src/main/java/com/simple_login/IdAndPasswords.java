package com.simple_login;

import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String, String> loginInfo =new HashMap<>();

    public IdAndPasswords(){
        // Default users (Replace with DB logic later)
        loginInfo.put("imane", "dev2026");
        loginInfo.put("user", "1234");
        loginInfo.put("admin", "admin");
        loginInfo.put("dev", "dev");
        loginInfo.put("user", "1234");
    }
    
    protected HashMap <String, String> getLoginInfo (){
        return loginInfo;
    }
    
}
