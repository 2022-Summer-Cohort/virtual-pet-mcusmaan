package virtual_pet;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
    public class VirtualPetTest {
        private  VirtualPet underTest = new RoboticDog("John", 5, 5);




        @Test
        void shouldFeedAllPets() {
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.feedAll();
            assertEquals(-5, underTest.getPet(0).getHungerLevel());

        }

        @Test
        void shouldWaterAllPets() {
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.waterAll();
            assertEquals(-3, underTest.getPet(0).getThirstLevel());
        }

        @Test
        void shouldPlayAllPets() {
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.playAll();
            assertEquals(-4, underTest.getPet(0).getBoredomLevel());
        }

        @Test
        void shouldOilRobotsWhenOiled() {
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.oilRobots();
            assertEquals(3, ((RoboticPet) underTest.getPet(0)).getOilLevel());
        }

        @Test
        void shouldMaintainRobots() {
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.MaintainRobots();
            assertEquals(1, ((RoboticPet) underTest.getPet(0)).getMaintenanceLevel());
        }

        @Test
        void shouldCleanCage(){
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.CleanCage();
            assertEquals(5,((OrganicDog)underTest.getPet(2)).getCleanliness());
        }
    }

