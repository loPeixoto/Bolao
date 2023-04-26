package projeto_Bolao;

public class Principal {

    public static void main(String[] args) {

    
        Bolao bolao1 = new Bolao();

        int opcao = Menu.imprimeMenu();
        while (opcao != 4 ){

            if ( opcao == 1){
                bolao1.cadastrarJogadores();
            }
            if ( opcao == 2){
                bolao1.cadastrarAposta();
            }
            if ( opcao == 3){
                bolao1.inserirSorteio();
            }
            opcao = Menu.imprimeMenu();
        }

    }
}
