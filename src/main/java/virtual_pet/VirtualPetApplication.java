package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        VirtualPetShelter shelter = new VirtualPetShelter();

        Scanner input = new Scanner(System.in);


        System.out.println("Hello user welcome to virtual pet");
        String action = "";
        while (!action.equalsIgnoreCase("quit")) {
            shelter.showAllPetStatus();
            System.out.println("Enter action: Feed,Play,Water,Oil,CleanCage,CleanLitterBox,MaintainRobots,Quit");
            action = input.nextLine();
            if (action.equalsIgnoreCase("feed")) {
                shelter.feedAll();
            } else if (action.equalsIgnoreCase("water")) {
                shelter.waterAll();
            } else if (action.equalsIgnoreCase("play")) {
                shelter.playAll();
            } else if (action.equalsIgnoreCase("Oil")) {
                shelter.oilRobots();
            } else if (action.equalsIgnoreCase("CleanCage")) {
                shelter.CleanCage();
            } else if (action.equalsIgnoreCase("CleanLitterBox")) {
                shelter.CleanLitterBox();
            } else if (action.equalsIgnoreCase("MaintainRobots")) {
                shelter.maintainRobots();
            } else if (action.equalsIgnoreCase("Walk")) {
                    shelter.walk();
            } else {
                System.out.println("Invalid selection");
            }
            shelter.tick();
        }

    }
    }


