package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaHomePage {
    public WikipediaHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "search")
    public WebElement wikiSearchBox;

    @FindBy(name = "go")
    public WebElement wikiSearchBtn;

    @FindBy (id = "firstHeading")
    public WebElement wikiHeader;

    @FindBy (xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/th/div")
    public WebElement wikiImageHeader;

}



