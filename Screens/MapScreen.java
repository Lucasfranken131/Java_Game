package Screens;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapScreen extends JPanel {
    Screen tela;
    public MapScreen(Screen tela) {
        this.tela = tela;
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, getWidth(), getHeight());
        add(panel);
        ImageIcon icon = new ImageIcon(getClass().getResource("initial.png")); 
        JLabel map = new JLabel();
        map.setIcon(icon);
        panel.add(map);
        panel.revalidate();
        panel.repaint();
    }
}
