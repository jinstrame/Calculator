package javaLab.calculator;

public class FlowCalculator implements Calculator {
    @Override
    public double getSolve(String expr) {
        return 0;
    }

    private boolean isValid(String var) {
        String[] entries = parse(var);

        if (!validSemicolomns(entries)) return false;

        System.out.println(var);

        return false;
    }

    private String[] parse(String var) {
        var = var.replaceAll(" ", "");

        var = var.replaceAll("\\+", " + ");
        var = var.replaceAll("-", " - ");
        var = var.replaceAll("\\*", " * ");
        var = var.replaceAll("/", " / ");
        var = var.replaceAll("\\(", " ( ");
        var = var.replaceAll("\\)", " ) ");
        return var.split(" ");
    }

    private boolean validSemicolomns(String[] entries){
        int k = 0;

        for (String t : entries){
            if (t.equals("(")){
                k++;
                continue;
            }
            if (t.equals(")")){
                k--;
            }
        }
        return k == 0;
    }
}
