package org.example.gui.steps;


import lombok.extern.slf4j.Slf4j;
import org.example.gui.base.GuiBase;
import org.example.gui.helpers.urls.Urls;
import org.example.gui.pages.Starbucks;

@Slf4j
public class StarbucksSteps extends GuiBase {

    Starbucks star = new Starbucks();

    Urls urls = new Urls();


    public void openStarbucksHomePage(){
        this.navigateTo(urls.starbucks);
        log.info("SAKAM MILICIA");
        System.out.println("susissugfewrgfew");
    }

    public void isAtFullPage(){
        this.isVisible(star.getCards(), 10);
    }

    public void isAtMobilePage(){
        this.isVisible(star.getHamburgerMenu(), 10);
    }

    public void clickOrder(){
        this.clickElement(star.getOrder());
        log.info("Order clicked");
    }

    public void clickCards(){
        this.clickElement(star.getCards());
        log.info("Cards clicked");
    }

    public void clickOrderMobile(){
        this.clickElement(star.getOrderMobile());
    }

    public void clickHamburger(){
        this.clickElement(star.getHamburgerMenu());
    }

    public void clickHotCoffee(){
        this.clickElement(star.getHotDrinks());
    }

    public void clickRefresh(){ this.clickElement(star.getRefreshBtn());}

    public void clickAllProducts(){ this.clickElement(star.getAllProducts());}

    public void clickAgree(){
        this.clickElement(star.getAgreeBtn());
    }



}
