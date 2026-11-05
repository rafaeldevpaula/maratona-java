package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");
        Locale localeHolanda = new Locale("nl","NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat f1 =DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat f2 =DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat f3 =DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat f4 =DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat f5 =DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        System.out.println("Italia "+ f1.format(calendar.getTime()));
        System.out.println("Suica "+ f2.format(calendar.getTime()));
        System.out.println("India "+ f3.format(calendar.getTime()));
        System.out.println("Japao "+ f4.format(calendar.getTime()));
        System.out.println("Holanda "+ f5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));
    }
}
