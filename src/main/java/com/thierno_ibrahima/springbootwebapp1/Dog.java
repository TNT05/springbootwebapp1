/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.thierno_ibrahima.springbootwebapp1;


class Dog {
private int dogId;
private String dogName;
private String dogBreed;

    public Dog(String dogBreed, int dogId, String dogName) {
        this.dogBreed = dogBreed;
        this.dogId = dogId;
        this.dogName = dogName;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getBreed() {
        return dogBreed;
    }

    public void setBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dog{");
        sb.append("dogId=").append(dogId);
        sb.append(", dogName=").append(dogName);
        sb.append(", dogBreed=").append(dogBreed);
        sb.append('}');
        return sb.toString();
    }
}
