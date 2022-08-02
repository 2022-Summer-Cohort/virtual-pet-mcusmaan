package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking{
    public OrganicDog(String name, int hungerLevel, int thirstLevel, int boerdemLevel, int cleanliness) {
        super(name, hungerLevel, thirstLevel, boerdemLevel, cleanliness);
    }
    @Override
    public void walk(){
        cleanliness++;
        boerdemLevel--;
    }
}
