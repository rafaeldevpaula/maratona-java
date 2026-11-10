package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        LocalDate parse1 = LocalDate.parse("20261105", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-11-05+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-11-05", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-11-05T16:23:16.841844", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("05/11/2026", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("05.November.2026", formatterGR);
        System.out.println(parseGR);


    }
}
