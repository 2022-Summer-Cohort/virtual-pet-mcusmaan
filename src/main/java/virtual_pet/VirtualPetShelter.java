package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;


    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog(" John", 8, 5));
        shelter.add(new RoboticCat(" Ruth", 6, 9));
        shelter.add(new OrganicDog(" Sam", 3, 2, 4, 4));
        shelter.add(new OrganicCat("Teddy", 2, 7, 8,2));


    }

    public void adoptPet(String name) {
        shelter.remove(findPetByName(name));
    }


    public void admitPet(VirtualPet Pet) {
        shelter.add(Pet);

    }

    public void showAllPetStatus() {
        for (VirtualPet pet : shelter) {
            pet.greeting();
        }
    }

    public void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }

    }

    public void waterAll() {
        for (VirtualPet pet : shelter) {
            pet.thirst();
        }
    }

    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.boredom();

        }

    }

    public void tick() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }

    public VirtualPet getPet(int index) {
        return shelter.get(index);
    }

    public VirtualPet findPetByName(String name) {
        for (VirtualPet pet : shelter) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }


    public void walk() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof Walking) {
                ((Walking) pet).walk();
            }


        }
    }

    public void MaintainRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).MaintainRobots();
            }
        }
    }

    public void oilRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilRobots();
            }
        }
    }

    public void CleanCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).CleanCage();
            }


        }

    }

    public void CleanLitterBox() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).CleanLitterBox();
            }

        }

    }
}

