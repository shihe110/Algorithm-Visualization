package JS01_JavaSwingBasics;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // 事件队列
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Welcome");
            frame.setSize(500, 500);// 设置窗口大小
            frame.setResizable(false);// 大小是否可改变
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 点击关闭时动作
            frame.setVisible(true);// 是否可见
        });
    }
}
