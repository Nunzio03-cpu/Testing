package Testing3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        String formattaData = dateTime.format(formatter);

        System.out.println(formattaData);
    }
}