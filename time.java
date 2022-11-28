import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime date = LocalTime.now();
        System.out.println(date.format(formatter));
            System.out.println("Your timezone: pst, est, cst, mst, utc, gmt ");
            Scanner userInput = new Scanner(System.in);
            String timezone = userInput.nextLine(); 
            System.out.println("Enter timezone converting to: pst, est, cst, mst, utc, gmt ");
            String convertTo = userInput.nextLine();

            switch(timezone){
                case "pst":
                    if(convertTo == "est"){
                        
                    }
                break;
         
            }
       
              
    }
}