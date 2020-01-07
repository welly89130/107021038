import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class fish extends JLabel implements Runnable{
    private ImageIcon icons[] = new ImageIcon [3];
    private Timer t1;
    private int x, y, z;
    private Boolean flag = false;
    public fish() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        icons[0]= new ImageIcon("fish1.png");
        icons[1]= new ImageIcon("fish2.png");
        icons[2]= new ImageIcon("fish3.png");

        x = rand.nextInt(720)+50;
        y = rand.nextInt(400)+50;
        z = rand.nextInt(3);
        System.out.println("z = "+ z);

        this.setBounds(x, y, 300, 400);

        Image img1 = icons[0].getImage();
        Image img2 = img1.getScaledInstance(120, 60, Image.SCALE_SMOOTH);
        icons[0].setImage(img2);

        img1 = icons[1].getImage();
        img2 = img1.getScaledInstance(120, 60, Image.SCALE_SMOOTH);
        icons[1].setImage(img2);

        img1 = icons[2].getImage();
        img2 = img1.getScaledInstance(120, 60, Image.SCALE_SMOOTH);
        icons[2].setImage(img2);

        this.setIcon(icons[z]);

        t1 = new Timer((rand.nextInt(5)+1) * 100, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(flag){
                    if(x+5 >= 820){
                        flag = false;
                    }else {
                        x += 5;
                    }
                }else{
                    if(x-5 < 0){
                        flag = true;
                    }else {
                        x -= 5;
                    }
                }
                fish.this.setLocation(x, y);
            }
        });
    }
    public void run(){
        t1.start();
    }
}