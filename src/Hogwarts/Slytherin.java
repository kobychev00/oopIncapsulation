package Hogwarts;

import Hogwarts.hogwarts;

public class Slytherin extends hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,
                     String surname,
                     int magicPower,
                     int transgrestionLength,
                     int trick,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lustForPower) {
        super(name, surname, magicPower, transgrestionLength);
    }

    @Override
    public void printInfo() {
        System.out.println("name = " + getName());
        System.out.println("surname = " + getName());
        System.out.println("magicPower = " + getMagicPower());
        System.out.println("trangrestionLength = " + getTransgrestionLength());
        System.out.println("trick = " + trick);
        System.out.println("determination = " + determination);
        System.out.println("ambition = " + ambition);
        System.out.println("resourcefulness = " + resourcefulness);
        System.out.println("lustForPower = " + lustForPower);
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public int ability() {
        return trick + determination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String tribleName() {
        return "слизеренец";
    }

    public void compareSlytherin(Slytherin slytherin) {
        compare(slytherin);
    }
}
