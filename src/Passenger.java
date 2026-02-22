public class Passenger {
    private int  age;
    private String name, gender,mobileNumber;

    public Passenger(){}
    
    public Passenger(String name,int age, String gender,String mobileNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }
   
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\t\tAge: " + getAge() + "\t\tGender: " + getGender() + "\tMobile NUmber: " + getMobileNumber();
    }
}
