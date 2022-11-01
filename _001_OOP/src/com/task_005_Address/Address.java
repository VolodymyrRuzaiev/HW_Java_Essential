package com.task_005_Address;

// pattern
public class Address {
    // fields
    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex() {
        return this.index;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }

    public void setHouse(int house) {
        this.house = house;
    }
    public int getHouse(){
        return this.house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
    public int getApartment(){
        return this.apartment;
    }
}
