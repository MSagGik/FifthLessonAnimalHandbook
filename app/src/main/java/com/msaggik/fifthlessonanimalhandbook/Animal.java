package com.msaggik.fifthlessonanimalhandbook;

public class Animal {

    // поля сущности
    private String name; // поле названия животного
    private String animalDescription; // поле описания животного
    private int animalResource; // поле ресурса животного
    private String populationSize; // поле численности популяции

    // конструктор
    public Animal(String name, String animalDescription, int animalResource, String populationSize) {
        this.name = name;
        this.animalDescription = animalDescription;
        this.animalResource = animalResource;
        this.populationSize = populationSize;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    public int getAnimalResource() {
        return animalResource;
    }

    public void setAnimalResource(int animalResource) {
        this.animalResource = animalResource;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}
