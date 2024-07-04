package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class input {

    private WebDriver driver;

    public input() {this.driver = Hooks.driver;}

    @Given("Open Website")
    public void open_gogole() {
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
    }

    @Given("I navigated to Input site")
    public void navigate_to_site() {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }

    @When("I add number {string} into the field")
    public void type_in_field(String number){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(number);
    }


}
