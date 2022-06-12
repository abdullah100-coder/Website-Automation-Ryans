
package ryans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Ryans {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
"C:\\Users\\abdul\\Downloads\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.ryanscomputers.com/");
driver.manage().window().maximize();

//btn_component_21
Thread.sleep(1000);
driver.findElement(By.linkText("PC Builder")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_brand_9")).click();
Thread.sleep(1000);

//cpu
driver.findElement(By.id("btn_component_21")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_13644")).click();
//Thread.sleep(1000);
//cooler
driver.findElement(By.id("btn_component_33")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_3100")).click();
Thread.sleep(1000);
//motherboard
driver.findElement(By.id("btn_component_22")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_19475")).click();
Thread.sleep(1000);
//ram/memory
driver.findElement(By.id("btn_component_23")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_15827")).click();
Thread.sleep(1000);
//hdd
driver.findElement(By.id("btn_component_25")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_2293")).click();
Thread.sleep(1000);


//graphics
driver.findElement(By.id("btn_component_30")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_16444")).click();
Thread.sleep(1000);
//casing
driver.findElement(By.id("btn_component_26")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_18447")).click();
Thread.sleep(1000);



//optical
driver.findElement(By.id("btn_component_24")).click();
Thread.sleep(1000);
driver.findElement(By.id("btn_add_product_2264")).click();


driver.findElement(By.id("btn_addtocart")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(1000);

String total;
total = driver.findElement(By.id("sum")).getText();
System.out.println("Total Price of the PC = "+total+" tk");
        
    }
}
