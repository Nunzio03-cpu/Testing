package Testing2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateString1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("dateString-1 " + dateString1);

        String dateString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("dateString-2 " + dateString2);

        String dateString3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("dateString-3 " + dateString3);
    }
}
