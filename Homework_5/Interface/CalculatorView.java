package Homework_5.Interface;

public interface CalculatorView {
    void setPresenter(CalculatorPresenter presenter);
    void showResult(double result);
    void start();
}
