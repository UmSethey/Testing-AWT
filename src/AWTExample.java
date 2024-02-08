import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        frame.setSize(300, 200);

        Button button = new Button("Click me!");
        Label label = new Label("Hello, world!");

        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }
}
