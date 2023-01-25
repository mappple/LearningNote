import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestFilter {

    public static void main(String[] args) {
        System.out.println(formatDate(null));
    }
    
    private static String pathFilter(String origin) {
        String result = "";
        result = origin.replaceAll("..", "");
        System.out.println(result);
        return result;
    }

    private static String formatDate(String origin) {
        String format = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.CHINA);
        try {
            Date date = sdf.parse(origin);
            SimpleDateFormat resSdf = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
            format = resSdf.format(date);
        } catch (ParseException e) {
            format = "";
        }
        return format;
    }
}
