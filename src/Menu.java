import javax.swing.*;

public class Menu {

    public static void main (String[] args){
        int opcaoLoop = -1;

        do {
            String menuPrincipal = "————— LOCADORA DE VEÍCULOS —————\n" +
                                   "Escolha qual painel deseja utilizar:\n" +
                                   "[1] - Cliente\n" +
                                   "[2] - Funcionário\n" +
                                   "[3] - Veículos\n" +
                                   "[0] - Sair\n";


            String entradaMenu = JOptionPane.showInputDialog(null, menuPrincipal, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
            int entradaMenuInt = Integer.parseInt(entradaMenu);


            switch (entradaMenuInt) {

                case 1:
                    System.out.println("teste1");
                    break;

                case 2:
                    System.out.println("teste2");
                    break;

                case 3:
                    System.out.println("teste3");
                    break;

                case 0:
                    System.out.println("saindo");
                    opcaoLoop = 0;
                    break;

            }
        } while (opcaoLoop != 0);
    }
}
