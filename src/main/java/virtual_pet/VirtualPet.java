package virtual_pet;

public abstract class VirtualPet {
    protected String name;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredemLevel;

    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredemLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredemLevel = boredemLevel;
    }



    public void feed() {
        hungerLevel = 0;

    }

    public void water() {
        thirstLevel = 0;
    }

    public void play() {
        boredemLevel = 0;
    }

    public void status() {
//Fido- hunger:5 thirst:5 boredem:5
        System.out.println(name + "- hunger:" + hungerLevel + "thirst:" + thirstLevel + "bore" +
                "dem" + boredemLevel);
    }

    public void tick() {
        hungerLevel = hungerLevel + 2;
        thirstLevel += 2;
        boredemLevel += 2;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredemLevel() {
        return boredemLevel;
    }

    public void greeting() {

    }

    public void thirst() {
    }

    public void boredom() {
    }
}