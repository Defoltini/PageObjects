import TestData.TestData;
import org.junit.jupiter.api.Test;


public class DemoqaTestsWithRandomData extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();


    @Test
    void successfulSearchTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFirstName(testData.firstName)
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
                .submitButton()
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.userEmail)
                .checkResult("Gender", testData.userGenter)
                .checkResult("Mobile", testData.userPhone)
                .checkResult("Date of Birth", testData.userDateOfBirth + " " + testData.userMonth + "," + testData.userYear)
                .checkResult("Subjects", testData.userSubjects)
                .checkResult("Hobbies", testData.userHobby)
                .checkResult("Picture", testData.userSelectPicture)
                .checkResult("Address", testData.userAddress)
                .checkResult("State and City", testData.userState + " " + testData.userCity);


    }

    @Test
    void minimalSuccessfulSearchTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserGenter(testData.userGenter)
                .setUserNumber(testData.userPhone)
                .submitButton()
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Gender", testData.userGenter)
                .checkResult("Mobile", testData.userPhone);

    }

    @Test
    void testRegistrationWithInvalidInput() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserGenter(testData.userGenter)
                .submitButton()
                .colorBorderInputUsernumber("border-color:#dc3545");


    }

}

