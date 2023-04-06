package Homework_5;

import Homework_5.Interface.CalculatorPresenter;
import Homework_5.Interface.CalculatorView;

public class Program {
    public static void main(String[] args) {
        CalculatorView view = new ConsoleCalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(view);
        view.setPresenter(presenter);
        view.start();
    }
}
