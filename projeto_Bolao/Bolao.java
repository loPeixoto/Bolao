package projeto_Bolao;

import java.util.ArrayList;
import java.util.Scanner;

public class Bolao{

    private ArrayList<Aposta> apostas; // tem sómente 1 cartao e minimo 2 jogadores
    private ArrayList<Jogador> jogadores;

    public Bolao() {
        this.apostas = new ArrayList<Aposta>();
        this.jogadores = new ArrayList<Jogador>();
    }

    public ArrayList<Aposta> getAposta(){
        return this.apostas;
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


    private ArrayList<Aposta> vencedoras(ArrayList<Integer> NumSorteados){
        // Recebe os numeros sorteados

        ArrayList<Aposta> ApostasVencedoras = new ArrayList<Aposta>();
        for (Aposta apostas : this.getAposta()){
            if(apostas.vencedora(NumSorteados)){
                ApostasVencedoras.add(apostas);
            }
        }
        // compara os numeros sorteados com cada aposta existente
        // retorna as apostas premiadas
        return ApostasVencedoras;
    }

    public void inserirSorteio(){
        // a pessoa digita os numeros sorteados
        ArrayList<Integer> NumSorteados = new ArrayList<Integer>();
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();


        int i = 1;
        while ( i <= 6){
            System.out.println(" Digite o " + i + "¨ sorteado: ");

            if ( num < 1 || num > 60){

            }
        }
    }
    
}