import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time{
    public static void main(String[] args) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
            LocalTime hr = LocalTime.now();
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("mm");
            LocalTime min = LocalTime.now();
            int hour = Integer.parseInt(hr.format(formatter));
            int mins = Integer.parseInt(min.format(formatter2));
            int hrtime;
           
            System.out.println("Your timezone: pst, est, cst, mst, utc, gmt ");
            Scanner userInput = new Scanner(System.in);
            String timezone = userInput.nextLine(); 
            System.out.println("Enter timezone converting to: pst, est, cst, mst, utc, gmt ");
            String convertTo = userInput.nextLine();

            switch(timezone){
                case "pst":
                    hrtime = hour - 12 + 4;
                    System.out.println("pst: "+hrtime + ":"+mins);
                    if(convertTo.equals("est")){
                        hrtime = hour - 12 - 5;
                    System.out.println("est: "+hrtime + ":"+mins);
                    }
                break;
         
            }
       
              
    }
}