package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Java programs");
    }

    @Test(dependsOnMethods = {"reverseString"})
    public void charCount(){
       String s = "javatpoint java programming";
       int c =0;
       for (int i=0;i<s.length();i++){
           if(s.charAt(i) != ' ')
               c++;
           }
        System.out.println(c);
       }

       @BeforeTest
     public void prerequisite(){
           System.out.println("Before programs");
       }

    @Test
    public void reverseString(){
        String str = "selenium";
        String rev=" ";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After programs");
    }
}
