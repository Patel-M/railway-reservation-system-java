import java.util.*;
import java.time.LocalDate;
import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TrainMain {
    public static void main(String args[])
    {
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("                                        WELCOME TO RAILWAY RESERVATION SYSTEM");
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        Booking book=new Booking();
        Duranto d1 = new Duranto(12341,"Mumbai","P1","Jaipur","P3","AC 1 Tier","General/Ladies/Senior Citizen",2300,1400,4500.0,"Yes/No");
        Duranto d2 = new Duranto(42342,"Jaipur","P3","Mumbai","P1","AC 1 Tier","General/Foreign Tourists/Yuva",1400,0700,4500.0,"Yes/No");
        Duranto d3 = new Duranto(13342,"Mumbai","P1","Surat","P2","AC 1 Tier","General/Ladies",0645,1030,1200.0,"Yes/No");
        
        Garibrath g1 = new Garibrath(23456, "Rajkot","P2" , "Chandigarh", "P4", "AC 3 Tier", "General/Tatkal/Ladies", 1200, 2300,2421.0 );
        Garibrath g2 = new Garibrath(24567, "Surat","P1" , "Jaipur", "P3", "AC 3 Tier", "General/Senior Citizen/Viklang", 1500, 2200,1901.0 );
        Garibrath g3 = new Garibrath(25678, "Mumbai ","P2" , "Jaipur", "P1", "AC 3 Tier", "General/Ladies/Tatkal", 0200, 1200,2011.0 );

        Rajdhani r1 = new Rajdhani(34521, "Jaipur", "P1", "Mumbai", "P3", "AC 2 Tier", "General/Senior Citizen", 0700, 2300, 4321.0, "Yes", true);
        Rajdhani r2 = new Rajdhani(34521, "Mumbai", "P1", "Jaipur", "P3", "AC 2 Tier", "General/Defence", 1200, 2200, 5551.0, "Yes", true);
        Rajdhani r3 = new Rajdhani(34521, "Nagpur", "P1", "Jaipur", "P3", "AC 2 Tier", "General/Ladies/Senior Citizen", 0700, 2300, 6321.0, "Yes", false);

        DoubleDecker dd1 = new DoubleDecker(76152, "Mumbai", "P2", "Jaipur", "P3", "CC", "Ladies/Senior Citizen", 0600, 1750, 890.0, "No");
        DoubleDecker dd2 = new DoubleDecker(78982, "Nagpur", "P2", "Jaipur", "P3", "CC", "General/Tatkal/Foreign Tourists", 1800, 2150, 1990.0, "Yes");
        DoubleDecker dd3 = new DoubleDecker(71234, "Jaipur", "P2", "Surat", "P3", "CC", "General/Yuva", 1600, 1250, 1890.0, "No");
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter Source Station: ");
        String dep=input.nextLine();
        System.out.println("\nEnter Destination Station: ");
        String arr=input.nextLine();

        System.out.println("\n\n--------------------------------------------------------------------------------------------------------------------");
        System.out.println("AVAILABLE TRAINS FOR " + dep + " TO " + arr + " : ");
        
        int i=1;
        switch(i)
        {
            case 1: 
                if(dep.equals(d1.getSourceStation()))
                {   
                    if(arr.equals(d1.getDestinationStation()))
                    {
                        System.out.println(d1.toString());
                    }
                }
            case 2:
            if(dep.equals(d2.getSourceStation()))
            {   
                if(arr.equals(d2.getDestinationStation()))
                {
                    System.out.println(d2.toString());
                }
            }
            case 3:
            if(dep.equals(d3.getSourceStation()))
            {   
                if(arr.equals(d3.getDestinationStation()))
                {
                    System.out.println(d3.toString());
                }
            }
            case 4:
            if(dep.equals(g1.getSourceStation()))
            {   
                if(arr.equals(g1.getDestinationStation()))
                {
                    System.out.println(g1.toString());
                }
            }
            case 5:
            if(dep.equals(g2.getSourceStation()))
            {   
                if(arr.equals(g2.getDestinationStation()))
                {
                    System.out.println(g2.toString());
                }
            }
            case 6:
            if(dep.equals(g3.getSourceStation()))
            {   
                if(arr.equals(g3.getDestinationStation()))
                {
                    System.out.println(g3.toString());
                }
            }
            case 7:
            if(dep.equals(r1.getSourceStation()))
            {   
                if(arr.equals(r1.getDestinationStation()))
                {
                    System.out.println(r1.toString());
                }
            }
            case 8:
            if(dep.equals(r2.getSourceStation()))
            {   
                if(arr.equals(r2.getDestinationStation()))
                {
                    System.out.println(r2.toString());
                }
            }
            case 9:
            if(dep.equals(r3.getSourceStation()))
            {   
                if(arr.equals(r3.getDestinationStation()))
                {
                    System.out.println(r3.toString());
                }
            }
            case 10:
            if(dep.equals(dd1.getSourceStation()))
            {   
                if(arr.equals(dd1.getDestinationStation()))
                {
                    System.out.println(dd1.toString());
                }
            }
            case 11:
            if(dep.equals(dd2.getSourceStation()))
            {   
                if(arr.equals(dd2.getDestinationStation()))
                {
                    System.out.println(dd2.toString());
                }
            }
            case 12:
            if(dep.equals(dd3.getSourceStation()))
            {   
                if(arr.equals(dd3.getDestinationStation()))
                {
                    System.out.println(dd3.toString());
                }
            }

            default: 
                System.out.println("No more trains Available\n\n");
        }

        System.out.println("Select Train Number: ");
        int tnum = input.nextInt();
        int j=1;
        Train t= new Train();
        switch(j)
        {
            case 1:
                if(tnum==d1.getTrainNumber())
                {
                    System.out.println("\nTrain Selected");
                    t = new Train(d1.getTrainNumber(),d1.getSourceStation(),d1.getSourcePlatform(),d1.getDestinationStation(),d1.getDestinationPlatform(),d1.getClassType(),d1.getQuota(),d1.getDepartTime(),d1.getArrivalTime(),d1.getAmount());
                    break;
                }


            case 2:
                if(tnum==d2.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(d2.getTrainNumber(),d2.getSourceStation(),d2.getSourcePlatform(),d2.getDestinationStation(),d2.getDestinationPlatform(),d2.getClassType(),d2.getQuota(),d2.getDepartTime(),d2.getArrivalTime(),d2.getAmount());
                    break;  
                }

            case 3:
                if(tnum==d3.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(d3.getTrainNumber(),d3.getSourceStation(),d3.getSourcePlatform(),d3.getDestinationStation(),d3.getDestinationPlatform(),d3.getClassType(),d3.getQuota(),d3.getDepartTime(),d3.getArrivalTime(),d3.getAmount());
                    break;
                }

            case 4:
                if(tnum==g1.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(g1.getTrainNumber(),g1.getSourceStation(),g1.getSourcePlatform(),g1.getDestinationStation(),g1.getDestinationPlatform(),g1.getClassType(),g1.getQuota(),g1.getDepartTime(),g1.getArrivalTime(),g1.getAmount());
                    break;
                }

            case 5:
                if(tnum==g2.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(g2.getTrainNumber(),g2.getSourceStation(),g2.getSourcePlatform(),g2.getDestinationStation(),g2.getDestinationPlatform(),g2.getClassType(),g2.getQuota(),g2.getDepartTime(),g2.getArrivalTime(),g2.getAmount());
                    break;
                }

            case 6:
                if(tnum==g3.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(g3.getTrainNumber(),g3.getSourceStation(),g3.getSourcePlatform(),g3.getDestinationStation(),g3.getDestinationPlatform(),g3.getClassType(),g3.getQuota(),g3.getDepartTime(),g3.getArrivalTime(),g3.getAmount());
                    break;
                }

            case 7:
                if(tnum==r1.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(r1.getTrainNumber(),r1.getSourceStation(),r1.getSourcePlatform(),r1.getDestinationStation(),r1.getDestinationPlatform(),r1.getClassType(),r1.getQuota(),r1.getDepartTime(),r1.getArrivalTime(),r1.getAmount());
                    break;
                }

            case 8:
                if(tnum==r2.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(r2.getTrainNumber(),r2.getSourceStation(),r2.getSourcePlatform(),r2.getDestinationStation(),r2.getDestinationPlatform(),r2.getClassType(),r2.getQuota(),r2.getDepartTime(),r2.getArrivalTime(),r2.getAmount());
                    break;
                }

            case 9:
                if(tnum==r3.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(r3.getTrainNumber(),r3.getSourceStation(),r3.getSourcePlatform(),r3.getDestinationStation(),r3.getDestinationPlatform(),r3.getClassType(),r3.getQuota(),r3.getDepartTime(),r3.getArrivalTime(),r3.getAmount());
                    break;
                }

            case 10:
                if(tnum==dd1.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(dd1.getTrainNumber(),dd1.getSourceStation(),dd1.getSourcePlatform(),dd1.getDestinationStation(),dd1.getDestinationPlatform(),dd1.getClassType(),dd1.getQuota(),dd1.getDepartTime(),dd1.getArrivalTime(),dd1.getAmount());
                    break;
                }

            case 11:
                if(tnum==dd2.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(dd2.getTrainNumber(),dd2.getSourceStation(),dd2.getSourcePlatform(),dd2.getDestinationStation(),dd2.getDestinationPlatform(),dd2.getClassType(),dd2.getQuota(),dd2.getDepartTime(),dd2.getArrivalTime(),dd2.getAmount());
                    break;
                }

            case 12:
                if(tnum==dd3.getTrainNumber())
                {
                    System.out.println("Train Selected");
                    t = new Train(dd3.getTrainNumber(),dd3.getSourceStation(),dd3.getSourcePlatform(),dd3.getDestinationStation(),dd3.getDestinationPlatform(),dd3.getClassType(),dd3.getQuota(),dd3.getDepartTime(),dd3.getArrivalTime(),dd3.getAmount());
                    break;
                }

            default:
                System.out.println("Invalid hai padh likh kar aa");
            
        }
        System.out.println(t.toString());

        try{
            System.out.println("\nEnter the Date of Journey (YYYY-MM-DD): ");
            String d = input.next();

            LocalDate date = LocalDate.parse(d,DateTimeFormatter.ISO_DATE);
            book.setDateOfJourney(date);
        }
        catch(DateTimeParseException e){
            System.out.println("Exception " + e);
        }

        System.out.println("\nEnter the Choice of Quota: ");
        String q = input.next();
        book.setQuota(q);

        System.out.println("\nSelect Birth Preference (Upper/Middle/Lower): ");
        String bf = input.next();
        book.setBirthPref(bf);

        int mealflag=0;
        String m="";
        if(t.getTrainNumber()!=23456 && t.getTrainNumber()!=24567 && t.getTrainNumber()!=25678 ){
            System.out.println("\nDo you want Meal (YES/NO): ");
            m = input.next();
            mealflag=1;
        }
        else{
            m = "NA";
            mealflag=0;
        }
        
        System.out.println("\nNumber of Passenger: ");
        double p = input.nextDouble();

        ArrayList<Passenger> list = new ArrayList<Passenger>();

        for(int k=0;k<p;k++)
        {
            System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter your Name: ");
            String name = input.next();
            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            System.out.println("Enter your Gender(M/F): ");
            String gender = input.next();
            System.out.println("Enter your Mobile No.: ");
            String mobile = input.next();

            Passenger pass = new Passenger(name,age,gender,mobile);
            list.add(pass);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        double totalFare = p*t.getAmount();
        System.out.println("Total Amount for Journey: " + totalFare);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        System.out.println("Select the Mode of Payment \n1. UPI \n2. NetBanking \n3. Cash");
        int paychoice = input.nextInt();
        String uid="",cname="",cval="";
        int cnum=0,cvv=0;

        if(paychoice==1)
        { 
            System.out.println("--------------------------------------------------------------------------------------------------------------------"); 
            book.setMode("UPI");
            System.out.println("Enter UPI ID: ");
            uid = input.next();
        }
        else if(paychoice==2)
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            book.setMode("Net Banking");
            System.out.println("Enter Card Holder Name : ");
            cname = input.next();

            System.out.println("Enter Card Number : ");
            cnum = input.nextInt();

            System.out.println("Enter CVV : ");
            cvv = input.nextInt();
        
            System.out.println("Enter Valid Upto:");
            cval = input.next();            
        }
        else {
            book.setMode("Cash");
        }

        input.close();
        
        //Printing Ticket
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                 FINAL ITINERARY");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        String characters="0123456789";
        System.out.println("\nPASSENGER DETAILS: ");
        for (int x=0;x<p;x++){
            String pnr="";
            Random random=new Random();
            for (int y=0;y<10;y++){
                int ind=random.nextInt(characters.length());
                char character=characters.charAt(ind);
                pnr=pnr+character;
            }
            System.out.println("\nPNR: " + pnr);
            System.out.println(list.get(x).toString());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTRAIN DETAILS: ");
        System.out.println("\nTrain Number:\t" + t.getTrainNumber());
        System.out.println("\nDate of Journey:\t" + book.getDateOfJourney());
        System.out.println("\nSource Station:\t" + t.getSourceStation());
        System.out.println("\nSource Platform:\t" + t.getSourcePlatform());
        System.out.println("\nDeparture Time:\t" + t.getDepartTime());
        System.out.println("\nDestination Station:\t" + t.getDestinationStation());
        System.out.println("\nDestination Platform:\t" + t.getDestinationPlatform());
        System.out.println("\nArrival Time:\t" + t.getArrivalTime());
        System.out.println("\nClass Type:\t" + t.getClassType());
        System.out.println("\nQuota:\t" + book.getQuota());
        System.out.println("\nBirth Preference:\t" + book.getBirthPref());
        if (mealflag==1){
            System.out.println("\nMeal:\t" + m);
        }
        else {
            System.out.println("\nMeal:\tNo");
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nPAYMENT INFORMATION: ");
        System.out.println("\nTotal Amount: " + totalFare);
        System.out.print("\nMode: " + book.getMode());
        if (paychoice==1){
            System.out.print("\nUPI ID: " + uid);
            System.out.println("\nPayment Status: Paid");
        }
        else if (paychoice==2){
            System.out.println("\nCard Holder Name: " + cname);
            System.out.println("\nCard Number: " + cnum);
            System.out.println("\nCard cvv: " + cvv);
            System.out.println("\nCard Expiry: " + cval);
            System.out.println("\nPayment Status: Paid");
        }
        else {
            System.out.println("\nPayment Status: Paid");
        }
    }
}
