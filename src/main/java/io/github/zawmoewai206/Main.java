package io.github.zawmoewai206;

import io.github.zawmoewai206.model.CalculatorModel;
import io.github.zawmoewai206.view.CalculatorView;
import io.github.zawmoewai206.controller.CalculatorController;

public class Main {
    public static void main(String[] args) {

        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        new CalculatorController(view, model);

        view.setVisible(true);
    }
}
