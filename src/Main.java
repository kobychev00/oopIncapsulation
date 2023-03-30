import Hogwarts.Grifindor;
import Hogwarts.Ravenclaw;
import Hogwarts.Slytherin;
import Hogwarts.hufflepuff;

public class Main {
    public static void main(String[] args) {

        Grifindor harryPotter = new Grifindor("Harry",
                "Potter",
                98,
                99,
                99,
                99,
                99);

        Grifindor hermioneGrandger = new Grifindor("Hermione",
                "Grandger",
                95,
                95,
                98,
                97,
                96);

        Grifindor ronWeasley = new Grifindor("Ron",
                "Weasley",
                85,
                90,
                94,
                96,
                80);

        Slytherin dracoMalfoy = new Slytherin("Draco",
                "Malfoy",
                82,
                85,
                96,
                78,
                76,
                74,
                86);
        Slytherin grahamMontague = new Slytherin("Graham",
                "Motague",
                69,
                70,
                67,
                66,
                69,
                65,
                59);
        Slytherin gregoryGoyle = new Slytherin("Gregory",
                "Goyle",
                69,
                60,
                45,
                56,
                67,
                65,
                55);
        hufflepuff zachriasSmith = new hufflepuff("Zacarias",
                "Smith",
                71,
                78,
                80,
                77,
                76);
        hufflepuff cedricDiggory = new hufflepuff("Cedric",
                "Diggory",
                84,
                82,
                88,
                83,
                88);
        hufflepuff justinFinchFletchery = new hufflepuff("Justin",
                "Fletchery",
                75,
                74,
                77,
                69,
                70);
        Ravenclaw choChang = new Ravenclaw("Cho",
                "Chang",
                78,
                74,
                73,
                79,
                80);
        Ravenclaw padmaPatil = new Ravenclaw("Padma",
                "Patil",
                84,
                83,
                88,
                90,
                91);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus",
                "Belby",
                69,
                70,
                70,
                73,
                74);

        marcusBelby.compareRavenclaw(padmaPatil);
        marcusBelby.printInfo();

    }

}