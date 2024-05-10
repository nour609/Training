
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTest {

    @Test
    public void loginTest(){
        System.out.println("Started the test");
        //Create Driver
        WebDriver driver =new ChromeDriver();
        //Open test page
        String url = "the-internet.herokuapp.com/login";
        driver.get(url);
        driver.manage().window().maximize();

        //enter username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");



        //enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");



        //click login button
        WebElement logInButton = driver.findElement(By.tagName("button"));
        logInButton.click();


        //verification:
        // new url

        //logout button is visible
        WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));



        //succesful login message
        WebElement SuccessMessage = driver.findElement(By.cssSelector("flash"));



        System.out.println("Browser Started");


        System.out.println("Page is opened");

        driver.close();
        System.out.println("Test Finished");


    }
}


