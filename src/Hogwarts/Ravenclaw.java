package Hogwarts;

import Hogwarts.hogwarts;

public class Ravenclaw extends hogwarts {
    private int mind;
    private int wisdom;
    private int art;

    public Ravenclaw(String name,
                     String surname,
                     int magicPower,
                     int transgrestionLength,
                     int mind,
                     int wisdom,
                     int art) {
        super(name, surname, magicPower, transgrestionLength);
        this.mind = mind;
        this.wisdom = wisdom;
        this.art = art;
    }

    @Override
    public void printInfo() {
        System.out.println("name = " + getName());
        System.out.println("surname = " + getSurname());
        System.out.println("magicPower = " + getMagicPower());
        System.out.println("trangrestionLength = " + getTransgrestionLength());
        System.out.println("mind = " + mind);
        System.out.println("wisdom = " + wisdom);
        System.out.println("art = " + art);
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }
    @Override
    public int ability() {
        return mind + wisdom + art;
    }

    @Override
    public String tribleName() {
        return "когтевранец";
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        compare(ravenclaw);
    }
}
