package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class CheckMail
{
    public static  boolean CheckMail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (pat.matcher(email).matches()){
            return true;
        }
        else {
            return false;
        }


    }


}