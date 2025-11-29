package org.example;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtsHomePage {
    public WebDriver driver;

    public MtsHomePage(WebDriver driver, WebElement cookieCancelBtn, WebElement connectionPhone, WebElement connectionSum, WebElement connectionEmail, WebElement internetPhone, WebElement internetSum, WebElement internetEmail, WebElement instalmentScore, WebElement instalmentSum, WebElement instalmentEmail, WebElement arrearsScore, WebElement arrearsSum, WebElement arrearsEmail, WebElement payBtn) {
        this.cookieCancelBtn = cookieCancelBtn;
        this.connectionPhone = connectionPhone;
        this.connectionSum = connectionSum;
        this.connectionEmail = connectionEmail;
        this.internetPhone = internetPhone;
        this.internetSum = internetSum;
        this.internetEmail = internetEmail;
        this.instalmentScore = instalmentScore;
        this.instalmentSum = instalmentSum;
        this.instalmentEmail = instalmentEmail;
        this.arrearsScore = arrearsScore;
        this.arrearsSum = arrearsSum;
        this.arrearsEmail = arrearsEmail;
        this.payBtn = payBtn;
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "div.cookie.show button.cookie__cancel")
    private WebElement cookieCancelBtn;

    @FindBy(css = "section.pay input#connection-phone")
    private WebElement connectionPhone;

    @FindBy(css = "section.pay input#connection-sum")
    private WebElement connectionSum;

    @FindBy(css = "section.pay input#connection-email")
    private WebElement connectionEmail;

    @FindBy(css = "section.pay input#internet-phone")
    private WebElement internetPhone;

    @FindBy(css = "section.pay input#internet-sum")
    private WebElement internetSum;

    @FindBy(css = "section.pay input#internet-email")
    private WebElement internetEmail;

    @FindBy(css = "section.pay input#score-instalment")
    private WebElement instalmentScore;

    @FindBy(css = "section.pay input#instalment-sum")
    private WebElement instalmentSum;

    @FindBy(css = "section.pay input#instalment-email")
    private WebElement instalmentEmail;

    @FindBy(css = "section.pay input#score-arrears")
    private WebElement arrearsScore;

    @FindBy(css = "section.pay input#arrears-sum")
    private WebElement arrearsSum;

    @FindBy(css = "section.pay input#arrears-email")
    private WebElement arrearsEmail;

    @FindBy(css = "section.pay button[type='submit']")
    private WebElement payBtn;

}