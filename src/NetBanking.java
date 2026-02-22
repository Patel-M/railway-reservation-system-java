import java.time.LocalDate;

public class NetBanking implements Payment {
    private int cardNum, cvv;
    private String cardHolderName;
    private LocalDate validUpTo;

    public NetBanking(int cardNum, int cvv, String cardHolderName, LocalDate validUpTo) {
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
        this.validUpTo = validUpTo;
    }

    public void pay(double fare)
    {
        System.out.println("fare" + fare);
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDate getValidUpTo() {
        return validUpTo;
    }

    public void setValidUpTo(LocalDate validUpTo) {
        this.validUpTo = validUpTo;
    }
}
