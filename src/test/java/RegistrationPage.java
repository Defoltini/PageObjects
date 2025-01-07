import Components.CalendarComponent;
import Components.CheckingForm;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {



    public SelenideElement firstNameInput = $("[id=firstName]"),
    lastNameInput = $("#lastName"),
    userEmailInput=$("#userEmail"),
    userNumberInput=$("#userNumber"),
    userGenterSelect=$("#genterWrapper"),
    userHobbySelect=$("#hobbiesWrapper"),
    selectPicture=$("#uploadPicture"),
    userAddress = $("#currentAddress"),
    userState= $("#state"),
    userCity= $("#city"),
    subjectInput=$("#subjectsInput"),
    dateOfBirthInput=$("#dateOfBirthInput"),
    submitBtn=$("#submit");


    CalendarComponent calendarComponent = new CalendarComponent();
    CheckingForm checkingForm = new CheckingForm();

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public RegistrationPage removeBanners (){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value){
    firstNameInput.setValue(value);
        return this;
    };
    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    };
    public RegistrationPage setUserEmail(String value){
        userEmailInput.setValue(value);
        return this;
    };
    public RegistrationPage setUserNumber(String value){
        userNumberInput.setValue(value);
        return this;
    };
    public RegistrationPage setUserGenter(String value){
        userGenterSelect.$(byText(value)).click();
        return this;
    };
    public RegistrationPage setUserHobby(String value){
        userHobbySelect.$(byText(value)).click();
        return this;
    };
    public RegistrationPage userSelectPicture(String value){
        selectPicture.uploadFromClasspath(value);
        return this;
    };
    public RegistrationPage setUserAddress(String value){
        userAddress.setValue(value);
        return this;
    };
    public RegistrationPage selectUserState(String value){
        userState.click();
        userState.$(byText(value)).click();
        return this;
    };
    public RegistrationPage selectUserCity(String value){
        userCity.click();
        userCity.$(byText(value)).click();
        return this;
    }
    public RegistrationPage setSubject(String value) {
        subjectInput.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage dateOfBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public RegistrationPage submitButton() {
        submitBtn.click();
        return this;
    }
    public RegistrationPage checkResult(String text, String value) {
       checkingForm.checkingTable(text, value);
        return this;
    }
    public RegistrationPage colorBorderInputUsernumber(String value) {
        userNumberInput.getCssValue(value);
        return this;
    }
    }

