import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class test{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        LocalTime hr = LocalTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("mm");
        LocalTime min = LocalTime.now();
        int hour = Integer.parseInt(hr.format(formatter));
        int mins = Integer.parseInt(min.format(formatter2));
        int hrtime = hour - 12 + 4;
        System.out.println(hrtime + ":"+mins);

       
    }
}