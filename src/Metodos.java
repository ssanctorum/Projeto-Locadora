import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuCliente, "Menu Principal", JOptionPane.PLAIN_MESSAGE);

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
                        cadastroCliente();
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
                String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuFuncionario, "Menu Principal", JOptionPane.PLAIN_MESSAGE);

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
                String menuResposta = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuVeiculo, "Menu Principal", JOptionPane.PLAIN_MESSAGE);

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

        int comecarCadastro = JOptionPane.showConfirmDialog(null,"Para iniciar o cadastro, certifique-se de ter esses dados em mãos:\n\n - Nome completo\n - CPF \n - Telefone \n - E-mail \n - Endereço\n - Número da CNH\n - Validade da CNH\n\nQuer prosseguir?","Cadastro de Cliente",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (comecarCadastro == 1 || comecarCadastro == -1){
            return;
        }

        //string declaradas com "" pra dar certo no while e tratamento de erros
        //o null é caso ele aperte no X e queira sair

        String nomeCliente = "";
        while (nomeCliente.trim().isEmpty()){
            nomeCliente = JOptionPane.showInputDialog(null, "Insira seu nome completo:", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (nomeCliente == null) return;
            if (nomeCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"O nome não pode ficar vazio!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        String cpfCliente = "";
        while (cpfCliente.trim().isEmpty()){
            cpfCliente = JOptionPane.showInputDialog(null, "Insira seu CPF:\n Modelo: 000.000.000-00", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (cpfCliente == null) return;
            if (cpfCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"O CPF não pode ficar vazio!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        String telefoneCliente = "";
        while (telefoneCliente.trim().isEmpty()){
            telefoneCliente = JOptionPane.showInputDialog(null, "Insira seu telefone:\n Modelo: (DDD 90000-0000)", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (telefoneCliente == null) return;
            if (telefoneCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"O telefone não pode ficar vazio!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        String emailCliente = "";
        while (emailCliente.trim().isEmpty()){
            emailCliente = JOptionPane.showInputDialog(null, "Insira seu e-mail de contato:", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (emailCliente == null) return;
            if (emailCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"O e-mail não pode ficar vazio!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        String enderecoCliente = "";
        while (enderecoCliente.trim().isEmpty()){
            enderecoCliente = JOptionPane.showInputDialog(null, "Insira seu endereço:\n Modelo: Nome da rua, nº da casa - Nome do bairro - Nome da Cidade", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (enderecoCliente == null) return;
            if (enderecoCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"O endereço não pode ficar vazio!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        String cnhCliente = "";
        while (cnhCliente.trim().isEmpty()){
            cnhCliente = JOptionPane.showInputDialog(null, "Digite o n° de Registro da CNH:", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (cnhCliente == null) return;
            if (cnhCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"O Registro da CNH não pode ficar vazio!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        String validadeCnhCliente = "";
        while (validadeCnhCliente.trim().isEmpty()){
            validadeCnhCliente = JOptionPane.showInputDialog(null, "Digite a data de validade da CNH:\n Modelo: dd/mm/aaaa", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

            if (validadeCnhCliente == null) return;
            if (validadeCnhCliente.trim().isEmpty()) JOptionPane.showMessageDialog(null,"A data de validade não pode ficar vazia!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
        }

        LocalDateTime datahora = LocalDateTime.now();
        DateTimeFormatter datahoraFormatado = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        String dataCadastro = datahora.format(datahoraFormatado);

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente, emailCliente, enderecoCliente, cnhCliente, validadeCnhCliente, dataCadastro);
        clientes.add(cliente);

        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!\n" + cliente.toString(), "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

    }

    public void listarCliente(){

    }

    public void verificarCliente(){

    }
}
