import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
class LabExample extends JFrame {
    JButton button1 = new JButton(" AC Milan");
    JButton button2 = new JButton(" Real Madrid");
    private int nmilan = 0;
    private int nmadrid = 0;
    private String last = "N/A";
    private String winner = "DRAW";
    JLabel label2 = new JLabel("Last scorer: "+last);
    JLabel label3 = new JLabel("Winner: "+winner);
    JLabel label1 = new JLabel("Result: "+ nmilan +" X "+ nmadrid);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JPanel[] panel = new JPanel[8];
    public LabExample() {
        setLayout(new GridLayout(4,2));
        setSize(500,300);
        button1.setBackground(Color.RED);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);

        for(int i = 0 ; i < panel.length ; i++) {
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(255,255,255));
            add(panel[i]);
        }
        panel[0].add(label1);
        panel[1].add(label2);
        panel[2].add(label3);
        panel[6].add(button1);
        panel[7].add(button2);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    nmilan++;
                    label1.setText("Result: "+ nmilan +" X "+ nmadrid);
                    last = "AC Milan";
                    label2.setText("Last scorer: "+last);
                    if ((nmadrid<nmilan)) label3.setText("Winner: " +last);
                    else if ((nmadrid==nmilan)) label3.setText("Winner: DRAW");
                }
                catch(Exception e) {}
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    nmadrid++;
                    label1.setText("Result: "+ nmilan +" X "+ nmadrid);
                    last = "Real Madrid";
                    label2.setText("Last scorer: "+last);
                    if ((nmadrid>nmilan)) label3.setText("Winner: " +last);
                    else if ((nmadrid==nmilan)) label3.setText("Winner: DRAW");
                }
                catch(Exception e) {}
            }
        });
//12
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args) {
        new LabExample().setVisible(true);
    }
}
