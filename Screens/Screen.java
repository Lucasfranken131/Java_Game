package Screens;
import javax.swing.JFrame;

public class Screen extends JFrame {

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
        revalidate();
        repaint();
        switchScreen(1);
    }

    public void setPanelOnScreen(int value) {
        switchScreen(value);
    }

    public void switchScreen(int panelOnScreen) {
        switch (panelOnScreen) {
            case 1:          
                TitleScreen titulo = new TitleScreen(this);
                add(titulo);
                break;
            case 2:
                MapScreen map = new MapScreen(this);
                add(map);
                break;
        }
    }
}
