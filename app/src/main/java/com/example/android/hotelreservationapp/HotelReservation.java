package com.example.android.hotelreservationapp;

public class HotelReservation {
    // attributes
    private int adults = 0;
    private int children = 0;
    private int rooms = 0;
    private String roomType = "";
    private String name = "";
    private String street = "";
    private String state = "";
    private String city = "";
    private String phone = "";
    private String eMail = "";


    // private and public methods
    private String checkIn(String str) {
        String checkInDate = str;
        return checkInDate;
    }

    private String checkOut(String str){
        String checkOutDate = str;
        return checkOutDate;
    }
    // Fix this opne later getter and setter
    public String setRoomType(){

        return "";
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return street;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String setPhone(){
        return phone;
    }

    public void setEmail(String email){
        this.eMail = email;
    }
    public String getEmail(){
        return eMail;
    }

    public HotelReservation(){

    }

    public String toString(){
        return "The number of adults: " + adults + "\n" + "The number of children: " + children + "\n" + "The Number of rooms: " + rooms + "\n" +
                "The room type: " + roomType + "\n" + "Name: " + name + "\n" +
                "Street: " + street + "\n" + "State: " + state + "\n" +
                "City: " + city + "\n" + "Phone: " + phone + "\n" + "Email: " + eMail;
    }
}
