public class routeDestination {
    //Declaring class variables
    public String routeDestination;
    public int destinationCost;

    public routeDestination(String inRouteDestination,
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
