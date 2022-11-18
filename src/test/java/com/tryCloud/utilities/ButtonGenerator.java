package com.tryCloud.utilities;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.*;


public class ButtonGenerator {


    public static DeckPage deckPage;
    public static LoginPage loginPage;
    public static TalkModulePage talkModulePage;
    public static DashboardPage dashboardPage;
    public static  ContactsPage contactsPage;
    public static FileModulePage fileModulePage;


    public static void setObject() {

        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        if (talkModulePage == null) {
            talkModulePage = new TalkModulePage();
        }
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }

        if(contactsPage == null){
            contactsPage = new ContactsPage();
        }

        if (fileModulePage == null) {
            fileModulePage = new FileModulePage();
        }
        if (deckPage == null) {
            deckPage = new DeckPage();
        }


    }

    public static void resetTheObject() {
        loginPage = null;
        talkModulePage = null;
        dashboardPage = null;
        contactsPage = null;
        deckPage = null;
    }

    public static void setCompenent() {
        resetTheObject();
        setObject();

    }

    public static void click_the_button(String buttonName) {
        setCompenent();
        switch (buttonName) {

            case "eye button":
                loginPage.eyeIMG.click();
                break;
            case " login button":
                loginPage.loginButton.click();
                break;
            case "Customize button":
                dashboardPage.customizeButton.click();
                break;
            case "Set Status button":
                dashboardPage.setStatusButton.click();
                break;
            case "Online Status":
                dashboardPage.onlineStatus.click();
                break;
            case "Set Status Message":
                dashboardPage.setStatusMessage.click();
                break;
            case "Clear status message":
                dashboardPage.clearStatusMessage.click();
                break;
            case "Plus Icon":
                talkModulePage.plusIcon.click();
                break;
            case "participant Icon":
                talkModulePage.paricipantIcon.click();
                break;
            case "Create Conversation":
                talkModulePage.createConversationButton.click();
                break;
            case "Menu Button":
                if (!talkModulePage.plusIcon.isDisplayed()) {
                    talkModulePage.menuButton.click();
                }
                break;
            case "Start Call":
                BrowserUtils.waitFor(2);

                //  BrowserUtils.waitForClickablility(talkModulePage.startCallButton,10);
                talkModulePage.startCallButton.click();
                BrowserUtils.waitFor(3);

                break;

            case "Leave Call":
                BrowserUtils.waitFor(15);

               // BrowserUtils.waitForClickablility(talkModulePage.leaveCallButton, 10);
                talkModulePage.leaveCallButton.click();
                break;
            case "Delete Button":
                talkModulePage.deleteButton.click();
                break;
            case "Yes Button":
                talkModulePage.yesButton.click();
                break;
            case "Promote to Moderator Button":
                talkModulePage.promoteModerator.click();
                break;


            //----------------Followings are furkan' locators
            case "NewContacts_button":
                contactsPage.NewContacts_button.click();
                break;

            //----------------furkan's codes are above

            case "Plus":
                fileModulePage.uploadMenuBtn.click();
                break;
            case "Upload file":
                fileModulePage.uploadFileBtn.click();
                break;
            case "New folder":
                fileModulePage.creatNewFolderBtn.click();
                break;
//-------------------------------Deckpage-----------------------------------------------
            case "the app-deck navigation":
                deckPage.app_deck_navigation_button.click();
                break;
            case "add board":
                deckPage.addBoardButton.click();
                break;
            case "confirm new board":
                deckPage.confirmNewBoard.click();
                break;
            case "on the Decks":
                deckPage.decksIcon.click();
                break;
            case "confirm add list":
                deckPage.confirmAddListButton.click();
                break;
            case "add list":
                deckPage.addListButton.click();
                break;
            case "assign to me":
                deckPage.assignToMeButton.click();
                break;
            case "Move card":
                deckPage.moveCardButton.click();
                break;
            case "Select a board":
                deckPage.selectAboard.click();
                break;
            case "Select a list":
                deckPage.selectAlist.click();
                break;
            case "confirm move card":
                deckPage.confirmMoveCardButton.click();
                break;
            case "Assign a tag to this card...":
                deckPage.inputBoxTag.click();
                break;



        }

    }
}
