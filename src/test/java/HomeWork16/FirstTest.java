package HomeWork16;

import org.testng.annotations.*;

public class FirstTest {

    public MathFunction sum = new MathFunction();
    public MathFunction multiply = new MathFunction();

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Annotation = BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Annotation = BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Annotation = BeforeClass");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("Annotation = BeforeGroup");
    }

    @BeforeMethod(groups = "smokeTest")
    public void beforeMethod() {
        System.out.println("BeforeMethod of FirstTestClass");
    }

    @Test(groups = "smokeTest")
    public void firstTest() {
        System.out.println("This is first smoke test: ");
        if (sum.sumOfValues(5, 7) == 12) {
            System.out.println("First smoke test has been passed successfully, result is correct.");
        } else {
            System.out.println("First smoke test has been failed, result is incorrect.");
        }
    }

    @Test(groups = "smokeTest")
    public void secondTest() {
        System.out.println("This is second smoke test: ");
        if (multiply.MultiplyOfValues(4, 6) == 24) {
            System.out.println("Second smoke test has been passed successfully, result is correct.");
        } else {
            System.out.println("Second smoke test has been failed, result is incorrect.");
        }
    }

    @Test(groups = "regressionTest")
    public void firstRegTest() {
        System.out.println("This is first regression test: ");
        if (sum.SumOfDoubles(1.1, 2.5) == 3.6) {
            System.out.println("First regression test has been passed successfully, result is correct.");
        } else {
            System.out.println("First regression test has been failed, result is incorrect.");
        }
    }

    @Test(groups = "regressionTest")
    public void secondRegTest() {
        System.out.println("This is second regression test: ");
        if (multiply.MultiplyDoubles(1.5, 3.5) == 5.25) {
            System.out.println("Second regression test has been passed successfully, result is correct.");
        } else {
            System.out.println("Second regression test has been failed, result is incorrect.");
        }
    }

    @AfterMethod(groups = "smokeTest")
    public void afterMethod() {
        System.out.println("AfterMethod of FirstTestClass");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("Annotation = AfterGroup");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Annotation = AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Annotation = AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Annotation = AfterSuite");
    }

}
