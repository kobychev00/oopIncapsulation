package Hogwarts;

public abstract class hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int transgrestionLength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgrestionLength() {
        return transgrestionLength;
    }

    public void setTransgrestionLength(int transgrestionLength) {
        this.transgrestionLength = transgrestionLength;
    }

    public hogwarts(String name,
                    String surname,
                    int magicPower,
                    int transgrestionLength) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgrestionLength = transgrestionLength;
    }

    public void printInfo() {
        System.out.println("name = " + getName());
        System.out.println("surname = " + getSurname());
        System.out.println("magicPower = " + getMagicPower());
        System.out.println("trangrestionLength = " + getTransgrestionLength());
    }

    private int baseAbility (){
        return magicPower + transgrestionLength;
    }

    public abstract int ability();

    public abstract String tribleName();
    
    private void compareHogwarts(hogwarts hogwarts) {
        int ability1 = baseAbility();
        int ability2 = hogwarts.baseAbility();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", 
                    getName(), 
                    hogwarts.getSurname(),
                    ability1, 
                    ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwarts.getSurname(),
                    getName(), 
                    ability2, 
                    ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    hogwarts.getSurname(),
                    getName(), 
                    ability2, 
                    ability1);
        }
    }

    void compare(hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("%s %s лучше, чем %s %s: %d VS %d%n", 
                    tribleName(), 
                    getSurname(),
                    tribleName(),
                    hogwarts.getSurname(),
                    ability1, 
                    ability2);
        } else if (ability2 > ability1) {
            System.out.printf("%s %s лучше, чем %s %s: %d VS %d%n",
                    tribleName(),
                    hogwarts.getSurname(),
                    tribleName(),
                    getSurname(),
                    ability2, 
                    ability1);
        } else {
            System.out.printf("%s %s такой же, как %s %s: %d VS %d%n",
                    tribleName(),
                    hogwarts.getSurname(),
                    tribleName(),
                    getSurname(),
                    ability2, 
                    ability1);
        }
    }
}
