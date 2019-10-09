package PageObjectModel;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage regestrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ReferProductToFriend referProducToFriend = new ReferProductToFriend();
    CheckoutAsGuest checkOutAsGuest = new CheckoutAsGuest();
    CheckoutResultPage checkOutResultPage = new CheckoutResultPage();
    unregisteredUser unregisteredUser = new unregisteredUser();
    BuyProductSuccesfully buyProductSuccessfully = new BuyProductSuccesfully();

    @Test
    public void UserShouldBeAbleToRegisterSuccessfully(){
        homePage.clickOnRegistrationButton();
        //regestrationPage.userShouldRegisterSuccesfully();
        regestrationPage.userShoulsAbleToEnterRegisterationDetail();
        registrationResultPage.toVerifyUserSeeRegisterMassege();
    }
    @Test
    public void userShouldBeAbleToReferProductToFriend(){
        homePage.clickOnRegistrationButton();
        //regestrationPage.userShouldRegisterSuccesfully();
        regestrationPage.userShoulsAbleToEnterRegisterationDetail();
        registrationResultPage.toVerifyUserSeeRegisterMassege();
        referProducToFriend.referProductToFriendAndCheck();
    }
    @Test
    public void guestUserShouldBuyProduct(){
        checkOutAsGuest.guestUserShouldAbleToBuyProduct();
        //  checkOutResultPage.toVerifyUserShouldSeeTheCheckoutMessage();
    }
    @Test
    public void unregisteredUserShouldNotBuyProduct(){

        unregisteredUser.unRegisteredUserCanNotReferProductToFriend();
    }
    @Test
    public void userShouldBeAbleToBuyProductSuccessfully(){
        homePage.clickOnRegistrationButton();
        //regestrationPage.userShouldRegisterSuccesfully();
        regestrationPage.userShoulsAbleToEnterRegisterationDetail();
        registrationResultPage.toVerifyUserSeeRegisterMassege();
        buyProductSuccessfully.registeruserboughtandroidproduct();
    }
}
