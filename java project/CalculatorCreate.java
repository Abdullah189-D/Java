import java.io.File;
import java.io.IOException;
public class CalculatorCreate
{
    public static void CreateCal() throws IOException
    {
        File file1 = new File("Calculator.txt") ;
        if(file1.createNewFile())
        { System.out.println((file1.getName())+" :CALCULATOR FILE EXITS!!") ; }
        else System.out.println("CALCULATOR FILE DOESNT EXITS") ;
    }
}