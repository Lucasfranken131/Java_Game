import java.util.Scanner;
import Items.Bolsa.Bag;
import Maps.Initial;
import Players.Player;
import System.ClearScreen;

public class TitleScreen {
    String title = 
    "===============================\r\n" + //
    "     Jogo Teste\r\n" + //
    "===============================\r\n" + //
    "      Escolha uma opção:\r\n" + //
    "      1 - Novo Jogo\r\n" + //
    "      2 - Carregar Jogo\r\n" + //
    "      3 - Créditos\r\n" + //
    "      0 - Sair\r\n" + //
    "===============================";

    public TitleScreen() {
        TitleCall();
    }

    public void TitleCall() {
        System.out.println(title);
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
    
        if(escolha == 1) {
            System.out.print("Insira o nome do personagem: ");
            String nome = scan.next();
            Bag bolsa = new Bag();
            ClearScreen.clrscr();
            Player player = new Player(nome, 50, 50, 10, 10, 10, 10, 10, 1, bolsa);
            Initial initial = new Initial(5, 12, "up", player);
        }
    }

}
