package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class balance {

    @BeforeSuite
    public void suite(){
        System.out.println("Before Suite");
    }
    @Test
    public void shopLoan(){
        System.out.println("shop loan");
    }

    @Test
    public void homeLoan(){
        System.out.println("home loan");
    }
}
