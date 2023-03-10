package com.epam_lab.task2_basic;

public class Subject {
    private String name;
    private Material material;
    private double volume;

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass(Material material) {
        return material.getDensity() * volume;
    }


    @Override
    public String toString() {

        return String.format("%s;%s,%f,%f", name, material, volume, getMass(material));
    }
}
