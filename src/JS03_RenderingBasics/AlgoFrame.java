package JS03_RenderingBasics;

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
        // 绘制组件
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);// 继承父类所有特征
            g.drawOval(50, 50, 300, 300);// 个性化定制  画圆（椭圆）
        }

        // 获取画布大小
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth, canvasHeight);
        }
    }
}
