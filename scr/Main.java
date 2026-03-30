import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dier hond = new Hond("Buddy", 80, 40);
            DierenFrame frame = new DierenFrame(hond);
            frame.setVisible(true);
        });
    }
}
