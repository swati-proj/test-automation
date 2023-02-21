package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class balance {

    @BeforeSuite
    public void launchURL(){
        System.out.println("Before Suite");
    }
    @Parameters({"URL"})
    @Test
    public void url(String urlName){
        System.out.println("Application");
        System.out.println(urlName);
    }

    @Test
    public void homeLoan(){
        System.out.println("home loan");
    }
}
