import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by AnQ on 2017/01/06.
 */
public class AppletTest extends Applet implements ActionListener, MouseListener, MouseMotionListener{

    boolean flag;
    boolean pflag = false;
    boolean rflag = true;
    int ux;
    int x = 0, y = 0;
    int x2, y2;
    int x3, y3;
    int x_press = 0, y_press = 0;
    int x_release = 0, y_release = 0;
    Image uma, ninjin;

    public void init(){
        x2 = 20;
        y2 = 20;
        x3 = 200;
        y3 = 200;

        System.out.println("init");
        Button b1 = new Button("表示");
        add(b1);
        b1.setActionCommand("b1");
        Button b2 = new Button("非表示");
        add(b2);
        b2.setActionCommand("b2");
        b1.addActionListener(this);
        b2.addActionListener(this);

        addMouseListener(this);
        addMouseMotionListener(this);
        uma = getImage(getClass().getResource("uma.gif"));
        ninjin = getImage(getClass().getResource("ninjin.gif"));
    }
    public void paint(Graphics g){
        System.out.println("paint");
        if (flag){
            g.setColor(Color.BLUE);
            g.drawOval(x, y, 20, 20);
        }
        if(rflag){
            System.out.println(rflag);
            System.out.println(!rflag);
            g.drawImage(uma, x3, y3, this);
        }
        g.drawImage(ninjin, x2, y2, this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("actionPerformed");
        String cmd = e.getActionCommand();
        System.out.println(cmd);
        if(cmd.equals("b1")){
            flag = true;
        }
        else{
            flag = false;
        }
        repaint();
    }
    public void start(){
        System.out.println("start");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void destroy(){
        System.out.println("destroy");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
        x = e.getX();
        y = e.getY();
        x_press = e.getX();
        y_press = e.getY();
        System.out.println(x_press);
        System.out.println(y_press);
        if(x2 <= x_press && x_press <= x2+100 && y2 <= y_press && y_press <= y2+100){
            pflag = true;
        }
        else{
            pflag = false;
        }
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
        x_release = e.getX();
        y_release = e.getY();
        System.out.println(x_release);
        System.out.println(y_release);
        if(pflag
                && x3 <= x_release && x_release <= x3+200 && y3 <= y_release && y_release <= y3+200){
            rflag = false;
        }
//        else{
//            rflag = true;
//        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged");
        x = e.getX();
        y = e.getY();

        if (pflag){
            x2 = e.getX();
            y2 = e.getY();
        }
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moved");
        x = e.getX();
        y = e.getY();
        repaint();
    }
}
