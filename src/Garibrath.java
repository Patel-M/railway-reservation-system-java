public class Garibrath extends Train {

    public Garibrath( int trainNumber,String sourceStation,String sourcePlatform,String destinationStation,String destinationPlatform,String classType,String quota,int departTime,int arrivalTime,double amount) {
        super( trainNumber,sourceStation,sourcePlatform,destinationStation,destinationPlatform, classType,quota,departTime,arrivalTime,amount);
    }
    
    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------------------------------------\n"
                + "Train Name: GaribRath \tTrain Number: " + getTrainNumber() + "\nSource Station: " + getSourceStation()
                + " \tSource Platform: " + getSourcePlatform() + " \tDeparture Time: " + getDepartTime() 
                + "\nDestination Station: " + getDestinationStation() + " \tDestination Platform: " + getDestinationPlatform() 
                + " \tArrival Time: " + getArrivalTime() + "\nClass Type: " + getClassType() + " \t Quota: " + getQuota()
                + " \tAmount: " + getAmount() 
                + "\n--------------------------------------------------------------------------------------------------------------------\n";
    }
}
