import javax.swing.*;
import java.awt.*;
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

        public PageData() {
            super("Page Data");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLookAndFeel();
            setLayout(new GridLayout(10,1));

//            Add first panel
            JPanel first = new JPanel();
            first.setLayout(new FlowLayout(FlowLayout.RIGHT));
            JLabel urlLabel = new JLabel("URL: ");
            url = new JTextField(22);
            urlLabel.setLabelFor(url);
            first.add(urlLabel);
            first.add(url);
            add(first);

//            Add second panel
            JPanel second = new JPanel();
            second.setLayout(new FlowLayout());
            readPage = new JButton("Read Page");
            clearPage = new JButton("Clear Fields");
            quitLoading = new JButton("Quit Loading");
            readPage.setMnemonic('r');
            clearPage.setMnemonic('c');
            quitLoading.setMnemonic('q');
            readPage.setToolTipText("Begin loading the web page");
            clearPage.setToolTipText("Clear all header fields below");
            quitLoading.setToolTipText("Quit loading the web page");
            readPage.setEnabled(true);
            clearPage.setEnabled(false);
            quitLoading.setEnabled(false);
            readPage.addActionListener(this);
            clearPage.addActionListener(this);
            quitLoading.addActionListener(this);
            second.add(readPage);
            second.add(clearPage);
            second.add(quitLoading);
            add(second);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void run() {

    }

    private static void setLookAndFeel(){
        try {
            // Set cross-platform Java L&F (also called "Nimbus")
            UIManager.setLookAndFeel("javax.swing.plaf.metal.NimbusLookAndFeel");
        }
        catch (UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }

}
