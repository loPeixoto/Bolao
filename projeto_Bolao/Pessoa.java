package projeto_Bolao;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa() {
        Scanner r = new Scanner(System.in);

        System.out.printf("Digite o nome: ");
        this.nome = r.nextLine();

        System.out.printf("Digite o CPF: ");
        this.cpf = r.nextLine();

    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void listarDados() {
        System.out.println("*** DADOS DA PESSOA ***");
        System.out.println("   Nome: " + this.getNome());
        System.out.println("   CPF: " + this.getCPF());
        
    }
    
}
