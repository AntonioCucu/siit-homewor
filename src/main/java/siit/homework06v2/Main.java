package siit.homework06v2;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        BigDecimal result = null;

        Scanner in = new Scanner(System.in);

        System.out.println("What's the equation?");
        String input = in.nextLine();
        input.toLowerCase();

        System.out.println("What unit measure to calculate in?");
        String unit = in.next();

        if(unit.contains("mm")) {

            String replaceString = input.replace("mm","*1" );
            String replaceString1 = replaceString.replace("cm","*10" );
            String replaceString2 = replaceString1.replace("m","*1000" );
            String replaceString3 = replaceString2.replace("km","*1000000" );

            String finalString = replaceString3.replaceAll("\\s+","");

            Expression expression = new Expression(finalString);
            expression.setPrecision(12);
            result = expression.eval();
            System.out.println(result + " mm");


        } else if(unit.contains("cm")) {

            String replaceString = input.replace("mm","*0.1" );
            String replaceString1 = replaceString.replace("cm","*1" );
            String replaceString2 = replaceString1.replace("m","*100" );
            String replaceString3 = replaceString2.replace("km","100000" );

            String finalString = replaceString3.replaceAll("\\s+","");

            Expression expression = new Expression(finalString);
            expression.setPrecision(12);
            result = expression.eval();
            System.out.println(result + " cm");

        } else if(unit.contains("m")) {

            String replaceString = input.replace("mm", "*0.001");
            String replaceString1 = replaceString.replace("cm", "*0.01");
            String replaceString2 = replaceString1.replace("m", "*1");
            String replaceString3 = replaceString2.replace("km", "*1000");

            String finalString = replaceString3.replaceAll("\\s+","");

            Expression expression = new Expression(finalString);
            expression.setPrecision(12);
            result = expression.eval();
            System.out.println(result + " m");

        } else if(unit.contains("km")) {

            String replaceString = input.replace("mm", "*0.000001");
            String replaceString1 = replaceString.replace("cm", "*0.00001");
            String replaceString2 = replaceString1.replace("m", "*0.001");
            String replaceString3 = replaceString2.replace("km", "*1");

            String finalString = replaceString3.replaceAll("\\s+","");

            Expression expression = new Expression(finalString);
            expression.setPrecision(12);
            result = expression.eval();
            System.out.println(result + " km");

        }
    }
}
