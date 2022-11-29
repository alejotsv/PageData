import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PageData extends JFrame implements ActionListener, Runnable {
    Runnable {

        Thread runner;
        String[] headers = { "Content-Length", "Content-Type", "Date", "Public", "Expires", "Last-Modified", "Server" };
        URL page;
        JTextField url;
        JLabel[] headerLabel = new JLabel[7];

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void run() {

    }
}
