public class DoubleDecker extends Train {
     private String meal;


    public DoubleDecker( int trainNumber,String sourceStation,String sourcePlatform,String destinationStation,String destinationPlatform,String classType,String quota,int departTime,int arrivalTime,double amount,String meal) {
        super( trainNumber,sourceStation,sourcePlatform,destinationStation,destinationPlatform, classType,quota,departTime,arrivalTime,amount);
        this.meal=meal;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------------------------------------\n"
                + "Train Name: DoubleDecker \tTrain Number: " + getTrainNumber() + "\nSource Station: " + getSourceStation()
                + " \tSource Platform: " + getSourcePlatform() + " \tDeparture Time: " + getDepartTime() 
                + "\nDestination Station: " + getDestinationStation() + " \tDestination Platform: " + getDestinationPlatform() 
                + " \tArrival Time: " + getArrivalTime() + "\nClass Type: " + getClassType() + " \t Quota: " + getQuota()
                + " \tAmount: " + getAmount() 
                + "\n--------------------------------------------------------------------------------------------------------------------\n";
    }
}
