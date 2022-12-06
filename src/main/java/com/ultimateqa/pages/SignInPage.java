package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    //Verify text
    By welcomeText = By.xpath("//h1[text() = 'Welcome Back!']");
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    By emailField = By.id("user[email]");
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    By passwordField = By.id("user[password]");
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    By singInButton = By.xpath("//button[contains(text(),'Sign in')]");
    public void clickOnSignButton(){
        try{
            Thread.sleep(500);
           clickOnElement(singInButton);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    By errorMessage = By.className("form-error__list-item");
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
