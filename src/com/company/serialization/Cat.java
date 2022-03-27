package com.company.serialization;

import java.io.Serializable;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 2:29 PM
 */
public class Cat implements  Serializable{
private static  final long serialVersionUID = 1L;
    private String name;
   private String color;
    public Cat(){}

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
