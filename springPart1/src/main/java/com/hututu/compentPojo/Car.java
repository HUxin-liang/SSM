package com.hututu.compentPojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("springCar")
public class Car {
    private String id;
    @Value("byd")
    private String name;

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

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
