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
            try {
                String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuCliente, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

                //tratamentos que vão ser padrões abaixo
                if (menuResposta == null){
                    return;
                }

                menuResposta = menuResposta.trim();
                if (menuResposta.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nada!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
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
                        JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema, tente novamente.\nErro: "+ e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        } while (loop != 0);
    }

    public void menuFuncionario(){
        int loop = -1;

        do {
            try {
                String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuFuncionario, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

                //tratamentos que vão ser padrões abaixo
                if (menuResposta == null){
                    return;
                }

                menuResposta = menuResposta.trim();
                if (menuResposta.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nada!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
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
                        JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema, tente novamente.\nErro: "+ e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        } while (loop != 0);
    }

    public void menuVeiculo (){
        int loop = -1;

        do {
            try {
                String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuVeiculo, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

                //tratamentos que vão ser padrões abaixo
                if (menuResposta == null){
                    return;
                }

                menuResposta = menuResposta.trim();
                if (menuResposta.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nada!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
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
                        JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente.", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema, tente novamente.\nErro: "+ e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        } while (loop != 0);
    }


    public void cadastroCliente(){

        String nomeCliente = JOptionPane.showInputDialog(null, "Insira seu nome completo:", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);
    }

    public void listarCliente(){

    }

    public void verificarCliente(){

    }
}
