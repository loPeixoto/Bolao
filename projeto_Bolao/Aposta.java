package projeto_Bolao;

import java.util.ArrayList;
import java.util.Scanner;

public class Aposta {
    private ArrayList<Integer> numeros;
    private Jogador organizador;
    private ArrayList<Jogador> jogadores;


    public Aposta(){
        this.numeros = new ArrayList<Integer>();
        this.organizador = new Jogador();
        // nao inicializei o organizador
        this.jogadores = new ArrayList<Jogador>();
    }
    


    public boolean vencedora(ArrayList<Integer> NumApostados) {
        int i = 0;

        for(Integer numSorteado : NumApostados){ 
            if (verificaNumeros(numSorteado)){ 
                i++;
            }
        }

        if ( i >= 6){
            return true;
        } else {
            return false;
        }
    }

    public void listarVencedores (double premio) {

    }

    public boolean verificaNumeros(int numero){
       

        for (int num : this.getNumeros()){
            if (num == numero){
                return true;
            }
        }
        return false;
    }

    public void inserirNumeros() {
        int cont = 1 , aux, q;

        Scanner ler = new Scanner(System.in);
        System.out.println("***  Digite a quantidade de números da aposta ***");
        // precisa de validação pra ser no minimo 6 e no maximo 8
        q = ler.nextInt();

        this.numeros = new ArrayList<Integer>();

        while(numeros.size() <= q) {
            System.out.println(" Digite o " + cont + "numero da aposta");
            aux = ler.nextInt();
            if(aux <= 0 || aux > 60) {
                System.out.println("Erro: digite um número válido de 1 a 60");
            }else {
                this.numeros.add(aux);
                cont ++;
            }

        }
    }

    public ArrayList<Integer> getNumeros(){
        return this.numeros;
    }

    public void inserirOrganizador( ArrayList<Jogador> j){
        String i;

        for( Jogador jogador : j){ // lista os dados de todos os jogadores
            jogador.listarDados(); 
        }

        Scanner ler = new Scanner(System.in);
        System.out.println("*inserirOrganizador Digite o cpf do jogador que sera o organizador da aposta *");
        i = ler.nextLine();

        for( Jogador jogador : j){ 
            if (i.equals(jogador.cpf)){ // verifica se o cpf digitado é igual a algum cpf já cadastrado
                this.organizador = jogador;
            }
        }

        // falta verificar se o cpf é valido e oq vai fazer se nao 
        // achar algum cpf na lista
    }

    public void inserirJogadores(){
        int j;
        String linha;
        Scanner ler = new Scanner(System.in);
        System.out.println("* inserir Jogadores : Digite o numero de jogadores do bilhete (sem contar o organizador) *");
        j = ler.nextInt();

        for (int i = 1; i <= j; i++) {
            for( Jogador jogador : jogadores){ // lista os dados de todos os jogadores
                jogador.listarDados(); 
            }
            
            System.out.printf("* Informe o CPF do jogador para inseri-lo: *");
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
