package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "dipascar";
        carro1.modelo = "de paula";
        carro1.ano = 2007;


        carro2.nome = "tchotchvoitcar";
        carro2.modelo = "bressan";
        carro2.ano = 2005;

        carro1 = carro2;
        carro2 = carro1;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
