import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplikasi Inventaris Ormawa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new tampilan_dekstop()); // Menampilkan panel
            frame.pack(); // Mengatur ukuran sesuai komponen
            frame.setLocationRelativeTo(null); // Menengahkan jendela
            frame.setVisible(true); // Menampilkan frame
        });
    }
}
