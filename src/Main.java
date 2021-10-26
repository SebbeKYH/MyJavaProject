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

                        //Read transportFile
                        File malmoStockholmFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoStockholmFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoStockholmtransportScan.nextInt()){
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

                        // Read transportFile
                        File malmoVasterasFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoVasterasFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String malmoMolndal= startMalmo.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(malmoMolndal);

                        // Read transportFile
                        File malmoMolndalFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoMolndalFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String malmoKiruna= startMalmo.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(malmoKiruna);

                        // Read transportFile
                        File malmoKirunaFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoKirunaFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String malmoSkara= startMalmo.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(malmoSkara);

                        // Read transportFile
                        File malmoSkaraFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoSkaraFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String malmoLulea= startMalmo.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(malmoLulea);

                        // Read transportFile
                        File malmoLuleaFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoLuleaFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String malmoMaglehem= startMalmo.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(malmoMaglehem);

                        // Read transportFile
                        File malmoMaglehemFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoMaglehemFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String malmoStehag= startMalmo.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(malmoStehag);

                        // Read transportFile
                        File malmoStehagFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoStehagFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String malmoEslov= startMalmo.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(malmoEslov);

                        // Read transportFile
                        File malmoEslovFile = new File("./src/InformationFolder/transportAlternatives");
                        try {
                            Scanner transportScanner = new Scanner(malmoEslovFile);
                            while (transportScanner.hasNextLine()) {
                                System.out.println(transportScanner.nextLine());
                            }
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Trouble reading file");
                        }
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner malmoEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (malmoEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmMolndal= startStockholm.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(stockholmMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmKiruna= startStockholm.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(stockholmKiruna);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmSkara= startStockholm.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(stockholmSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmLulea= startStockholm.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(stockholmLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmMaglehem= startStockholm.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(stockholmMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmStehag= startStockholm.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(stockholmStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String stockholmEslov= startStockholm.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(stockholmEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stockholmEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stockholmEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasStockholm= startVasteras.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(vasterasStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasStockholmtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasKiruna= startVasteras.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(vasterasKiruna);
                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasSkara= startVasteras.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(vasterasSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasLulea= startVasteras.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(vasterasLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasMaglehem= startVasteras.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(vasterasMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasStehag= startVasteras.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(vasterasStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String vasterasEslov= startVasteras.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(vasterasEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner vasterasEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (vasterasEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String molndalStockholm= startMolndal.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(molndalStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalStockholmtransportScan.nextInt()){
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
                        String molndalVasteras= startMolndal.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(molndalVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String molndalSkara= startMolndal.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(molndalSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String molndalLulea= startMolndal.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(molndalLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String molndalMaglehem= startMolndal.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(molndalMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String molndalStehag= startMolndal.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(molndalStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String molndalEslov= startMolndal.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(molndalEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner molndalEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (molndalEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaStockholm= startKiruna.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(kirunaStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaStockholmtransportScan.nextInt()){
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
                        String kirunaVasteras= startKiruna.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(kirunaVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaMolndal= startKiruna.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(kirunaMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaLulea= startKiruna.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(kirunaLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaMaglehem= startKiruna.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(kirunaMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaStehag= startKiruna.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(kirunaStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String kirunaEslov= startKiruna.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(kirunaEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner kirunaEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (kirunaEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String skaraStockholm= startSkara.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(skaraStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraStockholmtransportScan.nextInt()){
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
                        String skaraVasteras= startSkara.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(skaraVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String skaraMolndal= startSkara.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(skaraMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String skaraKiruna= startSkara.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(skaraKiruna);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String skaraMaglehem= startSkara.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(skaraMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String skaraStehag= startSkara.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(skaraStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String skaraEslov= startSkara.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(skaraEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner skaraEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (skaraEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }

                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String luleaStockholm= startLulea.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(luleaStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaStockholmtransportScan.nextInt()){
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
                        String luleaVasteras= startLulea.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(luleaVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String luleaMolndal= startLulea.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(luleaMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String luleaKiruna= startLulea.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(luleaKiruna);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String luleaSkara= startLulea.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(luleaSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String luleaStehag= startLulea.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(luleaStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String luleaEslov= startLulea.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(luleaEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner luleaEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (luleaEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemStockholm= startMaglehem.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(maglehemStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemStockholmtransportScan.nextInt()){
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
                        String maglehemVasteras= startMaglehem.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(maglehemVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemMolndal= startMaglehem.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(maglehemMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemKiruna= startMaglehem.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(maglehemKiruna);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemSkara= startMaglehem.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(maglehemSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemLulea= startMaglehem.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(maglehemLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 10:
                        routeDestination destinationEslov = new routeDestination("Eslöv", 500);
                        System.out.println("You chose to travel to "
                                + destinationEslov.routeDestination + ".");
                        System.out.println("\n");
                        String maglehemEslov= startMaglehem.routeStart +"----->"
                                +destinationEslov.routeDestination;
                        System.out.println(maglehemEslov);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner maglehemEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (maglehemEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String stehagStockholm= startStehag.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(stehagStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagStockholmtransportScan.nextInt()){
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
                        String stehagVasteras= startStehag.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(stehagVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String stehagMolndal= startStehag.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(stehagMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String stehagKiruna= startStehag.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(stehagKiruna);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String stehagSkara= startStehag.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(stehagSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String stehagLulea= startStehag.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(stehagLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String stehagMaglehem= startStehag.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(stehagMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner stehagEslovtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (stehagEslovtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovMalmotransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovMalmotransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        routeDestination destinationStockholm = new routeDestination("Stockholm", 100);
                        System.out.println("You chose to travel to "
                                + destinationStockholm.routeDestination + ".");
                        System.out.println("\n");
                        String eslovStockholm= startEslov.routeStart +"----->"
                                +destinationStockholm.routeDestination;
                        System.out.println(eslovStockholm);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovStockholmtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovStockholmtransportScan.nextInt()){
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
                        String eslovVasteras= startEslov.routeStart +"----->"
                                +destinationVasteras.routeDestination;
                        System.out.println(eslovVasteras);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovVasterastransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovVasterastransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 4:
                        routeDestination destinationMolndal = new routeDestination("Mölndal", 200);
                        System.out.println("You chose to travel to "
                                + destinationMolndal.routeDestination + ".");
                        System.out.println("\n");
                        String eslovMolndal= startEslov.routeStart +"----->"
                                +destinationMolndal.routeDestination;
                        System.out.println(eslovMolndal);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovMolndaltransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovMolndaltransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        routeDestination destinationKiruna = new routeDestination("Kiruna", 250);
                        System.out.println("You chose to travel to "
                                + destinationKiruna.routeDestination + ".");
                        System.out.println("\n");
                        String eslovKiruna= startEslov.routeStart +"----->"
                                +destinationKiruna.routeDestination;
                        System.out.println(eslovKiruna);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovKirunatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovKirunatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        routeDestination destinationSkara = new routeDestination("Skara", 300);
                        System.out.println("You chose to travel to "
                                + destinationSkara.routeDestination + ".");
                        System.out.println("\n");
                        String eslovSkara= startEslov.routeStart +"----->"
                                +destinationSkara.routeDestination;
                        System.out.println(eslovSkara);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovSkaratransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovSkaratransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 7:
                        routeDestination destinationLulea = new routeDestination("Luleå", 350);
                        System.out.println("You chose to travel to "
                                + destinationLulea.routeDestination + ".");
                        System.out.println("\n");
                        String eslovLulea= startEslov.routeStart +"----->"
                                +destinationLulea.routeDestination;
                        System.out.println(eslovLulea);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovLuleatransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovLuleatransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 8:
                        routeDestination destinationMaglehem = new routeDestination("Maglehem", 400);
                        System.out.println("You chose to travel to "
                                + destinationMaglehem.routeDestination + ".");
                        System.out.println("\n");
                        String eslovMaglehem= startEslov.routeStart +"----->"
                                +destinationMaglehem.routeDestination;
                        System.out.println(eslovMaglehem);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovMaglehemtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovMaglehemtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 9:
                        routeDestination destinationStehag = new routeDestination("Stehag", 450);
                        System.out.println("You chose to travel to "
                                + destinationStehag.routeDestination + ".");
                        System.out.println("\n");
                        String eslovStehag= startEslov.routeStart +"----->"
                                +destinationStehag.routeDestination;
                        System.out.println(eslovStehag);

                        //Choose transportation
                        System.out.println("Choose transportation alternative: ");
                        Scanner eslovStehagtransportScan = new Scanner(System.in);
                        System.out.print(">");

                        switch (eslovStehagtransportScan.nextInt()){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
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
