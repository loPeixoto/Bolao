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
        System.out.println();
        System.out.println(" -----------------------------");
        System.out.println("Digite os dados do jogador \n");
        Jogador j = new Jogador();
        this.jogadores.add(j);
        System.out.println(" -----------------------------");
    }

    public void cadastrarAposta() {
        Aposta aposta1 = new Aposta();
        aposta1.inserirOrganizador(jogadores);
        aposta1.inserirJogadores(jogadores);
        aposta1.inserirNumeros();
        this.getAposta().add(aposta1);
        System.out.println("Aposta criada");
        System.out.println();
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
        int i = 1;
        double premio;
        double divisaoPremio;
        
        ArrayList<Integer> numSorteados = new ArrayList<Integer>();
        ArrayList<Aposta> apostasVencedoras = new ArrayList<Aposta>();
        Scanner r = new Scanner(System.in);
        

        while(numSorteados.size() < 6) {

            System.out.println(" Digite o " + i + " numero sorteado: ");
           
            if(aux <= 0 || aux > 60) {
                System.out.println(" ERRO digite um número válido de 1 a 60");
            }else {
                aux = r.nextInt();
                numSorteados.add(aux);
                i++;
            }
        }

        System.out.println("Digite qual será o valor da premiação: ");
        premio = r.nextDouble();

        apostasVencedoras = vencedoras(numSorteados);

        divisaoPremio = premio/apostasVencedoras.size();
        int i2=1;
        for (Aposta aposta1: apostasVencedoras){
            System.out.println(" Aposta de numero:  " + i2);
            System.out.println();
            aposta1.listarVencedores(divisaoPremio);
        }
       
    }

}