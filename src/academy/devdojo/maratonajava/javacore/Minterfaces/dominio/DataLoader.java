package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();

    default void datachecker(){
        System.out.println("Fazendo checagem de permissoes");
    }

    static void retrieveMaxDataSize(){
        System.out.println("dentro da interface DataLoader");
    }
}
