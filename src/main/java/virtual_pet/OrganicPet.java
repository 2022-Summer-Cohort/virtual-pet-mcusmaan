package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    protected int cleanliness;

    public OrganicPet(String name, int hungerLevel, int thirstLevel, int boerdemLevel, int cleanliness) {
        super(name, hungerLevel, thirstLevel, boerdemLevel);
        this.cleanliness = cleanliness;
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boerdemLevel = boerdemLevel;

    }

    public int getCleanliness() {
        return cleanliness;


    }

    public void CleanCage() {
        cleanliness = 5;

    }

    public void CleanLitterBox() {
        cleanliness = 5;
    }
}
