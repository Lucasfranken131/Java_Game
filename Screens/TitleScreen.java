package Screens;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Items.Bolsa.Bag;
import Maps.Initial;
import Players.Player;
import javax.swing.*;


public class TitleScreen extends JPanel {
    public TitleScreen() {
        // Adiciona um rótulo ao JFrame
        JPanel panel = new JPanel();

        JButton new_game = new JButton("Novo Jogo");
        JButton load_game = new JButton("Carregar Jogo");
        JButton credits = new JButton("Créditos");
        JButton close = new JButton("Sair");
        add(panel);
        panel.add(new_game);
        panel.add(load_game);
        panel.add(credits);
        panel.add(close);
        panel.revalidate();
        panel.repaint();

        JLabel labelUsuario = new JLabel("Nome do seu personagem:");
        JTextField nameTextField = new JTextField(15);
        JButton send = new JButton(">");

        new_game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão for clicado
                panel.removeAll();
                setVisible(true);
                panel.add(labelUsuario);
                panel.add(nameTextField);
                panel.add(send);
                
                panel.revalidate();
                panel.repaint();

                send.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Screen.setPanelOnScreen(2);
                        String name = nameTextField.getText();
                        Bag bolsa = new Bag();
                        Player player = new Player(name, 50, 50, 10, 10, 10, 10, 10, 1, bolsa);
                        Initial initial = new Initial(5, 12, "up", player);
                    }
                });
            }
        });

        load_game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(new_game);
                panel.remove(load_game);
                panel.remove(credits);
                panel.remove(close);

                panel.revalidate();
                panel.repaint();
            }
        });
    } 
}
