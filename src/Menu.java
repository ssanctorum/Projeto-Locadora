import javax.swing.*;

public class Menu {

    //layouts para o joptionpane
    static final String menuPrincipal = "————— LOCADORA DE VEÍCULOS —————\n" +
            "Escolha qual painel deseja utilizar:\n" +
            "[1] - Cliente\n" +
            "[2] - Funcionário\n" +
            "[3] - Veículos\n" +
            "[0] - Sair\n";

    static final String menuCliente = "————— LOCADORA DE VEÍCULOS —————\n"+
            "— Painel do Cliente —\n" +
            "[1] - Cadastrar-se\n" +
            "[2] - Listar clientes\n" +
            "[3] - Verificar cliente\n" +
            "[0] - Voltar ao menu\n";

    static final String menuFuncionario = "————— LOCADORA DE VEÍCULOS —————\n"+
            "— Painel do Funcionário —\n" +
            "[1] - Admissão de funcionário\n" +
            "[2] - Listar funcionários\n" +
            "[3] - Remover funcionário\n" +
            "[0] - Voltar\n";

    static final String menuVeiculo = "————— LOCADORA DE VEÍCULOS —————\n"+
            "— Painel de Veículos —\n" +
            "[1] - Cadastrar veículo\n" +
            "[2] - Listar frota\n" +
            "[3] - Pesquisar por Placa\n" +
            "[0] - Voltar\n";


    public static void main (String[] args){
        int opcaoLoop = -1;

        do {
            try {
                String entradaMenu = JOptionPane.showInputDialog(null, menuPrincipal, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
                // ele vem primeiro caso o user cancele a açao ou aperte no x da janela
                if (entradaMenu == null){
                    return;
                }

                // o trim vem depois pq caso trimme antes de verificar null ele quebra
                entradaMenu = entradaMenu.trim();
                if (entradaMenu.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nada!");
                    continue;
                }


                int entradaMenuInt = Integer.parseInt(entradaMenu);

                switch (entradaMenuInt) {

                    case 1:
                        System.out.println("Menu cliente");
                        break;

                    case 2:
                        System.out.println("Menu funcionario");
                        break;

                    case 3:
                        System.out.println("teste3");
                        break;

                    case 0:
                        System.out.println("saindo");
                        opcaoLoop = 0;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema, tente novamente.\nErro: "+ e.getMessage());
            }

        } while (opcaoLoop != 0);
    }
}
