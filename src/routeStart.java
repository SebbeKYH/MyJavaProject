public class routeStart {
    //Declaring class variables
    public String routeStart;
    public int startCost;

    public routeStart(String inRouteStart,
                      int inStartCost){
        routeStart=inRouteStart;
        startCost=inStartCost;
    }
    public String getRouteDestination() {
        return routeStart;
    }
    public int getStartCost() {
        return startCost;
    }
    public void setRouteDestination(String routeStart){
        routeStart=routeStart;
    }
    public void setStartCost(int startCost){
        startCost=startCost;
    }
}
