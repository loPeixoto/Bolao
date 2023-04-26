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

    public void inserirSorteio() {
        int aux= 1;
        int i = 0;
        double premio;
        
        ArrayList<Integer> numSorteados = new ArrayList<Integer>();
        Scanner r = new Scanner(System.in);


        while(numSorteados.size() < 7) {

            System.out.println(" Digite o " + i + "o sorteado: ");
           
            if(aux <= 0 || aux > 60) {
                System.out.println("Erro: digite um número válido de 1 a 60");
            }else {
                aux = r.nextInt();
                numSorteados.add(aux);
                i++;
            }
        }

        System.out.println("Digite qual será o valor da premiação");
        premio = r.nextDouble();

    }
}