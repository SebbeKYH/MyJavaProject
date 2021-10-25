import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner mainScan = new Scanner(System.in);

        //Introduction to the game and design
        welcomeToTheGame();

        //Time to choose starting point
        travelFrom();

        System.out.print(">");

        switch (mainScan.nextInt()){
            case 1:
                routeStart startMalmo = new routeStart("Malmö", 1000);
                System.out.println("You chose to start from "
                        +startMalmo.routeStart+".");
                break;
            case 2:
                routeStart startStockholm = new routeStart("Stockholm", 1000);
                System.out.println("You chose to start from "
                        +startStockholm.routeStart+".");
                break;
            case 3:
                routeStart startVasteras = new routeStart("Västerås", 1000);
                System.out.println("You chose to start from "
                        +startVasteras.routeStart+".");
                break;
            case 4:
                routeStart startMolndal = new routeStart("Mölndal", 1000);
                System.out.println("You chose to start from "
                        +startMolndal.routeStart+".");
                break;
            case 5:
                routeStart startKiruna = new routeStart("Kiruna", 1000);
                System.out.println("You chose to start from "
                        +startKiruna.routeStart+".");
                break;
            case 6:
                routeStart startSkara = new routeStart("Skara", 1000);
                System.out.println("You chose to start from "
                        +startSkara.routeStart+".");
                break;
            case 7:
                routeStart startLulea = new routeStart("Luleå", 1000);
                System.out.println("You chose to start from "
                        +startLulea.routeStart+".");
                break;
            case 8:
                routeStart startMaglehem = new routeStart("Maglehem", 1000);
                System.out.println("You chose to start from "
                        +startMaglehem.routeStart+".");
                break;
            case 9:
                routeStart startStehag = new routeStart("Stehag", 1000);
                System.out.println("You chose to start from "
                        +startStehag.routeStart+".");
                break;
            case 10:
                routeStart startEslov = new routeStart("Eslöv", 1000);
                System.out.println("You chose to start from "
                        +startEslov.routeStart+".");
                break;
        }
        //Choose destination
        travelTo();

        System.out.print(">");

        switch (mainScan.nextInt()){
            case 1:
                routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                System.out.println("You chose to travel to "
                        +destinationMalmo.routeDestination+".");
                break;
            case 2:
                routeDestination destinationStockholm = new routeDestination("Stockholm", 1000);
                System.out.println("You chose to travel to "
                        +destinationStockholm.routeDestination+".");
                break;
            case 3:
                routeDestination destinationVasteras = new routeDestination("Västerås", 1000);
                System.out.println("You chose to travel to "
                        +destinationVasteras.routeDestination+".");
                break;
            case 4:
                routeDestination destinationMolndal = new routeDestination("Mölndal", 1000);
                System.out.println("You chose to travel to "
                        +destinationMolndal.routeDestination+".");
                break;
            case 5:
                routeDestination destinationKiruna = new routeDestination("Kiruna", 1000);
                System.out.println("You chose to travel to "
                        +destinationKiruna.routeDestination+".");
                break;
            case 6:
                routeDestination destinationSkara = new routeDestination("Skara", 1000);
                System.out.println("You chose to travel to "
                        +destinationSkara.routeDestination+".");
                break;
            case 7:
                routeDestination destinationLulea = new routeDestination("Luleå", 1000);
                System.out.println("You chose to travel to "
                        +destinationLulea.routeDestination+".");
                break;
            case 8:
                routeDestination destinationMaglehem = new routeDestination("Maglehem", 1000);
                System.out.println("You chose to travel to "
                        +destinationMaglehem.routeDestination+".");
                break;
            case 9:
                routeDestination destinationStehag = new routeDestination("Stehag", 1000);
                System.out.println("You chose to travel to "
                        +destinationStehag.routeDestination+".");
                break;
            case 10:
                routeDestination destinationEslov = new routeDestination("Eslöv", 1000);
                System.out.println("You chose to travel to "
                        +destinationEslov.routeDestination+".");
                break;
        }
        System.out.println("Your choice of travel is between ");
    }

    private static void travelTo() {
        File welcomeFile = new File("./src/InformationFolder/routeDestination");
        try {
            Scanner destinationScanner = new Scanner(welcomeFile);
            while (destinationScanner.hasNextLine()) {
                System.out.println(destinationScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Trouble reading file");
        }
    }

    private static void travelFrom() {
        File welcomeFile = new File("./src/InformationFolder/routeStart");
        try {
            Scanner routeScanner = new Scanner(welcomeFile);
            while (routeScanner.hasNextLine()) {
                System.out.println(routeScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Trouble reading file");
        }
    }

    private static void welcomeToTheGame() {
        File welcomeFile = new File("./src/InformationFolder/welcomeText");
        try {
            Scanner welcomeScanner = new Scanner(welcomeFile);
            while (welcomeScanner.hasNextLine()) {
                System.out.println(welcomeScanner.nextLine());
            }
        }
            catch(FileNotFoundException e){
                System.out.println("Trouble reading file");
            }
    }
}
