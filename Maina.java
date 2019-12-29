import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Maina extends JFrame {
    private Container cp;
    private Image img = Toolkit.getDefaultToolkit().getImage("backimage.jpg");
    private JPanel jpn;
    private JPanel ctlPane = new JPanel(new GridLayout(1, 3, 1, 1));
    private JButton jbtnAdd = new JButton ("Add");
    private JButton jbtnFeed = new JButton ("aaa");
    private JButton jbtnExit = new JButton ("Exit");
    private Arraylist<Fish> fishList = new ArrayList<Fish>();

    public Maina(){
        init();
    }
    private void init (){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(1, 1));
        jpn = new JPanel (){
            @Override
            public void painComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(img, 0, 0, null);
                this.repaint();
            }
        };
        jpn.setLayout(null);
        cp.add(jpn, BorderLayout.CENTER);
        pack();
        this.setDefaultcloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 920, 620);
        this.setResizable(false);
        ctlPane.add(jbtnAdd);
        ctlPane.add(jbtnFeed);
        ctlPane.add(jbtnExit);
        cp.add(ctlPane, BorderLayout.SOUTH);
        jbtnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Fish tmpFish = new Fish ();
                fishList.add(tmpFish);
                jpn.add(tmpFish);
            }
        });
        jbtnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
    }
}