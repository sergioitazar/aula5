package br.com.digitalhouse;

public class Principal {
    public static void main(String)[]args)

    {
        Dono tairo = new Dono("Tairo Roberto") ;

            Dono jessica = new Dono();

            System.out.println (tairo.getNome());

            tairo.setNome ("Joao Santos");

            tairo.sexo = "Masculino";

            System.out.println (tairo.sexo);

            Cachorro bidu = new Cachorro();

            bidu.nome = "Bidu";

            tairo.alimentar(bidu);



    }
}
