package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//span[contains(text(),'Форум')])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//span[@class='mw-page-title-main'])[1]");
    }

}
