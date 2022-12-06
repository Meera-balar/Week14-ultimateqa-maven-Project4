package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By signInLink = By.xpath("//li[@class = 'header__nav-item header__nav-sign-in']/a");
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
}
