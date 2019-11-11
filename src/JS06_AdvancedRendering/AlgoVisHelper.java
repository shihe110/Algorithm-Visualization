package JS06_AdvancedRendering;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoVisHelper {

    public AlgoVisHelper() {}

    // 设置线宽
    public static void setStrokeWidth(Graphics2D g, int w) {
        int strokeWidth = w;
        g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
    }
    // 设置颜色
    public static void setColor(Graphics2D g, Color color) {
        g.setColor(color);
    }
    // 画空心圆  参数：g对象及圆心和半径
    public static void strokeCircle(Graphics2D g, int x, int y, int r) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);// 包维盒的左上角坐标，长，宽
        g.draw(circle);
    }
    // 实心圆
    public static void fillCircle(Graphics2D g, int x, int y, int r) {
        Ellipse2D.Double fillCircle = new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
        g.draw(fillCircle);
    }
}
