package com.hututu.compentPojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("springVehicle")
public class Vechile {
    private String id;
    private String name="yinchuan";
    @Autowired
    //@Resource(name="springCar")
    private Car car;

    /* @PostConstruct
    public void post(){
        System.out.println("bean初始化后，执行。。");
    }*/

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
