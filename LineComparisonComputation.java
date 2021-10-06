package com.company1.LineComparisonComputationUsingOOps;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Comparison computation program");
        LineComparison calculateLength = new LineComparison();
        calculateLength.getUserInput();
        System.out.print("length of line is : "+calculateLength.lengthOfLine());
    }
}
