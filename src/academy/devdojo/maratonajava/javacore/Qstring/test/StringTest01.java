package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Ruggine"; // String constant pool
        String nome2 = "Ruggine";
        nome = nome.concat(" Bressan"); // nome += " Bressan"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Ruggine"); // 1 variavel de referencia, 2 objeto
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }

}
