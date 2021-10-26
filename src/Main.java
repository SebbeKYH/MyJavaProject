import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        //Scanner mainScan = new Scanner(System.in);

        //Introduction to the game and design
        welcomeToTheGame();

        //Time to choose starting point
        travelFrom();

        Scanner fromScan = new Scanner(System.in);
        System.out.print(">");

        switch (fromScan.nextInt()) {
            case 1:
                routeStart startMalmo = new routeStart("Malmö", 1000);
                System.out.println("You chose to start from "
                        + startMalmo.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case1scan = new Scanner(System.in);
                System.out.print(">");

                switch (case1scan.nextInt()) {
                    case 1:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String malmoStockholm= startMalmo.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(malmoStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner case1transportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (case1transportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String malmoVasteras= startMalmo.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(malmoVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String malmoMolndal= startMalmo.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(malmoMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String malmoKiruna= startMalmo.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(malmoKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String malmoSkara= startMalmo.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(malmoSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String malmoLulea= startMalmo.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(malmoLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String malmoMaglehem= startMalmo.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(malmoMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String malmoStehag= startMalmo.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(malmoStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String malmoEslov= startMalmo.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(malmoEslov);
                        break;
                }
                break;
            case 2:
                routeStart startStockholm = new routeStart("Stockholm", 1000);
                System.out.println("You chose to start from "
                        + startStockholm.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case2scan = new Scanner(System.in);
                System.out.print(">");

                switch (case2scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmMalmo= startStockholm.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(stockholmMalmo);
                        break;
                    case 2:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmVasteras= startStockholm.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(stockholmVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmMolndal= startStockholm.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(stockholmMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmKiruna= startStockholm.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(stockholmKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmSkara= startStockholm.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(stockholmSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmLulea= startStockholm.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(stockholmLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmMaglehem= startStockholm.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(stockholmMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmStehag= startStockholm.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(stockholmStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmEslov= startStockholm.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(stockholmEslov);
                        break;
                }
                break;
            case 3:
                routeStart startVasteras = new routeStart("Västerås", 1000);
                System.out.println("You chose to start from "
                        + startVasteras.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case3scan = new Scanner(System.in);
                System.out.print(">");

                switch (case3scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasMalmo= startVasteras.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(vasterasMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasStockholm= startVasteras.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(vasterasStockholm);
                        break;
                    case 3:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasMolndal= startVasteras.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(vasterasMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasKiruna= startVasteras.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(vasterasKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasSkara= startVasteras.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(vasterasSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasLulea= startVasteras.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(vasterasLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasMaglehem= startVasteras.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(vasterasMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasStehag= startVasteras.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(vasterasStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasEslov= startVasteras.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(vasterasEslov);
                        break;
                }
                break;
            case 4:
                routeStart startMolndal = new routeStart("Mölndal", 1000);
                System.out.println("You chose to start from "
                        + startMolndal.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case4scan = new Scanner(System.in);
                System.out.print(">");

                switch (case4scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String molndalMalmo= startMolndal.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(molndalMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String molndalStockholm= startMolndal.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(molndalStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String molndalVasteras= startMolndal.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(molndalVasteras);
                        break;
                    case 4:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String molndalKiruna= startMolndal.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(molndalKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String molndalSkara= startMolndal.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(molndalSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String molndalLulea= startMolndal.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(molndalLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String molndalMaglehem= startMolndal.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(molndalMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String molndalStehag= startMolndal.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(molndalStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String molndalEslov= startMolndal.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(molndalEslov);
                        break;
                }
                break;
            case 5:
                routeStart startKiruna = new routeStart("Kiruna", 1000);
                System.out.println("You chose to start from "
                        + startKiruna.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case5scan = new Scanner(System.in);
                System.out.print(">");

                switch (case5scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaMalmo= startKiruna.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(kirunaMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaStockholm= startKiruna.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(kirunaStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaVasteras= startKiruna.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(kirunaVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaMolndal= startKiruna.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(kirunaMolndal);
                        break;
                    case 5:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaSkara= startKiruna.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(kirunaSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaLulea= startKiruna.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(kirunaLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaMaglehem= startKiruna.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(kirunaMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaStehag= startKiruna.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(kirunaStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaEslov= startKiruna.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(kirunaEslov);
                        break;
                }
                break;
            case 6:
                routeStart startSkara = new routeStart("Skara", 1000);
                System.out.println("You chose to start from "
                        + startSkara.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case6scan = new Scanner(System.in);
                System.out.print(">");

                switch (case6scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String skaraMalmo= startSkara.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(skaraMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String skaraStockholm= startSkara.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(skaraStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String skaraVasteras= startSkara.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(skaraVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String skaraMolndal= startSkara.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(skaraMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String skaraKiruna= startSkara.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(skaraKiruna);
                        break;
                    case 6:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String skaraLulea= startSkara.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(skaraLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String skaraMaglehem= startSkara.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(skaraMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String skaraStehag= startSkara.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(skaraStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String skaraEslov= startSkara.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(skaraEslov);
                        break;
                }
                break;
            case 7:
                routeStart startLulea = new routeStart("Luleå", 1000);
                System.out.println("You chose to start from "
                        + startLulea.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case7scan = new Scanner(System.in);
                System.out.print(">");

                switch (case7scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String luleaMalmo= startLulea.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(luleaMalmo);

                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String luleaStockholm= startLulea.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(luleaStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String luleaVasteras= startLulea.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(luleaVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String luleaMolndal= startLulea.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(luleaMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String luleaKiruna= startLulea.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(luleaKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String luleaSkara= startLulea.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(luleaSkara);
                        break;
                    case 7:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String luleaMaglehem= startLulea.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(luleaMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String luleaStehag= startLulea.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(luleaStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String luleaEslov= startLulea.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(luleaEslov);
                        break;
                }
                break;
            case 8:
                routeStart startMaglehem = new routeStart("Maglehem", 1000);
                System.out.println("You chose to start from "
                        + startMaglehem.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case8scan = new Scanner(System.in);
                System.out.print(">");

                switch (case8scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemMalmo= startMaglehem.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(maglehemMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemStockholm= startMaglehem.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(maglehemStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemVasteras= startMaglehem.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(maglehemVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemMolndal= startMaglehem.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(maglehemMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemKiruna= startMaglehem.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(maglehemKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemSkara= startMaglehem.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(maglehemSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemLulea= startMaglehem.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(maglehemLulea);
                        break;
                    case 8:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemStehag= startMaglehem.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(maglehemStehag);
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemEslov= startMaglehem.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(maglehemEslov);
                        break;
                }
                break;
            case 9:
                routeStart startStehag = new routeStart("Stehag", 1000);
                System.out.println("You chose to start from "
                        + startStehag.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case9scan = new Scanner(System.in);
                System.out.print(">");

                switch (case9scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String stehagMalmo= startStehag.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(stehagMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String stehagStockholm= startStehag.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(stehagStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String stehagVasteras= startStehag.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(stehagVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String stehagMolndal= startStehag.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(stehagMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String stehagKiruna= startStehag.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(stehagKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String stehagSkara= startStehag.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(stehagSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String stehagLulea= startStehag.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(stehagLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String stehagMaglehem= startStehag.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(stehagMaglehem);
                        break;
                    case 9:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String stehagEslov= startStehag.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(stehagEslov);
                        break;
                }
                break;
            case 10:
                routeStart startEslov = new routeStart("Eslöv", 1000);
                System.out.println("You chose to start from "
                        + startEslov.routeStart + ".");
                //Destination
                System.out.println("Choose where you want to go.");
                Scanner case10scan = new Scanner(System.in);
                System.out.print(">");

                switch (case10scan.nextInt()) {
                    case 1:
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        System.out.println("\n");
                        String eslovMalmo= startEslov.routeStart +"----->"
                                +destinationMalmo.routeDestination;
                        System.out.println(eslovMalmo);
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String eslovStockholm= startEslov.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(eslovStockholm);
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        System.out.println("\n");
                        String eslovVasteras= startEslov.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(eslovVasteras);
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String eslovMolndal= startEslov.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(eslovMolndal);
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String eslovKiruna= startEslov.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(eslovKiruna);
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String eslovSkara= startEslov.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(eslovSkara);
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String eslovLulea= startEslov.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(eslovLulea);
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String eslovMaglehem= startEslov.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(eslovMaglehem);
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String eslovStehag= startEslov.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(eslovStehag);
                        break;
                    case 10:
                        System.out.println("You cant have the same destination as starting point.");
                        break;
                }
                break;
        }
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
