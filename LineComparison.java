package com.company1.LineComparisonComputationUsingOOps;

import java.util.Scanner;

public class LineComparison {

    //variables
    public double pointX2;
    public  double pointX1;
    public double pointY2;
    public double pointY1;
    public double line1;
    public double line2;

    public void getUserInputForLine(){
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter line X1 coordinate : ");
        pointX1 = scanInput.nextDouble();
        System.out.print("Enter line X2 coordinate : ");
        pointX2 = scanInput.nextDouble();
        System.out.print("Enter line Y1 coordinate : ");
        pointY1 = scanInput.nextDouble();
        System.out.print("Enter line Y2 coordinate : ");
        pointY2 = scanInput.nextDouble();
    }


    public double lengthOfLine1() {
        // using Math.pow and Math.sqrt method
        line1=Math.sqrt(
                (Math.pow((pointX2-pointX1), 2))
                        +
                        (Math.pow(pointY2-pointY1, 2))
        );
        return line1;

    }
    public double lengthOfLine2() {
        // using Math.pow and Math.sqrt method
        line2=Math.sqrt(
                (Math.pow((pointX2-pointX1), 2))
                        +
                        (Math.pow(pointY2-pointY1, 2))
        );
        return line2;

    }


}
