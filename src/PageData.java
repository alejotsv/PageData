import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PageData extends JFrame implements ActionListener, Runnable {

        Thread runner;
        String[] headers = { "Content-Length", "Content-Type", "Date", "Public", "Expires", "Last-Modified", "Server" };
        URL page;
        JTextField url;
        JLabel[] headerLabel = new JLabel[7];
        JTextField[] header = new JTextField[7];
        JButton readPage, clearPage, quitLoading;
        JLabel status;

        public PageData

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void run() {

    }
}
