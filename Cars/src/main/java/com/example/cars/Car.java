package com.example.cars;

public class Car {  private String year;
    private String name;
    private String color;
    public  Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;}
    public String getName() {return name;}
    public String getYear() {return year; }
    public String getColor() {return color; }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
}}
