package test.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class SeleniumTestMain {

    private static WebDriver driver;
    private final static String EXPECTED_TEXT = "PCR-test visar om du har covid-19 - Folkhälsomyndigheten";

    public static void main(String... args) {
        try {
            initDriver();
//            googleStuff();
            loadIframePage();

            WebElement iFrame = driver.findElement(By.id("iframeResult"));
            driver.switchTo().frame(iFrame);

            System.out.println(driver.findElement(By.xpath("//h1")).getText());

            driver.switchTo().defaultContent();
            System.out.println(iFrame.isDisplayed());
            SearchContext searchContext = iFrame.getShadowRoot();
            searchContext.findElements(By.xpath("//div"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void loadIframePage() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elements");
        driver.findElement(By.id("accept-choices")).click();
    }

    private static void initDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    private static void loadGooglePage() {
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        List<WebElement> buttons =
                driver.findElements(By.tagName("button"));
        buttons.get(3).click();
    }

    private static void googleStuff() {
        loadGooglePage();

        driver.findElement(By.name("q")).sendKeys("test");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        List<WebElement> searchResults =
                driver.findElements(By.xpath("//div[@id='rso' and @data-async-context='query:test']/div//a/h3"));

//            boolean isAllEmpty = searchResults.stream().allMatch(webElement ->
//                    webElement.getText().length() > 0);
        boolean isTextPresent = searchResults.stream().anyMatch(
                webElement -> webElement.getText().equals(EXPECTED_TEXT));

//            List<String> stringList = List.of("abc", "bdefg", "aaaac", "dzzzzzzzz");
//
//            stringList.stream()
//                    .filter(str -> !str.equals("c"))
//                    .filter(str -> !str.equals("d"))
//                    .filter(str -> str.equals("a"))
//                    .forEach(str -> System.out.println(str));
//
//            List<Integer> intList = stringList.stream()
//                    .map(str -> {
//                        return str.length();
//                    }).collect(Collectors.toList());
//            intList.forEach(System.out::println);
//            boolean isTextPresent = false;
//            for (WebElement element : searchResults) {
//                if (element.getText().equals("PCR-test visar om du har covid-19 - Folkhälsomyndigheten")) {
//                    isTextPresent = true;
//                }
//            }

        List<String> dates = driver.findElements(By.xpath("//div[@data-content-feature='1']/div/span/span"))
                .stream()
                .map(webElement -> {
                    String date = webElement.getText();
                    System.out.println(date);
                    return date;
                })
                .collect(Collectors.toList());

        System.out.println("test passed " + isTextPresent);
    }
}
