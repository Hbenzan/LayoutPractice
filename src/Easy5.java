import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.PrivateKey;

public class Easy5 implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JLabel statusLabel1;
        private JLabel statusLabel2;
        private JLabel statusLabel3;
        private JLabel statusLabel4;
        private JTextArea ta; // Text area in the middle
        private JPanel controlPanel;
        private JPanel gamePanel;
        private JPanel hayesPanel;
        private JPanel practicePanel;
        private JPanel miamiPanel;
        private JMenuBar mb;
        private JMenu file, edit, help;
        private JMenuItem cut, copy, paste, selectAll;
        private int WIDTH=800;
        private int HEIGHT=700;


        public Easy5() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Easy5 Easy5 = new Easy5();
            Easy5.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Hard Example");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());

            //menu at top
            cut = new JMenuItem("cut");
            copy = new JMenuItem("copy");
            paste = new JMenuItem("paste");
            selectAll = new JMenuItem("selectAll");
            cut.addActionListener(this);
            copy.addActionListener(this);
            paste.addActionListener(this);
            selectAll.addActionListener(this);

            // Adding JTextArea in the middle
            ta = new JTextArea();
            ta.setRows(3); // Adjust rows for size
            ta.setColumns(20); // Adjust columns for width

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


//            mainFrame.add(ta);
//            mainFrame.add(mb);  //add menu bar
//            mainFrame.add(ta);//add typing area
//            mainFrame.setJMenuBar(mb); //set menu bar

            statusLabel = new JLabel("Label", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            statusLabel1 = new JLabel("Label1", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            statusLabel2 = new JLabel("Label2", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            statusLabel3 = new JLabel("Label3", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            statusLabel4 = new JLabel("Label4", JLabel.CENTER);
            statusLabel.setSize(350, 100);



            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(1,9)); //set the layout of the panel

            gamePanel = new JPanel();
            gamePanel.setLayout(new GridLayout(3,3));

            hayesPanel = new JPanel();
            hayesPanel.setLayout(new GridLayout(2,1));

            practicePanel = new JPanel();
            practicePanel.setLayout(new GridLayout(1,2));

            miamiPanel = new JPanel();
            miamiPanel.setLayout(new GridLayout(2,1));

            ta = new JTextArea();
            ta.setBounds(300, 5, WIDTH-100, HEIGHT-100);


            practicePanel.add(gamePanel);
            practicePanel.add(hayesPanel);
            miamiPanel.add(practicePanel);
//
            mainFrame.add(controlPanel, BorderLayout.SOUTH);
            mainFrame.add(miamiPanel, BorderLayout.CENTER);
            miamiPanel.add(ta);
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
           JButton claireButton = new JButton("claireButton");
            JButton bootsButton = new JButton("bootsButton");
            JButton ibutton = new JButton("ibutton");


            okButton.setActionCommand("OK");
            submitButton.setActionCommand("Submit");
            cancelButton.setActionCommand("Cancel");

            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());

//            controlPanel.add(okButton,BorderLayout.NORTH);
//            controlPanel.add(statusLabel);
//            mainFrame.add(cancelButton, BorderLayout.EAST);
            controlPanel.add(statusLabel1);
            controlPanel.add(benzButton);
            controlPanel.add(statusLabel);
            controlPanel.add(helpButton);
            controlPanel.add(statusLabel2);
            controlPanel.add(chloeButton);
            controlPanel.add(statusLabel3);
            controlPanel.add(apButton);
            controlPanel.add(statusLabel4);
////            controlPanel.add(helpButton);
//            controlPanel.add(bootsButton, BorderLayout. SOUTH);

            JLabel statuslabel5 = new JLabel("Label5", JLabel.CENTER);
            statuslabel5.setSize(350, 100);

            JLabel statuslabel6 = new JLabel("Label6", JLabel.CENTER);
            statuslabel6.setSize(350, 100);

            JLabel statuslabel7 = new JLabel("Label7", JLabel.CENTER);
            statuslabel7.setSize(350, 100);

            JLabel statuslabel8 = new JLabel("Label8", JLabel.CENTER);
            statuslabel8.setSize(350, 100);

            JLabel statuslabel9 = new JLabel("Label9", JLabel.CENTER);
            statuslabel9.setSize(350, 100);

            JLabel statuslabel10 = new JLabel("Label10", JLabel.CENTER);
            statuslabel10.setSize(350, 100);


            gamePanel.add(statuslabel9);
            gamePanel.add(fionaButton);
            gamePanel.add(statuslabel5);
            gamePanel.add(cancelButton);
            gamePanel.add(statuslabel6);
            gamePanel.add(submitButton);
            gamePanel.add(statuslabel7);
            gamePanel.add(claireButton);
            gamePanel.add(statuslabel8);


            hayesPanel.add(statuslabel10);
            hayesPanel.add(ibutton);



//            mainFrame.add(controlPanel);
//            mainFrame.add(okButton);
//            mainFrame.add(submitButton);
//            mainFrame.add(benzButton);
//            mainFrame.add(helpButton);
////            mainFrame.add(statusLabel);
//            mainFrame.add(downButton);
//            mainFrame.add(apButton);
//            mainFrame.add(chloeButton);
//            mainFrame.add(fionaButton);

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
