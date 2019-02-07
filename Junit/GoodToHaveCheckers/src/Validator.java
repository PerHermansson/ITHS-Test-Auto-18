public class Validator {

    // https://en.wikipedia.org/wiki/Email_address#Examples
    public boolean isValidEmail(Object addresstocheck)
    {
        return false;
    }

    public boolean isValidEmail(String addresstocheck)
    {
        boolean result=false;

        if (addresstocheck.length()<3){
            result = false;
        } else
        if (addresstocheck.length()>320){
            result = false;
        }  else
        if (addresstocheck.contains("@")){
            result = true;
        }
        return result;
    }
}
