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
    private String checkIN = "";
    private String checkOUT = "";


    // private and public methods
    public void setCheckIn(String checkIn) {
        this.checkIN = checkIn;
    }
    public String getCheckIN(){
        return checkIN;
    }

    public void setCheckOut(String checkOut){
        this.checkOUT = checkOut;
    }
    public String getCheckOut(){
        return checkOUT;
    }
    // Fix this opne later getter and setter
    public String getRoomType(){

        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
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

    public void setAdults(int adults){
        this.adults = adults;
    }
    public int getAdults(){
        return adults;
    }

    public void setChildren(int children){
        this.children = children;
    }
    public int getChildren(){
        return children;
    }

    public void setRoom(int room){
        this.rooms = room;
    }
    public int getRoom(){
        return rooms;
    }

    public HotelReservation(){

    }

    public String toString(){
        return "The number of adults: " + adults + "\n" + "The number of children: " + children + "\n" + "The Number of rooms: " + rooms + "\n" +
                "Check-in: " + checkIN + "\n" + "Check-out: " + checkOUT + "\n" +
                "The room type: " + roomType + "\n" + "Name: " + name + "\n" +
                "Street: " + street + "\n" + "State: " + state + "\n" +
                "City: " + city + "\n" + "Phone: " + phone + "\n" + "Email: " + eMail;
    }
}
