package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatSring(3000);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto para String "+tempo+"ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        long fim2 = System.currentTimeMillis();
        long tempo2 = fim2 - inicio2;
        System.out.println("Tempo gasto para StringBuilder "+tempo2+"ms");

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long fim3 = System.currentTimeMillis();
        long tempo3 = fim3 - inicio3;
        System.out.println("Tempo gasto para StringBuffer "+tempo3+"ms");
    }

    private static void concatSring(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i; // 0,01,012,013
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb= new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb= new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
