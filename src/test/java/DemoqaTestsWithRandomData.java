import TestData.TestData;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


@Tag("smoke")
public class DemoqaTestsWithRandomData extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void successfulSearchTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
        registrationPage.openPage()
                .removeBanners();
        });
        step("Заполняем форму", () -> {
            registrationPage.setFirstName(testData.firstName)
                    .setLastName(testData.lastName)
                    .setUserEmail(testData.userEmail)
                    .setUserNumber(testData.userPhone)
                    .setUserGenter(testData.userGenter)
                    .setUserHobby(testData.userHobby)
                    .userSelectPicture(testData.userSelectPicture)
                    .setUserAddress(testData.userAddress)
                    .selectUserState(testData.userState)
                    .selectUserCity(testData.userCity)
                    .setSubject(testData.userSubjects)
                    .dateOfBirth(testData.userDateOfBirth, testData.userMonth, testData.userYear)
                    .submitButton();
        });
        step("Проверяем заполнение данных в форме", () -> {
            registrationPage.checkResult("Student Name", testData.firstName + " " + testData.lastName)
                    .checkResult("Student Email", testData.userEmail)
                    .checkResult("Gender", testData.userGenter)
                    .checkResult("Mobile", testData.userPhone)
                    .checkResult("Date of Birth", testData.userDateOfBirth + " " + testData.userMonth + "," + testData.userYear)
                    .checkResult("Subjects", testData.userSubjects)
                    .checkResult("Hobbies", testData.userHobby)
                    .checkResult("Picture", testData.userSelectPicture)
                    .checkResult("Address", testData.userAddress)
                    .checkResult("State and City", testData.userState + " " + testData.userCity);
        });
        }


    @Test
    void minimalSuccessfulSearchTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            registrationPage.openPage();
        });
        step("Заполняем форму", () -> {
                registrationPage.setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserGenter(testData.userGenter)
                .setUserNumber(testData.userPhone)
                .submitButton();
        });
        step("Проверяем заполнение данных в форме", () -> {
            registrationPage.checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Gender", testData.userGenter)
                .checkResult("Mobile", testData.userPhone);
        });

    }

    @Test
    void testRegistrationWithInvalidInput() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
        registrationPage.openPage();
        });
        step("Заполняем форму", () -> {
            registrationPage.setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserGenter(testData.userGenter)
                .submitButton();
        });
        step("Проверяем бордер не заполненных полей", () -> {
            registrationPage.colorBorderInputUsernumber("border-color:#dc3545");
        });
        }


    }





