import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    @Test
    public void willStartCostInitiate(){
        int predictedValue = 1000;
        int testStart = (routeStarter.startCost=1000);
        Assertions.assertEquals(predictedValue,testStart);
    }
    @Test
    public void willDestinationCostInitiate(){
        int predictedValue=500;
        int testDestination =(routeDestinations.destinationCost=500);
        Assertions.assertEquals(predictedValue, testDestination);
    }
    @Test
    public void willTransportCostInitiate(){
        int predictedValue=50;
        int testTransport =(routeTransport.transportCost=50);
        Assertions.assertEquals(predictedValue,testTransport);
    }
    @Test
    public void willStartName(){
        String predictedValue="Malmö";
        String testStartName = (routeStarter.routeStart="Malmö");
        Assertions.assertEquals(predictedValue, testStartName);
    }
    @Test
    public void willDestinationName(){
        String predictedValue="Malmö";
        String testDestinationName = (routeDestinations.routeDestination="Malmö");
        Assertions.assertEquals(predictedValue, testDestinationName);
    }
}