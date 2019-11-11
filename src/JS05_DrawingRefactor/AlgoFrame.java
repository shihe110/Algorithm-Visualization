package JS05_DrawingRefactor;

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

            Graphics2D g2d = (Graphics2D) g;

            /*g2d.setColor(Color.red);// 填充颜色
            int strokeWidth = 5;
            g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));// 设置笔划宽度
            Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 300, 300);
            g2d.draw(circle);

            g2d.setColor(Color.blue);
            Ellipse2D.Double circle2 = new Ellipse2D.Double(50, 50, 300, 300);
            g2d.fill(circle2);*/
            // 具体绘制
            AlgoVisHelper.setColor(g2d,Color.blue);
            AlgoVisHelper.fillCircle(g2d,canvasWidth/2,canvasHeight/2,200);

            AlgoVisHelper.setStrokeWidth(g2d, 5);
            AlgoVisHelper.setColor(g2d,Color.red);
            AlgoVisHelper.strokeCircle(g2d,canvasWidth/2, canvasHeight/2, 200);

        }

        // 获取画布大小
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth, canvasHeight);
        }
    }
}
