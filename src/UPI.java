public class UPI implements Payment{
    private int upiId;

    public UPI(int upiId) {
        this.upiId = upiId;
    }

    public void pay(double fare)
    {
        System.out.println("fare" + fare);
    }

    public int getUpiId() {
        return upiId;
    }

    public void setUpiId(int upiId) {
        this.upiId = upiId;
    }
}
