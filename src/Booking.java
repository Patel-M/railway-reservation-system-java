import java.time.LocalDate;

public class Booking implements Payment {
    private int trainNumber;
    private LocalDate dateOfJourney;
    private String sourceStation, destinationStation, quota, birthPref, mode;
    
    public Booking(){}

    public Booking(int trainNumber, LocalDate dateOfJourney, String sourceStation, String destinationStation,
            String quota, String birthPref, String mode) {
        this.trainNumber = trainNumber;
        this.dateOfJourney = dateOfJourney;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.quota = quota;
        this.birthPref = birthPref;
        this.mode = mode;
    }

    public void pay(double fare){}

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalDate getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(LocalDate dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getBirthPref() {
        return birthPref;
    }

    public void setBirthPref(String birthPref) {
        this.birthPref = birthPref;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}

