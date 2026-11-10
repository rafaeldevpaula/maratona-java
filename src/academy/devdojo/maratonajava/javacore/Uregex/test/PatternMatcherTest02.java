package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracteres menos os brancos
        // \w = a-ZA-Z, digitos, _

        String regex = "\\w";
        String texto = "abaaba";
        String texto2 = "k32j_h423 9042jsalk";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");

        }
    }
}
