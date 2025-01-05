import org.junit.jupiter.api.Test;

public class DemoqaTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
     void successfulSearchTest() {
        registrationPage.openPage()
                .setFirstName("Anastasia")
                .setLastName("Lyuleva")
                .setUserEmail("nesti-1998@mail.ru")
                .setUserNumber("8920012784")
                .setUserGenter("Female")
                .setUserHobby("Sports")
                .userSelectPicture("Енот.jpg")
                .setUserAddress("г.Нижний Новгород")
                .selectUserState("NCR")
                .selectUserCity("Delhi")
                .setSubject("Maths")
                .dateOfBirth("14", "February", "2006")
                .submitButton()
                .checkResult("Student Name", "Anastasia Lyuleva")
                .checkResult("Student Email", "nesti-1998@mail.ru")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "8920012784")
                .checkResult("Date of Birth", "14 February,2006")
                .checkResult("Subjects", "Maths")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "Енот.jpg")
                .checkResult("Address", "г.Нижний Новгород")
                .checkResult("State and City", "NCR Delhi");


    }
    @Test
    void minimalSuccessfulSearchTest() {
        registrationPage.openPage()
                .setFirstName("Anastasia")
                .setLastName("Lyuleva")
                .setUserGenter("Female")
                .setUserNumber("8920012784")
                .submitButton()
                .checkResult("Student Name", "Anastasia Lyuleva")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "8920012784");

    }

    @Test
    void testRegistrationWithInvalidInput() {
        registrationPage.openPage()
                 .setFirstName("Anastasia")
                .setLastName("Lyuleva")
                .setUserGenter("Female")
                .submitButton()
                .colorBorderInputUsernumber("border-color:#dc3545");


    }

}
