package projeto_Bolao;

import java.util.Scanner;

public class Jogador extends Pessoa {
    protected String pix;

    public Jogador() {
        super();
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite o pix: ");
        this.pix = s.nextLine();
        
    }

    public void listarDados(){
        super.listarDados();
        System.out.println("CPF: " + this.pix);
    }    
}
