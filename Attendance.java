package graduatestudies;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Attendance {
     void getAttendance()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Status: IN or OUT");
        String status= sc.nextLine();
        switch(status.toUpperCase())
        {
            case "IN" :
                checkIN();
                break;
            case "OUT" :
                checkOUT();
                break;
            default:
                System.out.println("Enter a status: IN or OUT");
        }
    }
    //To display the date and time after checked in
    public static void checkIN()
    {
        System.out.println("CHECKED IN");
        System.out.println("Check in Date and Time " );
        DateTimeFormatter datefrmt = DateTimeFormatter.ofPattern("dd/MM/yyyy\nhh:mm:ss");
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datefrmt.format(datetime));

    }
    //To display the date and time after checked out(with i did this)
    public static void checkOUT()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("I did this");
        String str= in.nextLine();
        System.out.println("CHECKED OUT");
        System.out.println("Check out Date and Time");
        DateTimeFormatter datefrmt = DateTimeFormatter.ofPattern("dd/MM/yyyy\nHH:mm:ss");
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datefrmt.format(datetime));
        System.out.println("I DID THIS\n" + str);
    }

}

