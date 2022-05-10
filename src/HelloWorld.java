import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HelloWorld {
    public static void main(String[] args) {

        Date date = new Date();
        Calendar c = GregorianCalendar.getInstance();
        System.out.println(
                "Currently it is: " + c.get(Calendar.HOUR_OF_DAY)
        );
        System.out.println("Normal Hours = " + new HelloWorld().normalHours(c.get(Calendar.HOUR_OF_DAY)));
    }

    public boolean normalHours(int hours){
        return (hours < 24 && hours > -1);
    }
}
