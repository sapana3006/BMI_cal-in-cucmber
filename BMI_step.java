package Steps;

import Pages.BMI_calpage1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BMI_step {
    WebDriver driver;
    BMI_calpage1 BMI_calpage1;

    public BMI_step()
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Resources/chromedriver.exe");
        driver = new ChromeDriver();
        BMI_calpage1=new BMI_calpage1(driver);
        driver.manage().window().maximize();

    }


    @Given("I am in BMI calculator page")
    public void i_am_in_bmi_calculator_page()
    {
        BMI_calpage1.goto_url("https://www.calculator.net/bmi-calculator.html?ctype=metric");
        Assert.assertTrue(BMI_calpage1.GetTitle().contains("BMI Calculator"));




    }
    @When("I enter {string}  and {string} in BMI calculator")
    public void i_enter_and_in_bmi_calculator(String age,String gender)
    {
        BMI_calpage1.enter_age_and_gender(age, gender);
    }

    @And("I enter {string} and {string} in  the BMI calculator")
    public void iEnterHeightAndWeightInTheBMICalculator(String height1,String weight) {

        BMI_calpage1.enter_height_and_weight_(height1,weight);


    }


    @Then("I see the result {string}")
    public void i_see_the_result(String expected_result)
    {
        Assert.assertEquals(BMI_calpage1.getResult(),expected_result);

    }




    @Then("close the browser")
    public void close_the_browser()
    {
    driver.close();
    }



}
