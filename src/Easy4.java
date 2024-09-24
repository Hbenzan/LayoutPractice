import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

    public class Easy4 implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JLabel statusLabel1;
        private JPanel controlPanel;
        private JMenuBar mb;
        private JMenu file, edit, help;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
        private int WIDTH=800;
        private int HEIGHT=700;


        public Easy4() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Easy4 Easy4 = new Easy4();
            Easy4.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Example with border inside of grid layout");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new GridLayout(3,3));

            //menu at top
            cut = new JMenuItem("cut");
            copy = new JMenuItem("copy");
            paste = new JMenuItem("paste");
            selectAll = new JMenuItem("selectAll");
            cut.addActionListener(this);
            copy.addActionListener(this);
            paste.addActionListener(this);
            selectAll.addActionListener(this);

//            mb = new JMenuBar();
//            file = new JMenu("File");
//            edit = new JMenu("Edit");
//            help = new JMenu("Help");
//            edit.add(cut);
//            edit.add(copy);
//            edit.add(paste);
//            edit.add(selectAll);
//            mb.add(file);
//            mb.add(edit);
//            mb.add(help);
////            //end menu at top

            ta = new JTextArea();
            ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
//            mainFrame.add(mb);  //add menu bar
//            mainFrame.add(ta);//add typing area
//            mainFrame.setJMenuBar(mb); //set menu bar

            statusLabel = new JLabel("Label1", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            statusLabel1 = new JLabel("Label2", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new BorderLayout()); //set the layout of the panel
//
            mainFrame.add(controlPanel);
//            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }

        public void showEventDemo() {

            JButton okButton = new JButton("OK");
            JButton submitButton = new JButton("Submit");
            JButton cancelButton = new JButton("Cancel");
            JButton helpButton = new JButton("help");
//            JButton coolButton = new JButton("CoolButton");
            JButton benzButton = new JButton("benzButton");
            JButton downButton = new JButton("downButton");
            JButton apButton = new JButton("apButton");
            JButton chloeButton = new JButton("chloeButton");
            JButton fionaButton = new JButton("fionaButton");
//            JButton claireButton = new JButton("claireButton");
            JButton bootsButton = new JButton("bootsButton");



            okButton.setActionCommand("OK");
            submitButton.setActionCommand("Submit");
            cancelButton.setActionCommand("Cancel");

            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());

//            controlPanel.add(okButton,BorderLayout.NORTH);
            controlPanel.add(statusLabel);
            controlPanel.add(cancelButton, BorderLayout.EAST);
////            controlPanel.add(statusLabel1);
//            controlPanel.add(helpButton);
            controlPanel.add(bootsButton, BorderLayout. SOUTH);



            mainFrame.add(okButton);
            mainFrame.add(submitButton);
            mainFrame.add(benzButton);
            mainFrame.add(helpButton);
            mainFrame.add(controlPanel);
//            mainFrame.add(statusLabel);
            mainFrame.add(downButton);
            mainFrame.add(apButton);
            mainFrame.add(chloeButton);
            mainFrame.add(fionaButton);

            mainFrame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cut)
                ta.cut();
            if (e.getSource() == paste)
                ta.paste();
            if (e.getSource() == copy)
                ta.copy();
            if (e.getSource() == selectAll)
                ta.selectAll();
        }

        private class ButtonClickListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if (command.equals("OK")) {
                    statusLabel.setText("Ok Button clicked.");
                } else if (command.equals("Submit")) {
                    statusLabel.setText("Submit Button clicked.");
                } else {
                    statusLabel.setText("Cancel Button clicked.");
                }
            }
        }
    }
