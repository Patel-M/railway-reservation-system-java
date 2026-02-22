public class Rajdhani extends Train{
    private String meal;
    private Boolean bedRolls;

    
    public Rajdhani( int trainNumber,String sourceStation,String sourcePlatform,String destinationStation,String destinationPlatform,String classType,String quota,int departTime,int arrivalTime,double amount,String meal,Boolean bedRolls) {
        super( trainNumber,sourceStation,sourcePlatform,destinationStation,destinationPlatform, classType,quota,departTime,arrivalTime,amount);
        this.meal=meal;
        this.bedRolls=bedRolls;
    }
    public String getMeal() {
        return meal;
    }
    public void setMeal(String meal) {
        this.meal = meal;
    }
    public Boolean getBedRolls() {
        return bedRolls;
    }
    public void setBedRolls(Boolean bedRolls) {
        this.bedRolls = bedRolls;
    }
    
    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------------------------------------\n"
                + "Train Name: Rajdhani \tTrain Number: " + getTrainNumber() + "\nSource Station: " + getSourceStation()
                + " \tSource Platform: " + getSourcePlatform() + " \tDeparture Time: " + getDepartTime() 
                + "\nDestination Station: " + getDestinationStation() + " \tDestination Platform: " + getDestinationPlatform() 
                + " \tArrival Time: " + getArrivalTime() + "\nClass Type: " + getClassType() + " \t Quota: " + getQuota()
                + " \tAmount: " + getAmount() 
                + "\n--------------------------------------------------------------------------------------------------------------------\n";
    }
}
