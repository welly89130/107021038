import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class feed extends JLabel implements Runnable{
    private ImageIcon icons[] = new ImageIcon [3];
    private Timer t1;
    private int x, y, z;
    private Boolean flag = false;
    public feed () {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        icons[0]= new ImageIcon("feed.jpg");

        x = rand.nextInt(720)+50;
        y = rand.nextInt(400)+50;
        z = rand.nextInt(3);
        System.out.println("z = "+ z);

        this.setBounds(x, y, 300, 400);

        Image img1 = icons[0].getImage();
        Image img2 = img1.getScaledInstance(120, 60, Image.SCALE_SMOOTH);
        icons[0].setImage(img2);



        this.setIcon(icons[z]);

        t1 = new Timer((rand.nextInt(5)+1) * 100, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(flag){
                    if(y+5 >= 820){
                        flag = false;
                    }else {
                        y += 5;
                    }
                }else{
                    if(y-5 < 0){
                        flag = true;
                    }else {
                        y -= 5;
                    }
                }
                feed.this.setLocation(x, y);
            }
        });
    }
    public void run(){
        t1.start();
    }
}
