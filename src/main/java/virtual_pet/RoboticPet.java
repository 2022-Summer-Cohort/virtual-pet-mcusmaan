package virtual_pet;

public abstract class RoboticPet extends VirtualPet {
    protected int oilLevel;
    protected int maintenanceLevel;

    public int getOilLevel() {
        return oilLevel;
    }

    public int getmaintenanceLevel() {
        return maintenanceLevel;
    }

    public RoboticPet(String name, int oilLevel, int maintenanceLevel) {
        super(name,oilLevel,maintenanceLevel,boredemLevel,hungerLevel);
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
    }
        public void maintainRobots(){
            maintenanceLevel = 5;

    }
    public void oilRobots(){
        oilLevel = 5;
    }
}
