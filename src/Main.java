import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        // Disclaimer. All comments for code is in starting point 10 (case10). The code is the same for all other
        // cases

            //Introduction to the game and output design
            welcomeToTheGame();

            //Displays travel options from textFile
            travelFrom();

            //Make choices for travel
            makingChoices();
    }

    public static void makingChoices() {
        //Create scanner object for passengers used later in code.
        Scanner passengers = new Scanner (System.in);

        //Choosing starting point for travellers
        chooseStartingPoint(passengers);
    }

    public static void chooseStartingPoint(Scanner passengers) {
        //Creating scanner object for choosing starting point with integer numbers for switch case
        Scanner fromScan = new Scanner(System.in);
        // Enter integer to choose case
        System.out.print(">");

        switch (fromScan.nextInt()) {
            case 1:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startMalmo = new routeStarter("Malmö", 1000);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startMalmo.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case1scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case1Destinations(passengers, startMalmo, case1scan);
                break;
            case 2:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startStockholm = new routeStarter("Stockholm", 1100);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startStockholm.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case2scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case2Destinations(passengers, startStockholm, case2scan);
                break;
            case 3:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startVasteras = new routeStarter("Västerås", 1200);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startVasteras.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case3scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case3Destinations(passengers, startVasteras, case3scan);
                break;
            case 4:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startMolndal = new routeStarter("Mölndal", 1300);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startMolndal.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case4scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case4Destinations(passengers, startMolndal, case4scan);
                break;
            case 5:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startKiruna = new routeStarter("Kiruna", 1400);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startKiruna.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case5scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case5Destinations(passengers, startKiruna, case5scan);
                break;
            case 6:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startSkara = new routeStarter("Skara", 1500);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startSkara.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case6scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case6Destinations(passengers, startSkara, case6scan);
                break;
            case 7:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startLulea = new routeStarter("Luleå", 1600);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startLulea.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case7scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case7Destinations(passengers, startLulea, case7scan);
                break;
            case 8:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startMaglehem = new routeStarter("Maglehem", 1700);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startMaglehem.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case8scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case8Destinations(passengers, startMaglehem, case8scan);
                break;
            case 9:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startStehag = new routeStarter("Stehag", 1800);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startStehag.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case9scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case9Destinations(passengers, startStehag, case9scan);
                break;
            case 10:
                // Create new object from class routeStar. It gets an initial cost used later to determine the
                // cost for travel between different destinations
                routeStarter startEslov = new routeStarter("Eslöv", 1900);
                //Informs the user of what starting point has been chosen
                System.out.println("You chose to start from "
                        + startEslov.routeStart + ".");

                //Create a new scanner object for choice of end destination trough switch case
                System.out.println("Choose where you want to go.");
                Scanner case10scan = new Scanner(System.in);
                System.out.print(">");

                // Switch cases for destination...
                case10Destinations(passengers, startEslov, case10scan);
                break;
        }
    }

    public static void case10Destinations(Scanner passengers, routeStarter startEslov, Scanner case10scan) {
        switch (case10scan.nextInt()) {
            case 1:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination1(passengers, startEslov);
                break;
            case 2:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination2(passengers, startEslov);
                break;
            case 3:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination3(passengers, startEslov);
                break;
            case 4:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination4(passengers, startEslov);
                break;
            case 5:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination5(passengers, startEslov);
                break;
            case 6:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination6(passengers, startEslov);
                break;
            case 7:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination7(passengers, startEslov);
                break;
            case 8:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination8(passengers, startEslov);
                break;
            case 9:
                //Switch cases for different destination with starting point at Eslöv
                case10Destination9(passengers, startEslov);
                break;
            case 10:
                // You cant choose the same destination as starting point
                System.out.println("You cant have the same destination as starting point.");
                break;
        }
    }

    public static void case10Destination9(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovStehag= startEslov.routeStart +"----->"
                +destinationStehag.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovStehagCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovStehagCost);
                System.out.println(totalCost);

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;

            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovStehagCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovStehagCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination8(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovMaglehem= startEslov.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovMaglehemCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovMaglehemCost);
                System.out.println(totalCost);

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovMaglehemCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovMaglehemCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination7(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovLulea= startEslov.routeStart +"----->"
                +destinationLulea.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovLuleaCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovLuleaCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovLuleaCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination6(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovSkara= startEslov.routeStart +"----->"
                +destinationSkara.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovSkaraCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovSkaraCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovSkaraCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination5(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovKiruna= startEslov.routeStart +"----->"
                +destinationKiruna.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovKirunaCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovKirunaCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovKirunaCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination4(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovMolndal= startEslov.routeStart +"----->"
                +destinationMolndal.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovMolndalCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovMolndalCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovMolndalCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination3(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovVasteras= startEslov.routeStart +"----->"
                +destinationVasteras.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovVasterasCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovVasterasCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovVasterasCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination2(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovStockholm= startEslov.routeStart +"----->"
                +destinationStockholm.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovStockholmCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovStockholmCost);
                System.out.println("Your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovStockholmCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovStockholmCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case10Destination1(Scanner passengers, routeStarter startEslov) {
        // Create an object from routeDestination class. It gets a destination cost that can be used to calculate
        // the cost of a route.
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        // Informs the user of the chosen destination
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        // Creates string variable that contains the route from start to destination.
        String eslovMalmo= startEslov.routeStart +"----->"
                +destinationMalmo.routeDestination;
        // Informs the user of the selected route
        System.out.println(eslovMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                // Informs the user of what kind of transportation was chosen. In this case the train
                System.out.println("You chose to go by train");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by train + destination cost).
                int eslovMalmoCost=(startEslov.startCost-(train.transportCost + train.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int totalCost = (passengers.nextInt()*eslovMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                // Informs the user of what kind of transportation was chosen. In this case the bus
                System.out.println("You chose to go by bus");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by bus + destination cost).
                int buseslovMalmoCost=(startEslov.startCost-(bus.transportCost + bus.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int bustotalCost = (passengers.nextInt()*buseslovMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                // Informs the user of what kind of transportation was chosen. In this case the helicopter
                System.out.println("You chose to go by helicopter");
                // A new route object is created from routeTransport class since
                // we know the starting point and destination. In it the kind of transportation is also given
                // a cost to be able to calculate different cost for different transport alternatives.
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                // Create integer variable for the route cost in relation till transport alternative.
                // It is calculated by taking the starting cost -(cost of going by helicopter + destination cost).
                int helicoptereslovMalmoCost=(startEslov.startCost-(helicopter.transportCost + helicopter.destinationCost));
                // Ask the user how many passengers are traveling
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                // Total cost for transport alternative on that route is multiplied with number of passengers
                // and gives to total cost which is printed
                int helicoptertotalCost = (passengers.nextInt()*helicoptereslovMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destinations(Scanner passengers, routeStarter startStehag, Scanner case9scan) {
        switch (case9scan.nextInt()) {
            case 1:
                case9Destination1(passengers, startStehag);
                break;
            case 2:
                case9Destination2(passengers, startStehag);
                break;
            case 3:
                case9Destination3(passengers, startStehag);
                break;
            case 4:
                case9Destination4(passengers, startStehag);
                break;
            case 5:
                case9Destination5(passengers, startStehag);
                break;
            case 6:
                case9Destination6(passengers, startStehag);
                break;
            case 7:
                case9Destination7(passengers, startStehag);
                break;
            case 8:
                case9Destination8(passengers, startStehag);
                break;
            case 9:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 10:
                case9Destination10(passengers, startStehag);
                break;
        }
    }

    public static void case9Destination10(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String stehagEslov= startStehag.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(stehagEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int stehagEslovCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busstehagEslovCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicopterstehagEslovCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination8(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String stehagMaglehem= startStehag.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(stehagMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int stehagMaglehemCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busstehagMaglehemCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicopterstehagMaglehemCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination7(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String stehagLulea= startStehag.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(stehagLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int stehagLuleaCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int busstehagLuleaCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicopterstehagLuleaCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination6(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String stehagSkara= startStehag.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(stehagSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int stehagSkaraCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busstehagSkaraCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicopterstehagSkaraCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination5(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String stehagKiruna= startStehag.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(stehagKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int stehagKirunaCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busstehagKirunaCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicopterstehagKirunaCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination4(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String stehagMolndal= startStehag.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(stehagMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int stehagMolndalCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busstehagMolndalCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicopterstehagMolndalCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination3(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String stehagVasteras= startStehag.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(stehagVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int stehagVasterasCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busstehagVasterasCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicopterstehagVasterasCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination2(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String stehagStockholm= startStehag.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(stehagStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int stehagStockholmCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int busstehagStockholmCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicopterstehagStockholmCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case9Destination1(Scanner passengers, routeStarter startStehag) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String stehagMalmo= startStehag.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(stehagMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int stehagMalmoCost=(startStehag.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stehagMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busstehagMalmoCost=(startStehag.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstehagMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicopterstehagMalmoCost=(startStehag.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstehagMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destinations(Scanner passengers, routeStarter startMaglehem, Scanner case8scan) {
        switch (case8scan.nextInt()) {
            case 1:
                case8Destination1(passengers, startMaglehem);
                break;
            case 2:
                case8Destination2(passengers, startMaglehem);
                break;
            case 3:
                case8Destination3(passengers, startMaglehem);
                break;
            case 4:
                case8Destination4(passengers, startMaglehem);
                break;
            case 5:
                case8Destination5(passengers, startMaglehem);
                break;
            case 6:
                case8Destination6(passengers, startMaglehem);
                break;
            case 7:
                case8Destination7(passengers, startMaglehem);
                break;
            case 8:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 9:
                case8Destination9(passengers, startMaglehem);
                break;
            case 10:
                case8Destination10(passengers, startMaglehem);
                break;
        }
    }

    public static void case8Destination10(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String maglehemEslov= startMaglehem.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(maglehemEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int maglehemEslovCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busmaglehemEslovCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicoptermaglehemEslovCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination9(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String maglehemStehag= startMaglehem.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(maglehemStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int maglehemStehagCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busmaglehemStehagCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicoptermaglehemStehagCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination7(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String maglehemLulea= startMaglehem.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(maglehemLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int maglehemLuleaCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int busmaglehemLuleaCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicoptermaglehemLuleaCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination6(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String maglehemSkara= startMaglehem.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(maglehemSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int maglehemSkaraCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busmaglehemSkaraCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicoptermaglehemSkaraCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination5(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String maglehemKiruna= startMaglehem.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(maglehemKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int maglehemKirunaCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busmaglehemKirunaCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicoptermaglehemKirunaCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination4(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String maglehemMolndal= startMaglehem.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(maglehemMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int maglehemMolndalCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busmaglehemMolndalCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicoptermaglehemMolndalCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination3(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String maglehemVasteras= startMaglehem.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(maglehemVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int maglehemVasterasCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busmaglehemVasterasCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicoptermaglehemVasterasCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination2(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String maglehemStockholm= startMaglehem.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(maglehemStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int maglehemStockholmCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int busmaglehemStockholmCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicoptermaglehemStockholmCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case8Destination1(Scanner passengers, routeStarter startMaglehem) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String maglehemMalmo= startMaglehem.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(maglehemMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int maglehemMalmoCost=(startMaglehem.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*maglehemMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busmaglehemMalmoCost=(startMaglehem.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmaglehemMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicoptermaglehemMalmoCost=(startMaglehem.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermaglehemMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destinations(Scanner passengers, routeStarter startLulea, Scanner case7scan) {
        switch (case7scan.nextInt()) {
            case 1:
                case7Destination1(passengers, startLulea);
                break;
            case 2:
                case7Destination2(passengers, startLulea);
                break;
            case 3:
                case7Destination3(passengers, startLulea);
                break;
            case 4:
                case7Destination4(passengers, startLulea);
                break;
            case 5:
                case7Destination5(passengers, startLulea);
                break;
            case 6:
                case7Destination6(passengers, startLulea);
                break;
            case 7:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 8:
                case7Destination8(passengers, startLulea);
                break;
            case 9:
                case7Destination9(passengers, startLulea);
                break;
            case 10:
                case7Destination10(passengers, startLulea);
                break;
        }
    }

    public static void case7Destination10(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String luleaEslov= startLulea.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(luleaEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int luleaEslovCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busluleaEslovCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicopterluleaEslovCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination9(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String luleaStehag= startLulea.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(luleaStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int luleaStehagCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busluleaStehagCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicopterluleaStehagCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination8(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String luleaMaglehem= startLulea.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(luleaMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int luleaMaglehemCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busluleaMaglehemCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicopterluleaMaglehemCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination6(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String luleaSkara= startLulea.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(luleaSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int luleaSkaraCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busluleaSkaraCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicopterluleaSkaraCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination5(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String luleaKiruna= startLulea.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(luleaKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int luleaKirunaCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busluleaKirunaCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicopterluleaKirunaCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination4(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String luleaMolndal= startLulea.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(luleaMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int luleaMolndalCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busluleaMolndalCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicopterluleaMolndalCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination3(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String luleaVasteras= startLulea.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(luleaVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int luleaVasterasCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busluleaVasterasCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicopterluleaVasterasCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination2(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String luleaStockholm= startLulea.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(luleaStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int luleaStockholmCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int busluleaStockholmCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicopterluleaStockholmCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case7Destination1(Scanner passengers, routeStarter startLulea) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String luleaMalmo= startLulea.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(luleaMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int luleaMalmoCost=(startLulea.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*luleaMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busluleaMalmoCost=(startLulea.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busluleaMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicopterluleaMalmoCost=(startLulea.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterluleaMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destinations(Scanner passengers, routeStarter startSkara, Scanner case6scan) {
        switch (case6scan.nextInt()) {
            case 1:
                case6Destination1(passengers, startSkara);
                break;
            case 2:
                case6Destination2(passengers, startSkara);
                break;
            case 3:
                case6Destination3(passengers, startSkara);
                break;
            case 4:
                case6Destination4(passengers, startSkara);
                break;
            case 5:
                case6Destination5(passengers, startSkara);
                break;
            case 6:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 7:
                case6Destination7(passengers, startSkara);
                break;
            case 8:
                case6Destination8(passengers, startSkara);
                break;
            case 9:
                case6Destination9(passengers, startSkara);
                break;
            case 10:
                case6Destination10(passengers, startSkara);
                break;
        }
    }

    public static void case6Destination10(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String skaraEslov= startSkara.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(skaraEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int skaraEslovCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busskaraEslovCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicopterskaraEslovCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination9(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String skaraStehag= startSkara.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(skaraStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int skaraStehagCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busskaraStehagCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicopterskaraStehagCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination8(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String skaraMaglehem= startSkara.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(skaraMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int skaraMaglehemCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busskaraMaglehemCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicopterskaraMaglehemCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination7(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String skaraLulea= startSkara.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(skaraLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int skaraLuleaCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int busskaraLuleaCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicopterskaraLuleaCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination5(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String skaraKiruna= startSkara.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(skaraKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int skaraKirunaCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busskaraKirunaCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicopterskaraKirunaCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination4(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String skaraMolndal= startSkara.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(skaraMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int skaraMolndalCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busskaraMolndalCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicopterskaraMolndalCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination3(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String skaraVasteras= startSkara.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(skaraVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int skaraVasterasCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busskaraVasterasCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicopterskaraVasterasCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination2(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String skaraStockholm= startSkara.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(skaraStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int skaraStockholmCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int busskaraStockholmCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicopterskaraStockholmCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case6Destination1(Scanner passengers, routeStarter startSkara) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String skaraMalmo= startSkara.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(skaraMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int skaraMalmoCost=(startSkara.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*skaraMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busskaraMalmoCost=(startSkara.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busskaraMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicopterskaraMalmoCost=(startSkara.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterskaraMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destinations(Scanner passengers, routeStarter startKiruna, Scanner case5scan) {
        switch (case5scan.nextInt()) {
            case 1:
                case5Destination1(passengers, startKiruna);
                break;
            case 2:
                case5Destination2(passengers, startKiruna);
                break;
            case 3:
                case5Destination3(passengers, startKiruna);
                break;
            case 4:
                case5Destination4(passengers, startKiruna);
                break;
            case 5:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 6:
                case5Destination6(passengers, startKiruna);
                break;
            case 7:
                case5Destination7(passengers, startKiruna);
                break;
            case 8:
                case5Destination8(passengers, startKiruna);
                break;
            case 9:
                case5Destination9(passengers, startKiruna);
                break;
            case 10:
                case5Destination10(passengers, startKiruna);
                break;
        }
    }

    public static void case5Destination10(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String kirunaEslov= startKiruna.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(kirunaEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int kirunaEslovCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int buskirunaEslovCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicopterkirunaEslovCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination9(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String kirunaStehag= startKiruna.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(kirunaStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int kirunaStehagCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int buskirunaStehagCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicopterkirunaStehagCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination8(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String kirunaMaglehem= startKiruna.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(kirunaMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int kirunaMaglehemCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int buskirunaMaglehemCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicopterkirunaMaglehemCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination7(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String kirunaLulea= startKiruna.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(kirunaLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int kirunaLuleaCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int buskirunaLuleaCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicopterkirunaLuleaCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination6(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String kirunaSkara= startKiruna.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(kirunaSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int kirunaSkaraCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int buskirunaSkaraCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicopterkirunaSkaraCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination4(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String kirunaMolndal= startKiruna.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(kirunaMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int kirunaMolndalCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int buskirunaMolndalCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicopterkirunaMolndalCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination3(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String kirunaVasteras= startKiruna.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(kirunaVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int kirunaVasterasCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int buskirunaVasterasCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicopterkirunaVasterasCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination2(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String kirunaStockholm= startKiruna.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(kirunaStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int kirunaStockholmCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int buskirunaStockholmCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicopterkirunaStockholmCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case5Destination1(Scanner passengers, routeStarter startKiruna) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String kirunaMalmo= startKiruna.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(kirunaMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int kirunaMalmoCost=(startKiruna.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*kirunaMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int buskirunaMalmoCost=(startKiruna.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*buskirunaMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicopterkirunaMalmoCost=(startKiruna.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterkirunaMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destinations(Scanner passengers, routeStarter startMolndal, Scanner case4scan) {
        switch (case4scan.nextInt()) {
            case 1:
                case4Destination1(passengers, startMolndal);
                break;
            case 2:
                case4Destination2(passengers, startMolndal);
                break;
            case 3:
                case4Destination3(passengers, startMolndal);
                break;
            case 4:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 5:
                case4Destination5(passengers, startMolndal);
                break;
            case 6:
                case4Destination6(passengers, startMolndal);
                break;
            case 7:
                case4Destination7(passengers, startMolndal);
                break;
            case 8:
                case4Destination8(passengers, startMolndal);
                break;
            case 9:
                case4Destination9(passengers, startMolndal);
                break;
            case 10:
                case4Destination10(passengers, startMolndal);
                break;
        }
    }

    public static void case4Destination10(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String molndalEslov= startMolndal.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(molndalEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int molndalEslovCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busmolndalEslovCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicoptermolndalEslovCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination9(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String molndalStehag= startMolndal.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(molndalStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int molndalStehagCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busmolndalStehagCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicoptermolndalStehagCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination8(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String molndalMaglehem= startMolndal.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(molndalMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int molndalMaglehemCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busmolndalMaglehemCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicoptermolndalMaglehemCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination7(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String molndalLulea= startMolndal.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(molndalLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int molndalLuleaCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int busmolndalLuleaCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicoptermolndalLuleaCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination6(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String molndalSkara= startMolndal.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(molndalSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int molndalSkaraCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busmolndalSkaraCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicoptermolndalSkaraCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination5(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String molndalKiruna= startMolndal.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(molndalKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int molndalKirunaCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busmolndalKirunaCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicoptermolndalKirunaCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination3(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String molndalVasteras= startMolndal.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(molndalVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int vasterasMalmoCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busmolndalVasterasCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicoptermolndalVasterasCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination2(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String molndalStockholm= startMolndal.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(molndalStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int molndalStockholmCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int busmolndalStockholmCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicoptermolndalStockholmCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case4Destination1(Scanner passengers, routeStarter startMolndal) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String molndalMalmo= startMolndal.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(molndalMalmo);

        // Read transportFile
        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int molndalMalmoCost=(startMolndal.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*molndalMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busmolndalMalmoCost=(startMolndal.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmolndalMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicoptermolndalMalmoCost=(startMolndal.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermolndalMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destinations(Scanner passengers, routeStarter startVasteras, Scanner case3scan) {
        switch (case3scan.nextInt()) {
            case 1:
                case3Destination1(passengers, startVasteras);
                break;
            case 2:
                case3Destination2(passengers, startVasteras);
                break;
            case 3:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 4:
                case3Destination4(passengers, startVasteras);
                break;
            case 5:
                case3Destination5(passengers, startVasteras);
                break;
            case 6:
                case3Destination6(passengers, startVasteras);
                break;
            case 7:
                case3Destination7(passengers, startVasteras);
                break;
            case 8:
                case3Destination8(passengers, startVasteras);
                break;
            case 9:
                case3Destination9(passengers, startVasteras);
                break;
            case 10:
                case3Destination10(passengers, startVasteras);
                break;
        }
    }

    public static void case3Destination10(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String vasterasEslov= startVasteras.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(vasterasEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int vasterasEslovCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busvasterasEslovCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicoptervasterasEslovCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination9(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String vasterasStehag= startVasteras.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(vasterasStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int vasterasStehagCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busvasterasStehagCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicoptervasterasStehagCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination8(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String vasterasMaglehem= startVasteras.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(vasterasMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int vasterasMaglehemCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busvasterasMaglehemCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicoptervasterasMaglehemCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination7(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String vasterasLulea= startVasteras.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(vasterasLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int vasterasLuleaCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int busvasterasLuleaCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicoptervasterasLuleaCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination6(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String vasterasSkara= startVasteras.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(vasterasSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int vasterasSkaraCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busvasterasSkaraCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicoptervasterasSkaraCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination5(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String vasterasKiruna= startVasteras.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(vasterasKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int vasterasKirunaCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busvasterasKirunaCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicoptervasterasKirunaCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination4(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String vasterasMolndal= startVasteras.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(vasterasMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int vasterasMolndalCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busvasterasMolndalCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicoptervasterasMolndalCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination2(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
        System.out.println("You chose to travel to "
                + destinationStockholm.routeDestination + ".");
        System.out.println("\n");
        String vasterasStockholm= startVasteras.routeStart +"----->"
                +destinationStockholm.routeDestination;
        System.out.println(vasterasStockholm);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stockholm", 100);
                int vasterasStockholmCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasStockholmCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stockholm", 100);
                int busvasterasStockholmCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasStockholmCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stockholm", 100);
                int helicoptervasterasStockholmCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasStockholmCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case3Destination1(Scanner passengers, routeStarter startVasteras) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String vasterasMalmo= startVasteras.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(vasterasMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int vasterasMalmoCost=(startVasteras.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*vasterasMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busvasterasMalmoCost=(startVasteras.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busvasterasMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicoptervasterasMalmoCost=(startVasteras.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptervasterasMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destinations(Scanner passengers, routeStarter startStockholm, Scanner case2scan) {
        switch (case2scan.nextInt()) {
            case 1:
                case2Destination1(passengers, startStockholm);
                break;
            case 2:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 3:
                case2Destination3(passengers, startStockholm);
                break;
            case 4:
                case2Destination4(passengers, startStockholm);
                break;
            case 5:
                case2Destination5(passengers, startStockholm);
                break;
            case 6:
                case2Destination6(passengers, startStockholm);
                break;
            case 7:
                case2Destination7(passengers, startStockholm);
                break;
            case 8:
                case2Destination8(passengers, startStockholm);
                break;
            case 9:
                case2Destination9(passengers, startStockholm);
                break;
            case 10:
                case2Destination10(passengers, startStockholm);
                break;
        }
    }

    public static void case2Destination10(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String stockholmEslov= startStockholm.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(stockholmEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int stockholmEslovCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busstockholmEslovCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicopterstockholmEslovCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination9(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String stockholmStehag= startStockholm.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(stockholmStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int stockholmStehagCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busstockholmStehagCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicopterstockholmStehagCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination8(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String stockholmMaglehem= startStockholm.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(stockholmMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int stockholmMaglehemCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busstockholmMaglehemCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicopterstockholmMaglehemCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination7(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String stockholmLulea= startStockholm.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(stockholmLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int stockholmLuleaCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75 ,"Luleå", 350);
                int busstockholmLuleaCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicopterstockholmLuleaCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination6(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String stockholmSkara= startStockholm.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(stockholmSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int stockholmSkaraCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busstockholmSkaraCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicopterstockholmSkaraCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination5(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String stockholmKiruna= startStockholm.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(stockholmKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int stockholmKirunaCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busstockholmKirunaCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicopterstockholmKirunaCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination4(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String stockholmMolndal= startStockholm.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(stockholmMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int stockholmMolndalCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busstockholmMolndalCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Molndal", 200);
                int helicopterstockholmMolndalCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination3(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String stockholmVasteras= startStockholm.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(stockholmVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int stockholmVasterasCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busstockholmVasterasCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Vasteras", 150);
                int helicopterstockholmVasterasCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case2Destination1(Scanner passengers, routeStarter startStockholm) {
        routeDestinations destinationMalmo = new routeDestinations("Malmö", 50);
        System.out.println("You chose to travel to "
                + destinationMalmo.routeDestination + ".");
        System.out.println("\n");
        String stockholmMalmo= startStockholm.routeStart +"----->"
                +destinationMalmo.routeDestination;
        System.out.println(stockholmMalmo);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Malmö", 50);
                int stockholmMalmoCost=(startStockholm.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*stockholmMalmoCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Malmö", 50);
                int busstockholmMalmoCost=(startStockholm.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busstockholmMalmoCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Malmö", 50);
                int helicopterstockholmMalmoCost=(startStockholm.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicopterstockholmMalmoCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destinations(Scanner passengers, routeStarter startMalmo, Scanner case1scan) {
        switch (case1scan.nextInt()) {
            case 1:
                System.out.println("You cant have the same destination as starting point.");
                break;
            case 2:
                case1Destination2(passengers, startMalmo);
                break;
            case 3:
                case1Destination3(passengers, startMalmo);
                break;
            case 4:
                case1Destination4(passengers, startMalmo);
                break;
            case 5:
                case1Destination5(passengers, startMalmo);
                break;
            case 6:
                case1Destination6(passengers, startMalmo);
                break;
            case 7:
                case1Destination7(passengers, startMalmo);
                break;
            case 8:
                case1Destination8(passengers, startMalmo);
                break;
            case 9:
                case1Destination9(passengers, startMalmo);
                break;
            case 10:
                case1Destination10(passengers, startMalmo);
                break;
        }
    }

    public static void case1Destination10(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationEslov = new routeDestinations("Eslöv", 500);
        System.out.println("You chose to travel to "
                + destinationEslov.routeDestination + ".");
        System.out.println("\n");
        String malmoEslov= startMalmo.routeStart +"----->"
                +destinationEslov.routeDestination;
        System.out.println(malmoEslov);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Eslöv", 500);
                int malmoEslovCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoEslovCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Eslöv", 500);
                int busmalmoEslovCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoEslovCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Eslöv", 500);
                int helicoptermalmoEslovCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoEslovCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination9(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationStehag = new routeDestinations("Stehag", 450);
        System.out.println("You chose to travel to "
                + destinationStehag.routeDestination + ".");
        System.out.println("\n");
        String malmoStehag= startMalmo.routeStart +"----->"
                +destinationStehag.routeDestination;
        System.out.println(malmoStehag);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Stehag", 450);
                int malmoStehagCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoStehagCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Stehag", 450);
                int busmalmoStehagCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoStehagCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Stehag", 450);
                int helicoptermalmoStehagCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoStehagCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination8(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationMaglehem = new routeDestinations("Maglehem", 400);
        System.out.println("You chose to travel to "
                + destinationMaglehem.routeDestination + ".");
        System.out.println("\n");
        String malmoMaglehem= startMalmo.routeStart +"----->"
                +destinationMaglehem.routeDestination;
        System.out.println(malmoMaglehem);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Maglehem", 400);
                int malmoMaglehemCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoMaglehemCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Maglehem", 400);
                int busmalmoMaglehemCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoMaglehemCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Maglehem", 400);
                int helicoptermalmoMaglehemCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoMaglehemCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination7(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationLulea = new routeDestinations("Luleå", 350);
        System.out.println("You chose to travel to "
                + destinationLulea.routeDestination + ".");
        System.out.println("\n");
        String malmoLulea= startMalmo.routeStart +"----->"
                +destinationLulea.routeDestination;
        System.out.println(malmoLulea);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Luleå", 350);
                int malmoLuleaCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoLuleaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Luleå", 350);
                int busmalmoLuleaCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoLuleaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Luleå", 350);
                int helicoptermalmoLuleaCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoLuleaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination6(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationSkara = new routeDestinations("Skara", 300);
        System.out.println("You chose to travel to "
                + destinationSkara.routeDestination + ".");
        System.out.println("\n");
        String malmoSkara= startMalmo.routeStart +"----->"
                +destinationSkara.routeDestination;
        System.out.println(malmoSkara);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Skara", 300);
                int malmoSkaraCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoSkaraCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Skara", 300);
                int busmalmoSkaraCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoSkaraCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Skara", 300);
                int helicoptermalmoSkaraCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoSkaraCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination5(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationKiruna = new routeDestinations("Kiruna", 250);
        System.out.println("You chose to travel to "
                + destinationKiruna.routeDestination + ".");
        System.out.println("\n");
        String malmoKiruna= startMalmo.routeStart +"----->"
                +destinationKiruna.routeDestination;
        System.out.println(malmoKiruna);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Kiruna", 250);
                int malmoKirunaCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoKirunaCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Kiruna", 250);
                int busmalmoKirunaCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoKirunaCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Kiruna", 250);
                int helicoptermalmoKirunaCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoKirunaCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination4(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationMolndal = new routeDestinations("Mölndal", 200);
        System.out.println("You chose to travel to "
                + destinationMolndal.routeDestination + ".");
        System.out.println("\n");
        String malmoMolndal= startMalmo.routeStart +"----->"
                +destinationMolndal.routeDestination;
        System.out.println(malmoMolndal);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Mölndal", 200);
                int malmoMolndalCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoMolndalCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Mölndal", 200);
                int busmalmoMolndalCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoMolndalCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Mölndal", 200);
                int helicoptermalmoMolndalCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoMolndalCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination3(Scanner passengers, routeStarter startMalmo) {
        routeDestinations destinationVasteras = new routeDestinations("Västerås", 150);
        System.out.println("You chose to travel to "
                + destinationVasteras.routeDestination + ".");
        System.out.println("\n");
        String malmoVasteras= startMalmo.routeStart +"----->"
                +destinationVasteras.routeDestination;
        System.out.println(malmoVasteras);

        //Read and display transport alternatives
        readTransportAlternatives();

        //Choose transportation
        Scanner transportationScan = transportScanner();

        switch (transportationScan.nextInt()){
            case 1:
                System.out.println("You chose to go by train");
                routeTransport train = new routeTransport("Train",100,"Västerås", 150);
                int malmoVasterasCost=(startMalmo.startCost-(train.transportCost + train.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int totalCost = (passengers.nextInt()*malmoVasterasCost);
                System.out.println("your total cost is: "+totalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 2:
                System.out.println("You chose to go by bus");
                routeTransport bus = new routeTransport("Bus",75,"Västerås", 150);
                int busmalmoVasterasCost=(startMalmo.startCost-(bus.transportCost + bus.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int bustotalCost = (passengers.nextInt()*busmalmoVasterasCost);
                System.out.println("Your total cost is: "+bustotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
            case 3:
                System.out.println("You chose to go by helicopter");
                routeTransport helicopter = new routeTransport("Helicopter",25,"Västerås", 150);
                int helicoptermalmoVasterasCost=(startMalmo.startCost-(helicopter.transportCost + helicopter.destinationCost));
                System.out.println("How many passengers are traveling?");
                System.out.print("> ");
                int helicoptertotalCost = (passengers.nextInt()*helicoptermalmoVasterasCost);
                System.out.println("Your total cost is: "+helicoptertotalCost+" kr");

                //Do you want to buy your ticket?
                buyTicket(transportationScan);
                break;
        }
    }

    public static void case1Destination2(Scanner passengers, routeStarter startMalmo){
            routeDestinations destinationStockholm = new routeDestinations("Stockholm", 100);
            System.out.println("You chose to travel to "
                    + destinationStockholm.routeDestination + ".");
            System.out.println("\n");
            String malmoStockholm = startMalmo.routeStart + "----->"
                    + destinationStockholm.routeDestination;
            System.out.println(malmoStockholm);

            //Read and display transport alternatives
            readTransportAlternatives();

            //Choose transportation
            Scanner transportationScan = transportScanner();

            switch (transportationScan.nextInt()) {
                case 1:
                    System.out.println("You chose to go by train");
                    routeTransport train = new routeTransport("Train", 100, "Stockholm", 100);
                    int malmoStockholmCost = (startMalmo.startCost - (train.transportCost + train.destinationCost));
                    System.out.println("How many passengers are traveling?");
                    System.out.print("> ");
                    int totalCost = (passengers.nextInt() * malmoStockholmCost);
                    System.out.println("your total cost is: " + totalCost + " kr");

                    //Do you want to buy your ticket?
                    buyTicket(transportationScan);
                    break;
                case 2:
                    System.out.println("You chose to go by bus");
                    routeTransport bus = new routeTransport("Bus", 75, "Stockholm", 100);
                    int busmalmoStockholmCost = (startMalmo.startCost - (bus.transportCost + bus.destinationCost));
                    System.out.println("How many passengers are traveling?");
                    System.out.print("> ");
                    int bustotalCost = (passengers.nextInt() * busmalmoStockholmCost);
                    System.out.println("Your total cost is: " + bustotalCost + " kr");

                    //Do you want to buy your ticket?
                    buyTicket(transportationScan);

                    break;
                case 3:
                    System.out.println("You chose to go by helicopter");
                    routeTransport helicopter = new routeTransport("Helicopter", 25, "Stockholm", 100);
                    int helicoptermalmoStockholmCost = (startMalmo.startCost - (helicopter.transportCost + helicopter.destinationCost));
                    System.out.println("How many passengers are traveling?");
                    System.out.print("> ");
                    int helicoptertotalCost = (passengers.nextInt() * helicoptermalmoStockholmCost);
                    System.out.println("Your total cost is: " + helicoptertotalCost + " kr");

                    //Do you want to buy your ticket?
                    //Do you want to but the ticket?
                    System.out.println("Would you like to by your tiket y/n ?");
                    // User input i saved in buyTicket
                    String buyTicket = transportationScan.next();
                    break;
            }
    }

    public static void buyTicket(Scanner transportationScan) {
        //Do you want to but the ticket?
        System.out.println("Would you like to by your tiket y/n ?");
        // User input i saved in buyTicket
        String buyTicket = transportationScan.next();
        //WHAT HAPPENDS WHEN YOU BUY A TICKET?
    }

    public static Scanner transportScanner() {
        // Ask the user to input integer to choose transport alternatives
        System.out.println("Choose transportation alternative: ");
        Scanner transportationScan = new Scanner(System.in);
        // Scanner reads input value to choose switch case
        System.out.print(">");
        return transportationScan;
    }

    public static void readTransportAlternatives() {
        // Create file object from file "transportAlternatives
        File transportAlternatives = new File("./src/InformationFolder/transportAlternatives");
        //Create try catch to be able to catch error of file is not found
        try {
            //Create new scanner object "transportScanner" that reads "transportAlternatives"
            Scanner transportScanner = new Scanner(transportAlternatives);
            // While the File has a new line the scanner will read it and print it.
            while (transportScanner.hasNextLine()) {
                System.out.println(transportScanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Trouble reading file");
        }
    }

    public static void travelFrom() {
        //Create file object from file "routeStart"
        File startFile = new File("./src/InformationFolder/routeStart");
        //Create try catch to be able to catch error if file is not found
        try {
            //Create new scanner object "routeScanner" that reads "routeFile"
            Scanner routeScanner = new Scanner(startFile);
            //While the File has a new line the scanner will read it and print it.
            while (routeScanner.hasNextLine()) {
                System.out.println(routeScanner.nextLine());
            }
        }
        //If the file cannot be found a File Not Found Exception will be thrown and a warning text printed.
        catch(FileNotFoundException e){
            System.out.println("Trouble reading file");
        }
    }

    public static void welcomeToTheGame() {
        //Create file object from file "welcome text"
        File welcomeFile = new File("./src/InformationFolder/welcomeText");
        //Create try catch to be able to catch error if file is not found
        try {
            //Create new scanner object "welcomeScanner" that reads "welcomeFile"
            Scanner welcomeScanner = new Scanner(welcomeFile);
            //While the File has a new line the scanner will read it and print it.
            while (welcomeScanner.hasNextLine()) {
                System.out.println(welcomeScanner.nextLine());
            }
        }
        //If the file cannot be found a File Not Found Exception will be thrown and a warning text printed.
            catch(FileNotFoundException e){
                System.out.println("Trouble reading file");
            }
    }
}
