package JS05_DrawingRefactor;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            AlgoFrame frame = new AlgoFrame("title", 500, 500);
        });
    }
}
