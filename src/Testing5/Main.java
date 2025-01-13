package Testing5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("La data completa è " + data);

        OffsetDateTime aggiuntoAnno = data.plusYears(1);
        System.out.println("Aggiunta di un anno: " + aggiuntoAnno);

        OffsetDateTime sottraiMese = data.minusMonths(1);
        System.out.println("Sottratto un mese: " + sottraiMese);

        OffsetDateTime aggiunti7giorni = data.plusDays(7);
        System.out.println("Aggiunti 7 giorni: " + aggiunti7giorni);
    }
}
