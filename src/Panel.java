import javax.swing.*;
import java.awt.*;

/**
 * @program: Panel
 * @description:
 * @author: xiemu
 * @create: -08-31 20:59
 **/
public class Panel extends JPanel {

    public void paint(Graphics g) {
        new ImageIcon("img/snake.jpg").paintIcon(this,g,200,11);
        g.fillRect(45,100,800,500);
        System.out.println("d");
        g.setColor(Color.RED);
        g.setFont(new Font("微软雅黑",Font.BOLD,80));
        g.drawString("真不戳！",320,340);

        g.setColor(Color.RED);
        g.setFont(new Font("微软雅黑",Font.BOLD,40));
        g.drawString("第一个窗口实现了！",290,180);

    }


}
