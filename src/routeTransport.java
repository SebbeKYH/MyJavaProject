public class routeTransport extends routeDestinations {
    public static String transportType;
    public static int transportCost;
    public routeTransport (String inTransportType, int inTransportCost,
                           String inRouteDestination, int inDestinationCost){
        super(inRouteDestination, inDestinationCost);
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
