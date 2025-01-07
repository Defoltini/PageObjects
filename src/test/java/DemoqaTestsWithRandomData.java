import TestData.TestData;
import org.junit.jupiter.api.Test;

import static TestData.TestData.*;


public class DemoqaTestsWithRandomData extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    void successfulSearchTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userPhone)
                .setUserGenter(userGenter)
                .setUserHobby(userHobby)
                .userSelectPicture(userSelectPicture)
                .setUserAddress(userAddress)
                .selectUserState(userState)
                .selectUserCity(userCity)
                .setSubject(userSubjects)
                .dateOfBirth(userDateOfBirth, userMonth, userYear)
                .submitButton()
                .checkResult("Student Name", firstName + " "+lastName)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", userGenter)
                .checkResult("Mobile", userPhone)
                .checkResult("Date of Birth", userDateOfBirth + " "+ userMonth + ","+userYear)
                .checkResult("Subjects", userSubjects)
                .checkResult("Hobbies", userHobby)
                .checkResult("Picture", userSelectPicture)
                .checkResult("Address", userAddress)
                .checkResult("State and City", userState + " "+ userCity);


    }
    @Test
    void minimalSuccessfulSearchTest() {
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserGenter(userGenter)
                .setUserNumber(userPhone)
                .submitButton()
                .checkResult("Student Name",  firstName + " "+lastName)
                .checkResult("Gender", userGenter)
                .checkResult("Mobile", userPhone);

    }

    @Test
    void testRegistrationWithInvalidInput() {
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserGenter(userGenter)
                .submitButton()
                .colorBorderInputUsernumber("border-color:#dc3545");


    }

}

