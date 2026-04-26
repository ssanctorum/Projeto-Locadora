import javax.swing.*;

public class Menu {

    public static void main (String[] args){
        int opcaoLoop = -1;

        Metodos metodos = new Metodos();

        do {
            try {
                String entradaMenu = JOptionPane.showInputDialog(null, Layouts_JOptionPane.menuPrincipal, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

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
                        metodos.menuCliente();
                        break;

                    case 2:
                        metodos.menuFuncionario();
                        break;

                    case 3:
                        metodos.menuVeiculo();
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
