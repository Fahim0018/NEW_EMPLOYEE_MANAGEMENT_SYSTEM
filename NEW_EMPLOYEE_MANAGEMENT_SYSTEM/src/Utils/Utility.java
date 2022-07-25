package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utility {
    //check validity od date
    public static boolean CheckDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try
        {
            Date d = format.parse(date);
        }
        // Invalid date
        catch (ParseException e)
        {
            System.out.println(date+" is an invalid date");
            return false;
        }
        // Returns true if the date is valid
        return true;
    }

    //check valid format of mail
    public static  boolean CheckMail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();


    }

    //check for valid phone number
    public static boolean isValidMobileNo(String str)
    {
        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptrn.matcher(str);
        return (match.find() && match.group().equals(str));
    }

    public static boolean isDatePast(String date,String dateFormat) {
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate inputDate = LocalDate.parse(date, dtf);

        return inputDate.isBefore(localDate);
    }

    public static int getDay(String date)
    {

        // Get an instance of LocalTime
        // from date
        LocalDate currentDate
                = LocalDate.parse(date);

        // Get day from date
        int day = currentDate.getDayOfMonth();

        return day;

    }

    public static Month getMonth(String date){
        LocalDate currentDate
                = LocalDate.parse(date);
       Month month = currentDate.getMonth();
       return month;
    }

    public static int getYear(String date) {
        LocalDate currentDate
                = LocalDate.parse(date);
        int year =currentDate.getYear();
        return year;

    }
}
