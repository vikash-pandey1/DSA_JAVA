package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final int DOT_SIZE = 10;
    private static final int TOTAL_DOTS = (WIDTH * HEIGHT) / (DOT_SIZE * DOT_SIZE);
    private static final int RAND_POS = WIDTH / DOT_SIZE;
    private static final int DELAY = 100;
    
    private int[] x = new int[TOTAL_DOTS];
    private int[] y = new int[TOTAL_DOTS];
    
    private int dots;
    private int appleX;
    private int appleY;
    
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;
    
    public SnakeGame() {
        initGame();
        addKeyListener(new MyKeyAdapter());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setResizable(false);
        pack();
        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void initGame() {
        dots = 3;
        
        for (int i = 0; i < dots; i++) {
            x[i] = 50 - i * DOT_SIZE;
            y[i] = 50;
        }
        
        locateApple();
        
        Timer timer = new Timer(DELAY, new GameCycle());
        timer.start();
    }
    
    private void locateApple() {
        int r = (int) (Math.random() * RAND_POS);
        appleX = r * DOT_SIZE;
        
        r = (int) (Math.random() * RAND_POS);
        appleY = r * DOT_SIZE;
    }
    
    private void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++;
            locateApple();
        }
    }
    
    private void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        
        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }
        
        if (rightDirection) {
            x[0] += DOT_SIZE;
        }
        
        if (upDirection) {
            y[0] -= DOT_SIZE;
        }
        
        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }
    
    private void checkCollision() {
        for (int i = dots; i > 0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        
        if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
            inGame = false;
        }
        
        if (!inGame) {
            // Game over logic
        }
    }
    
    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            
            if (key == KeyEvent.VK_LEFT && !rightDirection) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }
            
            if (key == KeyEvent.VK_RIGHT && !leftDirection) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }
            
            if (key == KeyEvent.VK_UP && !downDirection) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
            
            if (key == KeyEvent.VK_DOWN && !upDirection) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
    }
    
    private class GameCycle implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (inGame) {
                checkApple();
                checkCollision();
                move();
            }
            
            repaint();
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        if (inGame) {
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, DOT_SIZE, DOT_SIZE);
            
            for (int i = 0; i < dots; i++) {
                g.setColor(Color.black);
                g.fillRect(x[i], y[i], DOT_SIZE, DOT_SIZE);
            }
            
            Toolkit.getDefaultToolkit().sync();
        } else {
            // Game over screen
        }
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SnakeGame();
            frame.setVisible(true);
        });
    }
}

