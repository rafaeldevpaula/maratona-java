package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayint = new int[3][];

        arrayint[0] = new int[2];
        arrayint[1] = new int[4];
        arrayint[2] = new int[6];

        int[][] arrayint2 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};


        for (int[] arraybase : arrayint2) {
            for (int num : arraybase) {
                System.out.print(num);
            }
        }
    }
}
