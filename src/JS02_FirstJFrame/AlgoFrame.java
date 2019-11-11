package JS02_FirstJFrame;

import javax.swing.*;

public class AlgoFrame extends JFrame {

    private int canvasWidth;
    private int canvasHeight;

    // 构造函数
    public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
        super(title);// new JFrame(title)

        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;

        setSize(canvasWidth, canvasHeight);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        setVisible(true);

    }

    // 默认
    public AlgoFrame(String title) {
        this(title, 1024, 768);
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }
}
