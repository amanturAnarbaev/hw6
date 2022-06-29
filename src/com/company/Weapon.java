package com.company;

public class Weapon {
    private String typeOfWeapon;
    private String nameOfWeapon;

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public Weapon (String typeOfWeapon, String nameOfWeapon){
        this.setNameOfWeapon(nameOfWeapon);
        this.setTypeOfWeapon(typeOfWeapon);
    }
    public String printingData(){
        return "weapon's name is "+ this.nameOfWeapon+"  type of weapon is  "+this.typeOfWeapon;
    }


    /*public Object getInfo(){
        return */
    }

