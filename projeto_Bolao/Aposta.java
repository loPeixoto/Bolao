package projeto_Bolao;

import java.util.ArrayList;
import java.util.Scanner;

public class Aposta {
    private ArrayList<Integer> numeros;
    private Jogador organizador;
    private ArrayList<Jogador> jogadores;


    public Aposta(){
        this.numeros = new ArrayList<Integer>();
        //this.organizador = new Jogador(); não adiciona o jogador de inicio
        // nao inicializei o organizador
        this.jogadores = new ArrayList<Jogador>();
    }
    


    public boolean vencedora(ArrayList<Integer> NumApostados) {
        int i = 0;

        for(int numSorteado : NumApostados){ 
            if (verificaNumeros(numSorteado)){ 
                i++;
            }
        }

        if ( i == 6){
            return true;
        } else {
            return false;
        }
    }

    public void listarVencedores(double premio) {
        double premioOrg, premioJog;

        System.out.println("** VENCEDORES **");

        this.organizador.listarDados();
        System.out.println();

        for(Jogador j : this.jogadores) {
            j.listarDados();
            System.out.println();
        }
        premioOrg = (premio - (premio*0.1))/(this.jogadores.size()+1) + premio*0.1;
        premioJog = (premio - (premio*0.1))/(this.jogadores.size()+1);

        System.out.println("Premiaçao para o(os) organizador(es): " + premioOrg);
        System.out.println("Premiação para o(os) jogador(es): " + premioJog);
        System.out.println();
    }

    public boolean verificaNumeros(int numero){
       

        for (Integer num : this.getNumeros()){
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

        while(numeros.size() < q) {
            System.out.println(" Digite o " + cont + " numero da aposta");
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
        System.out.println("*Digite o cpf do jogador que sera o organizador da aposta *");
        i = ler.nextLine();

        for( Jogador jogador : j){ 
            if (i.equals(jogador.cpf)){ // verifica se o cpf digitado é igual a algum cpf já cadastrado
                this.organizador = jogador;
            }
        }
        System.out.println();
        System.out.println("DADOS DO ORGANIZADOR");
        System.out.println("  Nome: " + this.organizador.nome);
        System.out.println("  CPF: " + this.organizador.cpf);
        System.out.println("  PIX: " + this.organizador.pix);
        
        // falta verificar se o cpf é valido e oq vai fazer se nao 
        // achar algum cpf na lista
    }

    public void inserirJogadores(ArrayList<Jogador> jogadores){
        int j, i = 0;
        String linha;
        Scanner read = new Scanner(System.in);
        System.out.println("*  Digite o numero de jogadores do bilhete (sem contar o organizador) *");
        j = read.nextInt();

        for( Jogador jogador : jogadores){ // lista os dados de todos os jogadores
            System.out.println();
            jogador.listarDados();
            System.out.println();
        }

        while ( i < j) {
            System.out.println("* Informe o CPF do jogador para inseri-lo na aposta: *");
            linha = read.nextLine(); 

            for(Jogador jogador : jogadores){ 
                if (linha.equals(jogador.cpf)){ // verifica se o cpf digitado é igual a algum cpf já cadastrado
                    this.jogadores.add(jogador);
                    i++;
                } else{
                    //System.out.println(" ERRO Digite um CPF que esteja na lista\n");
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(" jogadores cadastrados ");
        System.out.println();
    }
}
