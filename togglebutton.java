import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class togglebutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ToggleButton");
        frame.setSize(300,400);
        frame.setLayout(new FlowLayout());

        JToggleButton tb = new JToggleButton("Click me");
        JLabel label = new JLabel("Off");

        tb.addActionListener(e->{
            if(tb.isSelected()){
                label.setText("On");
            }else{
                label.setText("Off");
            }
        });

        frame.add(tb);
        frame.add(label);

        frame.setVisible(true);
    }
}
