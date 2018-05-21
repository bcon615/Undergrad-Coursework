import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel
{
    private int count;
    private JButton pushInc;
    private JButton pushDec;
    private JLabel label;

    public PushCounterPanel()
    {
        count = 50;

        pushInc = new JButton("Increase Me!");
        pushInc.addActionListener(new BtnIncrementListener());
        add(pushInc);

        pushDec = new JButton("Decrease Me!");
        pushDec.addActionListener(new BtnDecrementListener());
        add(pushDec);

        label = new JLabel("Pushes: " + count);
        add(label);

        setBackground(Color.green);
        setPreferredSize(new Dimension(300, 60));
    }

    private class BtnIncrementListener implements  ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Pushes: " + count);
        }
    }

    private class BtnDecrementListener implements  ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count--;
            label.setText("Pushes: " + count);
        }
    }
}
