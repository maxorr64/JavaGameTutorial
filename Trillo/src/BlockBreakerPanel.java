import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics;

public class BlockBreakerPanel extends JPanel implements KeyListener {

    private ArrayList<Block> blocks;
    private Block ball;
    private Block paddle;
    private Animate animate;

    public BlockBreakerPanel() {
        paddle = new Block(175, 480, 150, 25, "paddle.png");
        blocks = new ArrayList<>();
        ball = new Block(237, 435, 25, 25, "block.png");
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            animate = new Animate(this);
            new Thread(() -> {
                while (true) {
                    update();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException err) {
                        System.out.println(err);
                    }
                }

            });
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void update() {

    }

    public void paintComponent(Graphics g) {
        paddle.draw(g, this);
    }

}