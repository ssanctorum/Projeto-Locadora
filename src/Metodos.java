import javax.swing.*;
import java.util.ArrayList;

public class Metodos {

//essas são as tres listas principais
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    //aqui começam os metodos
    //como os metodos possuem somente variaveis locais repetirei tudo

    public void menuCliente(){

        int loop = -1;

        do {
            String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuCliente, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            //tratamentos que vão ser padrões abaixo
            if (menuResposta == null){
                return;
            }

            menuResposta = menuResposta.trim();
            if (menuResposta.isEmpty()){
                JOptionPane.showMessageDialog(null,"Você não digitou nada!");
                continue;
            }

            int menuRespostaInt = Integer.parseInt(menuResposta);

            switch (menuRespostaInt){

                case 1:
                    cadastroCliente();
                    break;

                case 2:
                    listarCliente();
                    break;

                case 3:
                    verificarCliente();
                    break;

                case 0:
                    loop = 0;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        } while (loop != 0);
    }

    public void menuFuncionario(){
        int loop = -1;

        do {
            String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuFuncionario, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            //tratamentos que vão ser padrões abaixo
            if (menuResposta == null){
                return;
            }

            menuResposta = menuResposta.trim();
            if (menuResposta.isEmpty()){
                JOptionPane.showMessageDialog(null,"Você não digitou nada!");
                continue;
            }

            int menuRespostaInt = Integer.parseInt(menuResposta);

            switch (menuRespostaInt){

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 0:
                    loop = 0;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        } while (loop != 0);
    }

    public void menuVeiculo (){
        int loop = -1;

        do {
            String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuVeiculo, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            //tratamentos que vão ser padrões abaixo
            if (menuResposta == null){
                return;
            }

            menuResposta = menuResposta.trim();
            if (menuResposta.isEmpty()){
                JOptionPane.showMessageDialog(null,"Você não digitou nada!");
                continue;
            }

            int menuRespostaInt = Integer.parseInt(menuResposta);

            switch (menuRespostaInt){

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 0:
                    loop = 0;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        } while (loop != 0);
    }


    public void cadastroCliente(){

    }

    public void listarCliente(){

    }

    public void verificarCliente(){

    }
}
