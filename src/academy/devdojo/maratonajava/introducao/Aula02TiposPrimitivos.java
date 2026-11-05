package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos{
    public static void main(String[] args){
        // int, double, flaot, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000D;
        float salarioFloat = (float) 2500.0D;
        byte ageByte = 19;
        short ageShort = 19;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = " uma milllllllllllllllllllllllllllllllllllllllkovich";
        System.out.println("A idade é "+age+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("oi eu sou" + nome);
    }
}