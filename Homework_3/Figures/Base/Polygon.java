package Homework_3.Figures.Base;

import Homework_3.Figures.Interface.Figure;
import Homework_3.Figures.Interface.Perimeterable;

public abstract class Polygon implements Figure, Perimeterable {
        protected int[] sides;
        protected Polygon(int[] sides){
            this.sides = sides;
        }
        public double perimeter(){
            int sum = 0;
            for(int side : sides)
                sum += side;
            return sum;
        }
}
