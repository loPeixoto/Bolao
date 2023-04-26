package projeto_Bolao;

public class Principal {

    public static void main(String[] args) {

    
        Bolao bolao1 = new Bolao();

        int opcao = Menu.imprimeMenu();
        while (opcao != 0 ){

            if ( opcao == 1){
                bolao1.cadastrarJogadores();
            }
            if ( opcao == 2){
                bolao1.cadastrarAposta();
            }
            if ( opcao == 3){
                // ainda nao foi feito
            }
            opcao = Menu.imprimeMenu();
        }

    }
}
