package com.company1.LineComparisonComputationUsingOOps;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Comparison computation program");
        LineComparison calculateLength = new LineComparison();
        calculateLength.getUserInputForLine();
        System.out.println("length of line1 is : "+calculateLength.lengthOfLine1());
        calculateLength.getUserInputForLine();
        System.out.println("length of line2 is : "+calculateLength.lengthOfLine2());
        String getLine1=calculateLength.line1+"";
        String getLine2=calculateLength.line2+"";

        boolean checkEquality = getLine1.equals(getLine2);

        if(checkEquality) {
            System.out.print("both line length are equal");
        }else {
            System.out.print("both line length are different");
        }
    }
}
