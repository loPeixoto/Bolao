package projeto_Bolao;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void inserirNumeros() {
        int cont, aux, q;
        cont = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("*** Digite a quantidade de números da aposta ***");
        q = ler.nextInt();

        this.numeros = new ArrayList<Integer>();

        while(numeros.size() <= q) {
            aux = ler.nextInt();
            if(aux <= 0 || aux > 60) {
                System.out.println("Erro: digite um número válido de 1 a 60");
            }else if(!this.numeros.contains(aux)) {
                System.out.println("Erro: não pode repetir número");
            }else {
                this.numeros.add(aux);
                cont ++;
            }

        }
    }

    public void inserirOrganizador( ArrayList<Jogador> j){
        String i;

        for( Jogador jogador : j){ // lista os dados de todos os jogadores
            jogador.listarDados(); 
        }

        Scanner ler = new Scanner(System.in);
        System.out.println("* Digite o cpf do jogador que sera o organizador da aposta *");
        i = ler.nextLine();

        for( Jogador jogador : j){ 
            if (i.equals(jogador.cpf)){ // verifica se o cpf digitado é igual a algum cpf já cadastrado
                organizador.cpf = jogador.cpf;
                organizador.nome = jogador.nome;
                organizador.pix = jogador.pix;
            }
        }
    }

    public void inserirJogadores(){
        int j;
        String linha;
        Scanner ler = new Scanner(System.in);
        System.out.println("* Digite o numero de jogadores do bilhete (sem contar o organizador) *");
        j = ler.nextInt();

        for (int i = 1; i <= j; i++) {
            for( Jogador jogador : jogadores){ // lista os dados de todos os jogadores
                jogador.listarDados(); 
            }
            
            System.out.println("* Informe o CPF do jogador*");
            linha = ler.nextLine(); // le o cpf do jogador

            for( Jogador jogador : jogadores){ 
                if (linha.equals(jogador.cpf)){ // verifica se o cpf digitado é igual a algum cpf já cadastrado
                    this.jogadores.add(jogador);
                }
            }

       
        }
        System.out.println(" jogadores cadastrados ");
    }

}
