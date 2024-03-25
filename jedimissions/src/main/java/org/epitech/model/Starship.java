package org.epitech.model;

import java.util.UUID;

public abstract class Starship implements Entity {
    protected String name;
    protected int capacity;
    protected UUID id;
    protected int speed;

    public Starship(String name, int capacity, UUID id, int speed) {
        this.name = name;
        this.capacity = capacity;
        this.id = id;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
