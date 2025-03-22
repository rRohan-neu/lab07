/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Rohan
 */
public class User {
    private int userId;
    private String name;
    private int age;
    private String college;
    private String hobbies;
    private String email;
    private String gender;
    private ImageIcon photo;
    private String lastName;

    // Constructor
     public User() {
    }
     
    public User(int userId, String firstName, String lastName, int age, String college, String hobbies) {
        this.userId = userId;
        this.name = firstName;
        this.lastName = lastName;
        this.age = age;
        this.college = college;
        this.hobbies = hobbies;
    }

    public String getlastName() {
        return lastName;
    }

    // Getters and Setters
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    // toString method for debugging and display
    @Override
    public String toString() {
        return "User ID: " + userId + "\n" +
               "Name: " + name + " " +  "\n" +
               "Age: " + age + "\n" +
               "College: " + college    ;
    }
}

