package projeto_Bolao;

import java.util.Scanner;

public class Menu {

    
    public static int lerOpcao(){
        /* le a opcao digitada e retorna ela */
        Scanner ler = new Scanner(System.in); 
        //ler.close();       
        return ler.nextInt();      
    } 

    public static int imprimeMenu() {
        /* imprime as primeiras opcoes do menu */
        System.out.println("Escolha uma das opcoes");
        System.out.println("1) Cadastrar jogador");
        System.out.println("2) Cadastrar aposta");
        System.out.println("3) Inserir sorteio e listar vencedores");
        System.out.println("4) Sair");
        System.out.printf("Digite aqui a opcao do menu: ");
        return lerOpcao();
    }
}
