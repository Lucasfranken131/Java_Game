import javax.swing.JFrame;

public class Screen extends JFrame {
    static int panelOnScreen = 1;

    public Screen() {
        // Define o título do JFrame
        setTitle("Meu JFrame");

        // Define o tamanho do JFrame
        setSize(1200, 800);

        // Define o comportamento padrão ao clicar no botão fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        // Centraliza o JFrame na tela
        setLocationRelativeTo(null);
        TitleScreen titulo = new TitleScreen();
        add(titulo);
    }

    public static void setPanelOnScreen(int value) {
        panelOnScreen = value;
    }
}
