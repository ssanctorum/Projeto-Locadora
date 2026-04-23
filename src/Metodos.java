import javax.swing.*;
import java.util.ArrayList;

public class Metodos {

//essas são as tres listas principais
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Veiculo> veiculos = new ArrayList<>();

//aqui começam os metodos
    public void cadastrarCliente(JOptionPane jOptionPane){

        String nomeCadastro = JOptionPane.showInputDialog(null,"Insira seu nome completo", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
    }
}
