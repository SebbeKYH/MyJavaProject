public class routeDestinations {
    //Declaring class variables
    public static String routeDestination;
    public static int destinationCost;

    public routeDestinations(String inRouteDestination,
                             int inDestinationCost){
        routeDestination=inRouteDestination;
        destinationCost=inDestinationCost;
    }
    public String getRouteDestination() {
        return routeDestination;
    }
    public int getDestinationCost() {
        return destinationCost;
    }
    public void setRouteDestination(String routeDestination){
        routeDestination=routeDestination;
    }
    public void setDestinationCost(int destinationCost){
        destinationCost=destinationCost;
    }
}
