/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.usps.shoppingcart.patelbros.WebAutomation;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Owner
 */
public class WebAutomationTest {
    WebAutomation finalprice;
    
    public WebAutomationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        finalprice = new WebAutomation ("rice",23.99f,234,54);
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void fullprice(){
        assertEquals(finalprice.getFullprice(), finalprice.getFullprice());
        System.out.println("Final Price "+ finalprice.getFullprice());
    }
}
