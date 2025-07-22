package cl.kibernumacademy.web;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
  private WebDriver driver;

  @BeforeEach
  void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @AfterEach
  void tearDown() {
    if (driver != null)
      driver.quit();
  }

  @Test
  public void buscarInformacionEnGoogle() {
    driver.get("https://www.google.com");
    WebElement campoBusqueda = driver.findElement(By.name("q"));
    campoBusqueda.sendKeys("Automatización con Selenium WebDriver");
    campoBusqueda.submit();

    assertTrue(driver.getTitle().toLowerCase().contains("selenium"));
  }

  @Test
  public void buscarInformacionEnBing() {
    driver.get("https://www.bing.com");
    WebElement campoBusqueda = driver.findElement(By.name("q"));
    campoBusqueda.sendKeys("OpenAI");
    campoBusqueda.submit();

    assertTrue(driver.getTitle().contains("OpenAI"));
  }

}
