import java.awt.*;
import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;
    JButton pauseButton;

    SnakeGame(){
        board = new Board();
        add(board, BorderLayout.CENTER);

        // Pause Button
        pauseButton = new JButton("Pause");
        add(pauseButton, BorderLayout.SOUTH);

        pauseButton.addActionListener(_ -> {
            board.togglePause();
            if(board.paused){
                pauseButton.setText("Resume");
            } else {
                pauseButton.setText("Pause");
            }
        });

        pack();
        setResizable(false);
        setVisible(true);
        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board.loadImages();
        board.initGame();
    }

    public static void main(String[] args){
        new SnakeGame();
    }
}
