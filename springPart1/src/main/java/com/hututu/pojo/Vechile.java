package com.hututu.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Vechile {
    private String id;
    private String name;
    @Autowired
    @Resource(name="springCar")
    private Car car;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Vechile{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
