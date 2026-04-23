package io.github.zawmoewai206.view;


import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    private JTextField display;
    private JButton[] numberButtons;
    private JButton addBtn, subBtn, mulBtn, divBtn, eqBtn, clearBtn;

    public CalculatorView() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
        }

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        eqBtn = new JButton("=");
        clearBtn = new JButton("C");

        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(mulBtn);
        panel.add(divBtn);
        panel.add(eqBtn);
        panel.add(clearBtn);

        add(panel, BorderLayout.CENTER);
    }

    // getters
    public JTextField getDisplay() { return display; }
    public JButton[] getNumberButtons() { return numberButtons; }
    public JButton getAddBtn() { return addBtn; }
    public JButton getSubBtn() { return subBtn; }
    public JButton getMulBtn() { return mulBtn; }
    public JButton getDivBtn() { return divBtn; }
    public JButton getEqBtn() { return eqBtn; }
    public JButton getClearBtn() { return clearBtn; }
}
