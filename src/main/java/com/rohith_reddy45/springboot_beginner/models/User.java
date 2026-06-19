package com.rohith_reddy45.springboot_beginner.models;

public class User{
    //id
    //name
    //name
    //image
    private int id;
    private String name;
    private String gender;
    private String image;
    //default constructor
    public User(){

    }
    //parameterised constructor
    public User(int id,String name,String gender,String image){
        this.id = id;
        this.name=name;
        this.gender=gender;
        this.image=image;

    }
    //getters and setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
    return gender;
}
    public String getImage(){
    return image;
}
    public void setName(String name){
    this.name=name;
}
    public void setGender(String gender){
    this.gender=gender;
}
    public void setImage(String image){
    this.image=image;
}
    }