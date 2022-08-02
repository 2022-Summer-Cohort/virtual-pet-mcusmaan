package virtual_pet;

public class RoboticDog extends RoboticPet implements Walking{
    public RoboticDog(String name, int oilLevel, int maintenanceLevel) {
        super(name, oilLevel, maintenanceLevel);
    }
    @Override
    public void walk(){
        boredemLevel--;
        maintenanceLevel++;
        oilLevel++;
    }
}
