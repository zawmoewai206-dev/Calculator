package io.github.zawmoewai206.controller;

import io.github.zawmoewai206.model.CalculatorModel;
import io.github.zawmoewai206.view.CalculatorView;

import javax.swing.*;

public class CalculatorController {

    private CalculatorView view;
    private CalculatorModel model;

    private String operator;
    private double firstNumber;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        initController();
    }

    private void initController() {

        // number buttons
        for (JButton btn : view.getNumberButtons()) {
            btn.addActionListener(e -> appendNumber(btn.getText()));
        }

        // operators
        view.getAddBtn().addActionListener(e -> setOperator("+"));
        view.getSubBtn().addActionListener(e -> setOperator("-"));
        view.getMulBtn().addActionListener(e -> setOperator("*"));
        view.getDivBtn().addActionListener(e -> setOperator("/"));

        // equals
        view.getEqBtn().addActionListener(e -> calculateResult());

        // clear
        view.getClearBtn().addActionListener(e -> clear());
    }

    private void appendNumber(String number) {
        view.getDisplay().setText(view.getDisplay().getText() + number);
    }

    private void setOperator(String op) {
        firstNumber = Double.parseDouble(view.getDisplay().getText());
        operator = op;
        view.getDisplay().setText("");
    }

    private void calculateResult() {
        try {
            double secondNumber = Double.parseDouble(view.getDisplay().getText());
            double result = model.calculate(firstNumber, secondNumber, operator);
            view.getDisplay().setText(String.valueOf(result));
        } catch (Exception e) {
            view.getDisplay().setText("Error");
        }
    }

    private void clear() {
        view.getDisplay().setText("");
        operator = null;
        firstNumber = 0;
    }
}