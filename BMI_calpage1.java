
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BMI_calpage1 {
    WebDriver driver;

    public BMI_calpage1(WebDriver driver)
    {
       this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goto_url(String url) {
        driver.get(url);


    }

    public String GetTitle() {
        return driver.getTitle();
    }

    public void enter_age_and_gender(String age, String gender)
    {
        driver.findElement(By.xpath("//input[@id='cage']")).clear();
        driver.findElement(By.xpath("//input[@id='cage']")).sendKeys(age);

        //driver.findElement(By.xpath("//input[@id='csex1']")).click();
        if(gender.equalsIgnoreCase("male")){

            //driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
            WebElement male = driver.findElement(By.xpath("//input[@value=\"m\"]"));
            System.out.println(male.isEnabled());
            if (male.isEnabled()==false){

                male.click();
            }
            /*else{
                male.click();
            }*/
        }
       else{

            driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
        }




    }

    public void enter_height_and_weight_(String height, String weight)
    {
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys(height);
        driver.findElement(By.xpath("//input[@id='ckg']")).clear();
        driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys(weight);

    }

    public String getResult() {
        driver.findElement(By.xpath("//input[@type='image']")).click();
        String actual_result = driver.findElement(By.xpath("//div[@class='bigtext']//b")).getText().trim();

        return actual_result;



    }

}



