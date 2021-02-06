import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
    public class CalculatorWriteAndRead extends CalculatorCreate {
        public static void filewritandread() throws InputMismatchException, IOException , FileNotFoundException
        {
            Scanner obj = new Scanner(System.in);
            FileWriter file = new FileWriter("Calculator.txt") ;
            System.out.println("PRESS (+) FOR ADDITION");
            System.out.println("PRESS (-) FOR SUBTRACTION");
            System.out.println("PRESS (*) FOR MULTIPLICATTION");
            System.out.println("PRESS (/) FOR DIVISION");
            System.out.println("PRESS (%) FOR REMINDER");
            System.out.println("PRESS (X^2) FOR SQUARE");
            System.out.println("PRESS (X^3) FOR QUBE");
            System.out.println("PRESS (X^4) FOR X TO THE POWER 4");
            System.out.println("PRESS (log) FOR LOGARITHM");
            System.out.println("PRESS (log10) FOR LOGARITHM 10");
            System.out.println("PRESS (exp) FOR EXPONENTIAL");
            System.out.println("PRESS (100%) FOR PERCENATAGE");
            System.out.println("\n\n\n\n\n");
            System.out.println("PRESS ENTER TAKE THE OPTION: ");
            String N = obj.next();
            file.write("\t\t-----------------CASIO----------------\n");
            switch(N)
            {
                case "+" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextDouble();
                    System.out.println("ENTER THE 2ND NUMBER: ");
                    double  n2 = obj.nextDouble();
                    file.write("--------------SUMMESION-------------\n");
                    output = n1 + n2 ;
                    file.write(n1+" "+N+" "+n2+" = "+output);
                    break ;
                }
                case "-" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double  n1 = obj.nextDouble();
                    System.out.println("ENTER THE 2ND NUMBER: ");
                    double  n2 = obj.nextDouble();
                    file.write("--------------SUBTRACTION-------------\n");
                    output = n1 - n2 ;
                    file.write(n1+" "+N+" "+n2+" = "+output);
                    break ;
                }
                case "*" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextDouble();
                    System.out.println("ENTER THE 2ND NUMBER: ");
                    double n2 = obj.nextDouble();
                    file.write("--------------MULTIPLICATION-------------\n");
                    output = n1 * n2 ;
                    file.write(n1+" "+N+" "+n2+" = "+output);
                    break ;
                }
                case "/" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double  n1 = obj.nextDouble();
                    System.out.println("ENTER THE 2ND NUMBER: ");
                    double  n2 = obj.nextDouble();
                    file.write("--------------DIVISION-------------\n");
                    output = n1 / n2 ;
                    file.write(n1+" "+N+" "+n2+" = "+output);
                    break ;
                }
                case "%" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextDouble();
                    System.out.println("ENTER THE 2ND NUMBER: ");
                    double n2 = obj.nextDouble();
                    file.write("--------------REMINDER-------------\n");
                    output = n1 % n2 ;
                    file.write(n1+" "+N+" "+n2+" = "+output);
                    break ;
                }
                case "X^2" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextInt();
                    file.write("--------------SQAURE-------------\n");
                    output = Math.pow(n1,2) ;
                    file.write(n1+" TO THE POWER "+2+" = "+output);
                    break ;
                }
                case "X^3" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextDouble();
                    file.write("--------------QUBE-------------\n");
                    output = Math.pow(n1,3) ;
                    file.write(n1+" TO THE POWER "+3+" = "+output);
                    break ;
                }
                case "X^4" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextDouble();
                    file.write("--------------X TO THE POWER 4-------------\n");
                    output = Math.pow(n1,4) ;
                    file.write(n1+" TO THE POWER "+4+" = "+output);
                    break ;
                }
                case "log" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double n1 = obj.nextDouble();
                    file.write("--------------LOGARITHM-------------\n");
                    output = Math.log(n1);
                    file.write(n1+" log = "+output);
                    break ;
                }
                case "log10" :
                {
                    double output ;
                    System.out.println("ENTER THE NUMBER: ");
                    double n1 = obj.nextDouble();
                    file.write("--------------LOGARITHM 10-------------\n");
                    output = Math.log10(n1);
                    file.write(n1+" log10 = "+output);
                    break ;
                }
                case "exp" :
                {
                    double output ;
                    System.out.println("ENTER THE NUMBER: ");
                    double n1 = obj.nextDouble();
                    file.write("--------------EXPONENTIAL-------------\n");
                    output = Math.exp(n1) ;
                    file.write(n1+" EXPONENTIAL "+ " = " +output);
                    break ;
                }
                case "100%" :
                {
                    double output ;
                    System.out.println("ENTER THE 1ST NUMBER: ");
                    double  n1 = obj.nextDouble();
                    System.out.println("ENTER THE 2ND NUMBER: ");
                    double n2 = obj.nextDouble();
                    file.write("--------------PERCENTAGE-------------\n");
                    output = (n1 * n2)/100 ;
                    file.write(" ( "+n1+" % "+n2+" ) / 100 = "+output);
                    break ;
                }
                case "Off" :
                {
                    System.out.println("OFF");
                    System.out.println("PRESS THE CALCULATOR AGAIN");
                }
            }
            file.close();
            try
            {
                FileReader fr = new FileReader ("Calculator.txt");
                BufferedReader br = new BufferedReader(fr);
                Scanner readd = new Scanner(br);
                while(readd.hasNext())
                {
                    String calculator = readd.nextLine();
                    System.out.println(calculator);
                }
                readd.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }