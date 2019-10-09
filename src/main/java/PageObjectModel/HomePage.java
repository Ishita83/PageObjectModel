package PageObjectModel;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    String text = "Pappu";
    private By _registerLink = By.xpath("//a[@class=\"ico-register\"]");

    public void clickOnRegistrationButton(){

        clickelements(_registerLink);
    } }

