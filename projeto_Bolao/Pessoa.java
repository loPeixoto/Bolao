package projeto_Bolao;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa() {
        Scanner r = new Scanner(System.in);

        System.out.println("Digite o nome:\n");
        this.nome = r.nextLine();

        System.out.println("Digite o CPF: \n");
        this.cpf = r.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void listarDados() {
        System.out.println("*** Dados da Pessoa ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
    
}
