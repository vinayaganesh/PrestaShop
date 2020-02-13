package com.company;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrestaShop {
        static WebDriver driver = new ChromeDriver();
      //  WebElement homeButton = driver.findElement(By.linkText("Home"));

    @BeforeClass
    public static void setUp(){
        System.out.println("Before Class -- SetUp");
        driver.get("http://automationpractice.com/index.php\n");
    }

    @Before
    public void home(){
        System.out.println("Before-- GoHome");
       // homeButton.click();
    }

    @Test
    public void userStory1() throws InterruptedException {
        System.out.println("Test1--US1--Search Blouse");
        driver.findElement(By.linkText("Women")).click();
        //driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]")).click();
        driver.findElement(By.xpath("//a[@class='subcategory-name'][contains(text(),'Blouses')]")).click();
        driver.findElement(By.xpath("//i[@class='icon-th-large']")).click();
    }

    @Test
    public void userStory2(){
        System.out.println("Test1--US2--25%");
        driver.findElement(By.xpath("//div[@id='htmlcontent_top']//li[@class='htmlcontent-item-1 col-xs-4']//img[@class='item-img']")).click();
    }

    @Test
    public void userStory3(){
        System.out.println("Test1--US3--Search Dress");
        driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
        driver.findElement(By.xpath("//input[@id='search_query_top']")).getText();
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
    }

    @Test
    public void userStory4(){
        System.out.println("Test1--US4");

    }

    @Test
    public void userStory5(){
        System.out.println("Test1--US5");

    }

}
