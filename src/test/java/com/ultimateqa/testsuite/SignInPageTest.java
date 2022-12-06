package com.ultimateqa.testsuite;

import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.SignInPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest {

    SignInPage signInPage = new SignInPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSignInLink();
        String expectedText = "Welcome Back!";
        Assert.assertEquals(signInPage.getWelcomeText(),expectedText,"Welcome Back! text not displayed");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignInLink();
        signInPage.enterEmail("abcdxyz@gmail.com");
        signInPage.enterPassword("123456");
        signInPage.clickOnSignButton();
        String expectedText = "Invalid email or password.";
        Assert.assertEquals(signInPage.getErrorMessage(),expectedText,"Error message is not displayed");

    }
}
