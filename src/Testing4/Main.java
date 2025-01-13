package Testing4;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dateTimeString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateTimeString);

        int anno = dateTime.getYear();
        String nomeMese = dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        int giorno = dateTime.getDayOfMonth();
        String nomeGiornoSettimana = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + nomeMese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + nomeGiornoSettimana);
    }
}
