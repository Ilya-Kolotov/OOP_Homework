package Homework_3.FigureArray;

import java.util.ArrayList;
import java.util.Comparator;

import Homework_3.Figures.Interface.Figure;
import Homework_3.Figures.Interface.Lengthable;
import Homework_3.Figures.Interface.Perimeterable;

public class FigureCollection {
    ArrayList<Figure> figureList;
    public FigureCollection(){
        this.figureList = new ArrayList<Figure>();
    }
    public void getFiguresParametrs(){
        for(Figure i : figureList){
            System.out.println(i);
            System.out.println(String.format("Площадь: %f", i.area()));
            if(i instanceof Perimeterable){
            Perimeterable perimeterable = (Perimeterable)i;
            System.out.println(String.format("Периметр: %f", perimeterable.perimeter()));
            }
            if(i instanceof Lengthable){
            Lengthable lengthable = (Lengthable)i;
            System.out.println(String.format("Длина окружности: %f", lengthable.length()));
            }
            System.out.println();
        }
    }
    public void addFigure(Figure newFigure){
        figureList.add(newFigure);
    }

    public void delFigure(int figureIndex){
        figureList.remove(figureIndex);
    }

    public void changesFigure(int figureIndex, Figure newFigure){
        figureList.set(figureIndex, newFigure);
    }
    
    public void sortFigure(){
        figureList.sort(Comparator.comparing(Figure::area));
    }
}
