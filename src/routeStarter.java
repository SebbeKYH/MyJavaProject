public class routeStarter {
    //Declaring class variables
    public static String routeStart;
    public static int startCost;

    public routeStarter(String inRouteStart,
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
