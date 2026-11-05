package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void datachecker() {
        System.out.println("Fazendo checagem de permissoes de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
