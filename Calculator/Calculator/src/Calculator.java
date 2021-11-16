import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;

public class Calculator implements ActionListener {

    ImageIcon icon;
    JFrame frame = new JFrame("Calculator");
    JPanel answerPanel = new JPanel();
    JPanel numberPanel;
    JLabel text = new JLabel();
    JButton[] buttons = new JButton[10];
    JButton add, sub, mul, div, equ, dec, del, clr;
    JButton[] funcButtons = new JButton[8];
    Font font = new Font("Courier New", Font.BOLD, 50);
    JTextField textfield;

    Calculator() {

        Border whiteLineBorder = BorderFactory.createLineBorder(frame.getBackground(), 20);

        // MainFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        icon = new ImageIcon("C:/Users/Ummad/OneDrive/Desktop/SP/Calculator/Calculator/src/vector-calculator-icon.jpg");
        frame.setIconImage(icon.getImage());
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield = new JTextField();
        textfield.setFont(font);
        textfield.setBounds(50,25,680,100);
        textfield.setEditable(false);

        // functionButtons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        dec = new JButton(".");
        equ = new JButton("=");
        del = new JButton("DEL");
        clr = new JButton("CLR");

        funcButtons[0] = add;
        funcButtons[1] = sub;
        funcButtons[2] = mul;
        funcButtons[3] = div;
        funcButtons[4] = dec;
        funcButtons[5] = equ;
        funcButtons[6] = del;
        funcButtons[7] = clr;

        for (int i = 0; i < 8; i++) {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(font);
            funcButtons[i].setFocusable(false);
        }

        del.setBounds(400, 650, 200, 50);
        clr.setBounds(200, 650, 200, 50);

        numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4, 4, 5, 5));
        numberPanel.setBounds(50, 100, 100, 100);
        numberPanel.setBackground(Color.yellow);

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].setFont(font);
            numberPanel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        frame.add(del);
        frame.add(clr);
        frame.add(textfield);
        frame.add(numberPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clr) {
            textfield.setText("0");
        }

    }

}
