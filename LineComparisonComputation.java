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

        int check = getLine1.compareTo(getLine2);
        if(check==0) {
            System.out.print("both line length are equal");
        }else if(check>0) {
            System.out.print("Line1 is Greater than Line2");
        }else{
            System.out.print("Line1 is smaller than Line2");
        }
    }
}
