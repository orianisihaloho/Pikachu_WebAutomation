package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    public String getPokemonName(){
        WebElement labelPokemonName = WebdriverInstance.driver.findElement(By.xpath("//big/b"));
        String PokemonName = labelPokemonName.getText();
        return PokemonName;
    }

    public String getPokemonNumber(){
        WebElement labelPokemonNumber = WebdriverInstance.driver.findElement(By.xpath("//big/a"));
        String PokemonNumber = labelPokemonNumber.getText();
        return PokemonNumber;
    }
}
