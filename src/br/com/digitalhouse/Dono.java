package br.com.digitalhouse;

public class Dono {
    private String nome;
    public String sexo;

    //Construtor especifico
    public Dono(String novoNome) {
        nome = novoNome;
    }

    // construtor padrao
    public Dono() {

    }


    // alimentar
    public void alimentar(Cachorro cachorrinho) {
        System.out.println("Ola " + cachorrinho.nome);
    }

    // get acessor
    public String getNome() {
        return nome;
    }

    //Set modificador
    public void setNome(String novoNome) {
        nome = novoNome;
    }
}

