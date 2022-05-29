import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandra\\kurs_qa\\hromdriver\\chromedriver_win32" +
                "\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kupujemprodajem.com/");
        driver.findElement(By.className("kpBoxCloseButton")).click();
        WebElement element= driver.findElement(By.id("searchKeywordsInput"));
        element.sendKeys(new String("iphone 13"));
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/form/div[3]/div/div/div[2]/div[2]" +
                "/div[2]/div[1]/input")).click();
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[5]/div/div[3]/div/section[2]/div[1]/div[1]/a")).click();

        WebElement elementO = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[5]/div/div[3]/div/section[2]/div[1]/div[1]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(elementO);
        action.moveToElement(elementO).click().perform();

        System.out.println("Naslov oglasa je onaj koji smo uocili i tokom manuelnog izvodjenja kejsa.");


    }
}
