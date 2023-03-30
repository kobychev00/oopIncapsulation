package Hogwarts;

public class Grifindor extends hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String name,
                     String surname,
                     int magicPower,
                     int transgrestionLength,
                     int nobility,
                     int honor,
                     int bravery) {
        super(name, surname, magicPower, transgrestionLength);
    }

    public void comparasionGrifindor() {

    }

    @Override
    public void printInfo() {
        System.out.println("name = " + getName());
        System.out.println("surname = " + getName());
        System.out.println("magicPower = " + getMagicPower());
        System.out.println("trangrestionLength = " + getTransgrestionLength());
        System.out.println("nobility = " + getNobility() );
        System.out.println("honor = " + getHonor());
        System.out.println("bravery = " + getBravery());
    }

    public void comprasionGrifindor() {

    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;

    }
    @Override
    public int ability() {
        return nobility + honor + bravery;
    }

    @Override
    public String tribleName() {
        return "гриффиндорец";
    }

    public void compareGrifindor(Grifindor grifindor) {
        compare(grifindor);
    }

}


