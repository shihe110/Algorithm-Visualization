package JS06_AdvancedRendering;

import javax.swing.*;
import java.awt.*;

public class AlgoFrame extends JFrame {

    /**
     * JFrame 窗口
     * MenuBar 工具栏
     * Jpanel 面板
     */
    private int canvasWidth;
    private int canvasHeight;

    // 构造函数 创建窗口
    public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
        super(title);// new JFrame(title)

        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;

        //setSize(canvasWidth, canvasHeight);
        // 创建画布/板
        AlgoCanvas canvas = new AlgoCanvas();
        //canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
        setContentPane(canvas);// 设置内容面板
        pack();// 根据窗口的内容重新布局  防止出现画板和窗口大小不同 的显示异常



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

    // 设置画布（画板）  区别于窗口
    private class AlgoCanvas extends JPanel {

        // 开启双缓存
        public AlgoCanvas() {
            super(true);
        }

        // 绘制组件
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D)g;

            // 抗锯齿
            RenderingHints hints = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.addRenderingHints(hints);

            // 具体绘制
            AlgoVisHelper.setColor(g2d, Color.BLUE);
            AlgoVisHelper.fillCircle(g2d, canvasWidth/2,canvasHeight/2,200);

            AlgoVisHelper.setStrokeWidth(g2d,5);
            AlgoVisHelper.setColor(g2d, Color.RED);
            AlgoVisHelper.strokeCircle(g2d, canvasWidth/2,canvasHeight/2,200);
        }

        // 获取画布大小
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth, canvasHeight);
        }
    }
}
