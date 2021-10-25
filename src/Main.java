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
                        routeDestination destinationMalmo = new routeDestination("Malmö", 50);
                        System.out.println("You chose to travel to "
                                + destinationMalmo.routeDestination + ".");
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        break;
                    case 3:
                        routeDestination destinationVasteras = new routeDestination("Västerås", 150);
                        System.out.println("You chose to travel to "
                                + destinationVasteras.routeDestination + ".");
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
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
