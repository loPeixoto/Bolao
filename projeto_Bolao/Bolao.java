package projeto_Bolao;

import java.util.ArrayList;

public class Bolao{

    private ArrayList<Aposta> apostas; // tem sómente 1 cartao e minimo 2 jogadores
    private ArrayList<Jogador> jogadores;

    public Bolao() {
        this.apostas = new ArrayList<Aposta>();
        this.jogadores = new ArrayList<Jogador>();
    }

    public void cadastrarJogadores() {
        System.out.println("Digite os dados do jogador");
        Jogador j = new Jogador();
        this.jogadores.add(j);
    }

    public void cadastrarAposta() {
        Aposta aposta1 = new Aposta();
        aposta1.inserirJogadores();
        aposta1.inserirNumeros();
        System.out.println("Aposta criada");
    }

    
}