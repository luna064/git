package Task2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunnerTest {
    WebDriver driver;
@Test
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\GreatGod\\Desktop\\AbsaAssessment\\Task_1\\Driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        addUser();
}

public void addUser() throws InterruptedException {

    //first user
    driver.findElement(By.xpath("//*[@ng-click='pop()']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Hope");
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Mokgotho");
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("user1");


    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Pass1");

    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();

    Thread.sleep(300);

    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("admin@mail.com");
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("082555");
    driver.findElement(By.xpath("//*[@ng-click='save(user)']")).click();



    //second user
    Thread.sleep(1300);
    driver.findElement(By.xpath("//*[@ng-click='pop()']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Hope");

    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Mokgotho");
    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("user2");

    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Pass2");

    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();

    Thread.sleep(300);

    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[3]")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("customer@mail.com");
    Thread.sleep(300);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("083444");
    driver.findElement(By.xpath("//*[@ng-click='save(user)']")).click();
}

}
