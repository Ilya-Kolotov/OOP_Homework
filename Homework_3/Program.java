package Homework_3;

import Homework_3.Exceptions.IncorrectTriangleException;
import Homework_3.Exceptions.NegativeValueException;
import Homework_3.FigureArray.FigureCollection;
import Homework_3.Figures.Circle;
import Homework_3.Figures.Rectangle;
import Homework_3.Figures.Square;
import Homework_3.Figures.Triangle;

public class Program {
    public static void main(String[] args) throws NegativeValueException, IncorrectTriangleException, NumberFormatException{
        FigureCollection figureCollection = new FigureCollection();
        figureCollection.addFigure(new Circle());
        figureCollection.addFigure(new Rectangle());
        figureCollection.addFigure(new Triangle());
        figureCollection.addFigure(new Square());
        figureCollection.addFigure(new Square());
        figureCollection.getFiguresParametrs();
        System.out.println("___-");
        figureCollection.changesFigure(4, new Triangle());
        figureCollection.getFiguresParametrs();
        System.out.println("___-");
        figureCollection.delFigure(4);
        figureCollection.getFiguresParametrs();
        System.out.println("___-");
        figureCollection.sortFigure();
        figureCollection.getFiguresParametrs();
    }
}
