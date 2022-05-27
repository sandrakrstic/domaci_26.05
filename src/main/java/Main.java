import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandra\\kurs_qa\\hromdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kupujemprodajem.com/");
        driver.findElement(By.className("kpBoxCloseButton")).click();
        WebElement element= driver.findElement(By.id("searchKeywordsInput"));
        element.sendKeys(new String("iphone 13"));
        driver.findElement(By.className("searchButton")).click();


    }
}
