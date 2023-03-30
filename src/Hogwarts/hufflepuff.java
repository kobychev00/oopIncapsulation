package Hogwarts;

public class hufflepuff extends hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public hufflepuff(String name,
                      String surname,
                      int magicPower,
                      int transgrestionLength,
                      int industriousness,
                      int loyalty,
                      int honesty) {
        super(name, surname, magicPower, transgrestionLength);
    }

    @Override
    public void printInfo() {
        System.out.println("name = " + getName());
        System.out.println("surname = " + getName());
        System.out.println("magicPower = " + getMagicPower());
        System.out.println("trangrestionLength = " + getTransgrestionLength());
        System.out.println("industriousness = " + industriousness);
        System.out.println("loyalty = " + loyalty);
        System.out.println("honesty = " + honesty);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public int ability() {
        return industriousness + loyalty + honesty;
    }

    @Override
    public String tribleName() {
        return "пуффендуец";
    }

    public void compareHufflepuff(hufflepuff hufflepuff) {

        compare(hufflepuff);
    }
}

