package projeto_Bolao;

import java.util.ArrayList;

public class Aposta {
    private ArrayList<Integer> numeros;
    private Jogador organizador;
    private ArrayList<Jogador> jogadores;


    public Aposta(ArrayList<Integer> numeros, Jogador organizador, ArrayList<Jogador> jogadores){
        numeros = new ArrayList<Integer>();
        organizador = new Jogador();
        // nao inicializei o organizador
        jogadores = new ArrayList<Jogador>();
    }

    public boolean vencedora(ArrayList<Integer> sorteados) {
        return true;
    }
    
    public void listarVencedores (double premio){

    }
}
