package Homework_5;

import java.util.Scanner;

import Homework_5.Interface.CalculatorPresenter;
import Homework_5.Interface.CalculatorView;

public class ConsoleCalculatorView implements CalculatorView {
    private CalculatorPresenter presenter;
    private Scanner scanner;

    public ConsoleCalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(CalculatorPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showResult(double result) {
        System.out.println("Result: " + result);
    }

    public void start() {
        while (true) {
            System.out.print("Введите выражение или \"exit\" для выхода: ");
            String expression = scanner.nextLine();
            if (expression.equals("exit")) {
                break;
            }
            presenter.calculateExpression(expression);
        }
    }
}
