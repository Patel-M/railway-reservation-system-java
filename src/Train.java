
public class Train {
    private int trainNumber;
    private String sourceStation,sourcePlatform,destinationStation,destinationPlatform;
    private String classType,quota;
    private int departTime,arrivalTime;
    private double amount;
    public Train(int trainNumber, String sourceStation, String sourcePlatform, String destinationStation,
            String destinationPlatform, String classType, String quota, int departTime, int arrivalTime,
            double amount) {
        this.trainNumber = trainNumber;
        this.sourceStation = sourceStation;
        this.sourcePlatform = sourcePlatform;
        this.destinationStation = destinationStation;
        this.destinationPlatform = destinationPlatform;
        this.classType = classType;
        this.quota = quota;
        this.departTime = departTime;
        this.arrivalTime = arrivalTime;
        this.amount = amount;
    }

    public Train(){}
    
    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    public String getSourceStation() {
        return sourceStation;
    }
    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }
    public String getSourcePlatform() {
        return sourcePlatform;
    }
    public void setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
    }
    public String getDestinationStation() {
        return destinationStation;
    }
    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }
    public String getDestinationPlatform() {
        return destinationPlatform;
    }
    public void setDestinationPlatform(String destinationPlatform) {
        this.destinationPlatform = destinationPlatform;
    }
    public String getClassType() {
        return classType;
    }
    public void setClassType(String classType) {
        this.classType = classType;
    }
    public String getQuota() {
        return quota;
    }
    public void setQuota(String quota) {
        this.quota = quota;
    }
    public int getDepartTime() {
        return departTime;
    }
    public void setDepartTime(int departTime) {
        this.departTime = departTime;
    }
    public int getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------------------------------------\n"
                + "Train Number: " + getTrainNumber() + "\nSource Station: " + getSourceStation()
                + " \tSource Platform: " + getSourcePlatform() + " \tDeparture Time: " + getDepartTime() 
                + "\nDestination Station: " + getDestinationStation() + " \tDestination Platform: " + getDestinationPlatform() 
                + " \tArrival Time: " + getArrivalTime() + "\nClass Type: " + getClassType() + " \t Quota: " + getQuota()
                + " \tAmount: " + getAmount() 
                + "\n--------------------------------------------------------------------------------------------------------------------\n";
    }
}
