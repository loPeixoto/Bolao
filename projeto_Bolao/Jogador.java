package projeto_Bolao;

import java.util.Scanner;

public class Jogador extends Pessoa {
    protected String pix;

    public Jogador() {
        super();
        Scanner s = new Scanner(System.in);

        this.pix = s.nextLine();
        
    }

    public void listarDados(){

    }    
}
