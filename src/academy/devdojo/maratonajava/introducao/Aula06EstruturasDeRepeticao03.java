package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor, Por exemplo, 50
        int valormax = 50;
        for (int i=1; i<=valormax;i++){
            if(i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
