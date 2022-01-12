package HomeWork16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThirdTest {

    MathFunction sum = new MathFunction();
    MathFunction mult = new MathFunction();

    @DataProvider(name = "dataProviderInt")
    public Object[][] dataProviderIntMethod() {

        return new Object[][]{
                {sum.sumOfValues(1, 2), 50},//test should be failed
                {mult.MultiplyOfValues(5, 6), 30},
        };
    }

    @Test(dataProvider = "dataProviderInt", groups = "DP")
    public void dpIntMethod(int values, int totalResult){
        if (values == totalResult){
            System.out.println("Test was successfully passed.");
        }else {
            System.out.println("Test was failed.");
        }
    }

    @DataProvider(name = "dataProviderDouble")
    public Object[][] dataProviderDoubleMethod(){
            return new Object[][]{
                    {sum.SumOfDoubles(1.5, 5), 6.5},
                    {mult.MultiplyDoubles(2.1, 3.2), 100} //test should be failed
            };
    }
    @Test(dataProvider = "dataProviderDouble", groups = "DP")
    public void dpDoubleMethod(double values, double result){
        if (values == result){
            System.out.println("Test was successfully passed.");
        }else {
            System.out.println("Test was failed.");
        }
    }
}
