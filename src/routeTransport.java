public class routeTransport extends routeDestinations {     //Class inherits variables from destinationclass
    //What kind och destination is it? ie train, bus, helicopter
    public static String transportType;
    // What is the specific cost for the specific type of transport added later to destination cost
    public static int transportCost;
    //Creating the constructor
    public routeTransport (String inTransportType, int inTransportCost,
                           String inRouteDestination, int inDestinationCost){
        super(inRouteDestination, inDestinationCost);       //Inherited variables from destinationclass
        transportType=inTransportType;
        transportCost=inTransportCost;
    }
    public int getTransportCost (){
        return transportCost;
    }
    public String getTransportType (){
        return transportType;
    }
    public void setTransportCost(int inTransportCost){
        transportCost=transportCost;
    }
    public void setTransportType(String inTransportType){
        transportType=transportType;
    }
}
