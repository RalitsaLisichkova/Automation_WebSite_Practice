import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise");

        // Dropdowns with select tag type - static
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        //Select is a Class in Java for static DropDown menu !!! Has many "select" options

        Select dropdown = new Select(staticDropdown);

        //Select by Index
        dropdown.selectByIndex(3);
        // Give the name of selected dropdown
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //Select by Visible Text
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //Select by "value" in HTML
        dropdown.selectByValue("INR");
        //Assertion
        System.out.println(dropdown.getFirstSelectedOption().getText());



    }


}
