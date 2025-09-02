import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame {
    public StartFrame() {
        setTitle("Snake Game - Start");
        setSize(400, 400);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        getContentPane().setBackground(Color.BLACK);

        JLabel title = new JLabel("Welcome to Snake Game!", SwingConstants.CENTER);
        title.setFont(new Font("Helvetica", Font.BOLD, 20));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Game");
        startButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        add(startButton, BorderLayout.SOUTH);
        panel.add(Box.createVerticalGlue());

        // when clicked open game
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // close start screen
                SnakeGame snakeGame = new SnakeGame(); // open game window
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StartFrame();
    }
}
