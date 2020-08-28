package com.example.inputoutput;

public class Name {
    String userName;

    public Name(String userName) {
        this.userName = userName;
    }

    public Name() {
        userName = "";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String randomTerm(){
        int randomInt = (int)(Math.random() * 4 + 1);
        if(randomInt == 1){
            return ". Welcome to Earth!";
        }
        else if(randomInt == 2){
            return ". Welcome to Mars!";
        }
        else if(randomInt == 3){
            return ". Welcome to Pluto!";
        }
        return ". Welcome to the Moon!";
    }
}
