package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Romildo";
        nome.concat(" Bressan");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Romildo");
        sb.append(" Bressan");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb.toString());

    }
}
