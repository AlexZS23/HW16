package HomeWork16;

import org.testng.annotations.*;

public class SecondTest {
    public MathFunction sum = new MathFunction();
    public MathFunction multiply = new MathFunction();

    @BeforeSuite(groups = "smoke")
    public void beforeSuite() {
        System.out.println("Annotation = BeforeSuite");
    }

    @BeforeTest(groups = "smoke")
    public void beforeTest() {
        System.out.println("Annotation = BeforeTest");
    }

    @BeforeClass(groups = "smoke")
    public void beforeClass() {
        System.out.println("Annotation = BeforeClass");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("Annotation = BeforeGroup");
    }

    @BeforeMethod(groups = "smoke")
    public void beforeMethod() {
        System.out.println("BeforeMethod of FirstTestClass");
    }

    @Test(groups = "smoke")
    public void firstTest() {
        System.out.println("This is third smoke test: ");
        if (sum.sumOfValues(5, 7) == 100) {
            System.out.println("Third smoke test has been passed successfully, result is correct.");
        } else {
            System.out.println("Third smoke test has been failed, result is incorrect."); //Проверим вывод уведомления
        }
    }

    @Test(groups = "smoke")
    public void secondTest() {
        System.out.println("This is fourth smoke test: ");
        if (multiply.MultiplyOfValues(4, 6) == 24) {
            System.out.println("Fourth smoke test has been passed successfully, result is correct.");
        } else {
            System.out.println("Fourth smoke test has been failed, result is incorrect.");
        }
    }

    @Test(groups = "regression")
    public void firstRegTest() {
        System.out.println("This is first regression test: ");
        if (sum.SumOfDoubles(1.1, 2.5) == 3.6) {
            System.out.println("Third regression test has been passed successfully, result is correct.");
        } else {
            System.out.println("Third regression test has been failed, result is incorrect.");
        }
    }

    @Test(groups = "regression")
    public void secondRegTest() {
        System.out.println("This is second regression test: ");
        if (multiply.MultiplyDoubles(1.5, 3.5) == 5.25) {
            System.out.println("Fourth regression test has been passed successfully, result is correct.");
        } else {
            System.out.println("Fourth regression test has been failed, result is incorrect.");
        }
    }

    @AfterMethod(groups = "smoke")
    public void afterMethod() {
        System.out.println("AfterMethod of FirstTestClass");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("Annotation = AfterGroup");
    }

    @AfterClass(groups = "smoke")
    public void afterClass() {
        System.out.println("Annotation = AfterClass");
    }

    @AfterTest(groups = "smoke")
    public void afterTest() {
        System.out.println("Annotation = AfterTest");
    }

    @AfterSuite(groups = "smoke")
    public void afterSuite() {
        System.out.println("Annotation = AfterSuite");
    }

}
